package testNetty.cha11;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.util.CharsetUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

import static io.netty.handler.codec.http.HttpHeaders.isKeepAlive;
import static io.netty.handler.codec.http.HttpHeaders.setContentLength;

public class WebSocketServerHandler extends SimpleChannelInboundHandler<Object>{

  private static final Logger logger = Logger.getLogger(WebSocketServerHandler.class.getName());
  private WebSocketServerHandshaker handshaker;

  @Override
  protected void messageReceived(ChannelHandlerContext ctx, Object msg) throws Exception {
    if (msg instanceof FullHttpRequest) {
      handleHttpRequeset(ctx, (FullHttpRequest) msg);
    } else if (msg instanceof WebSocketFrame) {
      handleWebSocketFrame(ctx, (WebSocketFrame) msg);
    }
  }

  private void handleWebSocketFrame(ChannelHandlerContext ctx, WebSocketFrame frame)
      throws Exception
  {
    if (frame instanceof CloseWebSocketFrame) {
      handshaker.close(ctx.channel(), (CloseWebSocketFrame) frame.retain());
      return;
    }

    if (frame instanceof PingWebSocketFrame) {
      ctx.channel().write(
          new PongWebSocketFrame(frame.content().retain())
      );
      return;
    }

    if (!(frame instanceof TextWebSocketFrame)) {
      throw new UnsupportedOperationException(String.format(
          "%s frame types not supported", frame.getClass().getName())
      );
    }
    String request = ((TextWebSocketFrame) frame).text();
    if (logger.isLoggable(Level.FINE)) {
      logger.fine(String.format("%s received %s", ctx.channel(), request));
    }
    ctx.channel().write(
        new TextWebSocketFrame(request + ",欢迎使用Netty WebSocket 服务" +
            new java.util.Date().toString())
    );
  }


  private void handleHttpRequeset(ChannelHandlerContext ctx, FullHttpRequest req)
  throws  Exception
  {
    if (!req.getDecoderResult().isSuccess()
        || (!"websocket".equals(req.headers().get("Upgrade")))) {
      sendHttpResponse(ctx, req, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST));
      return;
    }

    WebSocketServerHandshakerFactory wsFactory = new WebSocketServerHandshakerFactory(
        "ws://localhost:8080/websocket", null, false
    );
    handshaker = wsFactory.newHandshaker(req);
    if (handshaker == null) {
      WebSocketServerHandshakerFactory.sendUnsupportedWebSocketVersionResponse(ctx.channel());
    }else{
      handshaker.handshake(ctx.channel(), req);
    }
  }

  private void sendHttpResponse(ChannelHandlerContext ctx, FullHttpRequest req, FullHttpResponse res) {
    if (res.getStatus().code() != 200) {
      ByteBuf buf = Unpooled.copiedBuffer(res.getStatus().toString(), CharsetUtil.UTF_8);
      res.content().writeBytes(buf);
      buf.release();
      setContentLength(res, res.content().readableBytes());

    }

    ChannelFuture f = ctx.channel().writeAndFlush(res);
    if (!isKeepAlive(req) || res.getStatus().code() != 200) {
      f.addListener(ChannelFutureListener.CLOSE);
    }
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    cause.printStackTrace();
    ctx.close();
  }
}
