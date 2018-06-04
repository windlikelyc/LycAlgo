package testNetty.cha03.init;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.EventExecutorGroup;
import testNetty.cha02.TimeNIO.TimeClientHandle;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {

  private static final Logger logger = Logger.getLogger(TimeClientHandler.class.getName());
  private final ByteBuf firstMessage;

  public TimeClientHandler(){
    byte[] req = "QUERY TIME ORDER".getBytes();
    firstMessage = Unpooled.buffer(req.length);
    firstMessage.writeBytes(req);
  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) {
    ctx.writeAndFlush(firstMessage);
  }

  @Override
  public void channelRead(ChannelHandlerContext ctx,Object msg) throws UnsupportedEncodingException {
    ByteBuf buf = (ByteBuf) msg;
    byte[] req = new byte[buf.readableBytes()];
    buf.readBytes(req);
    String body = new String(req, "UTF-8");
    System.out.println("Now is : " + body);
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
    logger.warning("Unexpected excption from downstream  : "
        + cause.getMessage());
    ctx.close();
  }




}
