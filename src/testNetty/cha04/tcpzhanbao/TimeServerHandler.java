package testNetty.cha04.tcpzhanbao;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 根据第三章进行的改造
 * 解决拆包粘包问题
 */
public class TimeServerHandler extends ChannelInboundHandlerAdapter {

  private int counter;

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    ByteBuf buf = (ByteBuf) msg;
    byte[] req = new byte[buf.readableBytes()];
    buf.readBytes(req);
    String body = new String(req, "UTF-8").substring(0,req.length
    - System.getProperty("line.separator").length());
    System.out.println("The time server receive order : " + body + " ; the counter is"
    + ++counter);
    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ?
        new java.util.Date(System.currentTimeMillis()).toString() :"BAD ORDER";
    currentTime = currentTime + System.getProperty("line.separator");
    ByteBuf resq = Unpooled.copiedBuffer(currentTime.getBytes());
    ctx.writeAndFlush(resq);
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }

  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
    ctx.close();

  }
}
