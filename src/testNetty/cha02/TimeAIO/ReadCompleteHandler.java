package testNetty.cha02.TimeAIO;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class ReadCompleteHandler implements CompletionHandler<Integer,ByteBuffer> {

  private AsynchronousSocketChannel channel;

  public ReadCompleteHandler(AsynchronousSocketChannel channel) {
    if (this.channel == null) {
      this.channel = channel;
    }

  }

  @Override
  public void completed(Integer result, ByteBuffer attachment) {
    attachment.flip();
    byte[] body = new byte[attachment.remaining()];
    attachment.get(body);
    try{
      String req = new String(body, "UTF-8");
      System.out.println("The time server receive order : " + req);
      String currentime = req.equalsIgnoreCase("QUERY TIME ORDER") ?
          new java.util.Date(System.currentTimeMillis()).toString() : "BAD ";
      doWrite(currentime);
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

  }

  private void doWrite(String currentime) {

    if(currentime != null && currentime.trim().length() > 0) {
      byte[] bytes = currentime.getBytes();
      ByteBuffer byteBuffer = ByteBuffer.allocate(bytes.length);
      byteBuffer.put(bytes);
      channel.write(byteBuffer, byteBuffer, new CompletionHandler<Integer, ByteBuffer>() {
        @Override
        public void completed(Integer result, ByteBuffer attachment) {
          if (byteBuffer.hasRemaining()) {
            channel.write(byteBuffer, byteBuffer, this);
          }
        }

        @Override
        public void failed(Throwable exc, ByteBuffer attachment) {
          try {
            channel.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      });
    }

  }

  @Override
  public void failed(Throwable exc, ByteBuffer attachment) {
    try {
      this.channel.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
