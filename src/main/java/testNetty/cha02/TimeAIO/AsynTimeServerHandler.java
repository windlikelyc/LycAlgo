package testNetty.cha02.TimeAIO;

import testParalle.cha01.Run;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.concurrent.CountDownLatch;

public class AsynTimeServerHandler implements Runnable{

  private int port;
  CountDownLatch c;
  AsynchronousServerSocketChannel asynchronousServerSocketChannel;

  public AsynTimeServerHandler(int port) {
    this.port = port;
    try {
      asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
      asynchronousServerSocketChannel.bind(new InetSocketAddress(port));
      System.out.println("The time server is start in port"+port);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    c = new CountDownLatch(1);
    doAccept();
    try {
      c.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void doAccept() {
    asynchronousServerSocketChannel.accept(this, new
        AcceptCompletionHandler());

  }
}
