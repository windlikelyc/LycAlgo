package testNetty.cha03.init;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class TimeServer {

  public void bind(int port) throws Exception {
    EventLoopGroup bossGroup = new NioEventLoopGroup();
    EventLoopGroup workerGroup = new NioEventLoopGroup();
    try {
      ServerBootstrap b = new ServerBootstrap();
      b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
          .option(ChannelOption.SO_BACKLOG, 1024)
          .childHandler(new ChildChannelHandler());
      ChannelFuture f = b.bind(port).sync();

      f.channel().closeFuture().sync();
    }finally {
      bossGroup.shutdownGracefully();
      workerGroup.shutdownGracefully();
    }
  }

  private class ChildChannelHandler extends ChannelInitializer<SocketChannel>
  {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
      ch.pipeline().addLast(new TimeServerHandler());
    }
  }

  public static void main(String[] args) throws Exception {
    int port = 8080;
    new TimeServer().bind(port);
  }
}
