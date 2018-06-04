package testNetty.cha11;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;

public class WebSocketServer {
  public void run(int port) throws Exception {
    EventLoopGroup boss = new NioEventLoopGroup();
    EventLoopGroup worker = new NioEventLoopGroup();
    try {
      ServerBootstrap b = new ServerBootstrap();
      b.group(boss, worker).channel(NioServerSocketChannel.class)
          .childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
              ChannelPipeline pipeline = socketChannel.pipeline();
              pipeline.addLast("http-codec",
                  new HttpServerCodec());
              pipeline.addLast("aggregator",
                  new HttpObjectAggregator(65536));
              socketChannel.pipeline().addLast("http-chunked",
                  new ChunkedWriteHandler());
              pipeline.addLast("handler",
                  new WebSocketServerHandler());
            }
          });
      Channel ch = b.bind(port).sync().channel();
      System.out.println("Web socket server started at port:" + port + ".");
      System.out.println("open your broswer and nagivate to http://localhost:" +
          port + '/');
      ch.closeFuture().sync();
    }finally {
      boss.shutdownGracefully();
      worker.shutdownGracefully();
    }
  }

  public static void main(String[] args) throws Exception {
    int port = 8080;
    new WebSocketServer().run(port);

  }
}
