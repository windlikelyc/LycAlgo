package testNetty.ch07.test61;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;

public class HttpFileServer {
  private static final String DEFALUT_URL = "/testNetty/ch07/test61";

  public void run(final int port, final String url) throws Exception{
    EventLoopGroup bossGroup = new NioEventLoopGroup();
    EventLoopGroup workerGroup = new NioEventLoopGroup();
    try {
      ServerBootstrap b = new ServerBootstrap();
      b.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
          .childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {
              socketChannel.pipeline().addLast("http-decoder",
                  new HttpRequestDecoder());
              socketChannel.pipeline().addLast("http-aggregator",
                  new HttpObjectAggregator(65536));
              socketChannel.pipeline().addLast("http-encoder",
                  new HttpResponseEncoder());
              socketChannel.pipeline().addLast("http-chunked",
                  new ChunkedWriteHandler());
//              socketChannel.pipeline().addLast("fileServerHandler",
//                  new HttpFileServerHandler(url));
            }
          });
      ChannelFuture future = b.bind("192.168.10.99", port).sync();
      System.out.println("Http starts serve at : http://192.168.1.102");
      future.channel().closeFuture().sync();
    }finally {
      bossGroup.shutdownGracefully();
      workerGroup.shutdownGracefully();
    }
  }

  public static void main(String[] args) throws Exception {
    int port = 8080;
    String url = DEFALUT_URL;
    new HttpFileServer().run(port,url);
  }

}
