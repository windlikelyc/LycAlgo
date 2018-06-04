package testNetty.cha02.TimeAIO;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AcceptCompletionHandler implements
    CompletionHandler<AsynchronousSocketChannel, AsynTimeServerHandler> {

  @Override
  public void completed(AsynchronousSocketChannel result, AsynTimeServerHandler attachment) {
    attachment.asynchronousServerSocketChannel.accept(attachment, this);

    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
    result.read(byteBuffer, byteBuffer, new ReadCompleteHandler(result));
  }

  @Override
  public void failed(Throwable exc, AsynTimeServerHandler attachment) {
    exc.printStackTrace();
    attachment.c.countDown();
  }
}