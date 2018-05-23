package testNetty.cha04.tcpzhanbao;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class TimeClientHandler extends ChannelInboundHandlerAdapter {

  private static final Logger logger = Logger.getLogger(TimeClientHandler.class.getName());

  private int counter;
  private byte[] req;

  public TimeClientHandler(){
   req = ("QUERY TIME ORDER"+System.getProperty("line.separator")).getBytes();
  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) {
    ByteBuf message = null;
    for (int i =0; i < 100 ; i++) {
      message = Unpooled.buffer(req.length);
      message.writeBytes(req);
      ctx.writeAndFlush(message);
    }
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
