package testNetty.ch07;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.EventExecutorGroup;

public class EchoClientHandler extends ChannelHandlerAdapter{

  private final int sendNumber;
  public EchoClientHandler(int sendNumber) {
    this.sendNumber = sendNumber;
  }

  @Override
  public void channelActive(ChannelHandlerContext ctx) throws Exception {
    UserInfo [] infos = UserInfo();
    for (UserInfo info : infos) {
      ctx.writeAndFlush(info);
    }
  }

  private UserInfo [] UserInfo(){
    UserInfo[] userInfos = new UserInfo[sendNumber];
    UserInfo userInfo = null;
    for (int i = 0 ; i < sendNumber ; i++) {
      userInfo = new UserInfo();
      userInfo.setAge(i);
      userInfo.setName("ABCDEFG---->" + i);
      userInfos[i] = userInfo;
    }
    return userInfos;
  }

  @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    System.out.println("Client receive the msgpack message : " + msg);
    ctx.write(msg);
  }

  @Override
  public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    ctx.flush();
  }
}
