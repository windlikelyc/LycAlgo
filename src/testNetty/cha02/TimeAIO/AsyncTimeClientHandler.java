package testNetty.cha02.TimeAIO;

import testParalle.cha03.p_r_test.P;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CountDownLatch;

public class AsyncTimeClientHandler implements Runnable,CompletionHandler<Void,AsyncTimeClientHandler> {

  private AsynchronousSocketChannel client;
  private String host;
  private int port;
  private CountDownLatch countDownLatch;

  public AsyncTimeClientHandler(String s, int port) {
    this.host = s;
    this.port = port;
    try {
      client = AsynchronousSocketChannel.open();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {

    countDownLatch = new CountDownLatch(1);
    client.connect(new InetSocketAddress(host, port), this, this);
    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    try {
      client.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void completed(Void result, AsyncTimeClientHandler attachment) {
    byte[] req = "QUERY TIME ORDER".getBytes();
    ByteBuffer byteBuffer = ByteBuffer.allocate(req.length);
    byteBuffer.put(req);
    byteBuffer.flip();
    client.write(byteBuffer, byteBuffer, new CompletionHandler<Integer, ByteBuffer>() {
      @Override
      public void completed(Integer result, ByteBuffer attachment) {

        if (byteBuffer.hasRemaining()) {
          client.write(byteBuffer, byteBuffer, this);
        } else {
          ByteBuffer readbuffer = ByteBuffer.allocate(1024);
          client.read(readbuffer, readbuffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
              attachment.flip();
              byte[] bytes = new byte[attachment.remaining()];
              attachment.get(bytes);
              String body;
              try {
                body = new String(bytes, "UTF-8");
                System.out.println("Now is :" + body);
                countDownLatch.countDown();
              } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
              }
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
              try {
                client.close();
                countDownLatch.countDown();

              } catch (IOException e) {
                e.printStackTrace();
              }
            }
          });
        }
      }

      @Override
      public void failed(Throwable exc, ByteBuffer attachment) {
        System.out.println("wocoa");
      }
    });

  }

  @Override
  public void failed(Throwable exc, AsyncTimeClientHandler attachment) {
    try {
      client.close();
      countDownLatch.countDown();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
