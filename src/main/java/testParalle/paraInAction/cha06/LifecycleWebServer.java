package testParalle.paraInAction.cha06;

import jdk.nashorn.internal.ir.RuntimeNode;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

import static jdk.nashorn.internal.objects.NativeMath.log;


public class LifecycleWebServer
{
  private static final ExecutorService exec
      = Executors.newFixedThreadPool(100);

  public void start() throws IOException {
    ServerSocket socket = new ServerSocket(80);
    while (!exec.isShutdown()) {
      try {
        final Socket conn = socket.accept();
        exec.execute(
            new Runnable() {
              @Override
              public void run() {
//                handleRequest(conn);
              }
            }
        );
      } catch (RejectedExecutionException e) {
        if (!exec.isShutdown()) {
          log("task submission reject", e);
        }
      }
    }
  }

  public void stop(){
    exec.shutdown();
  }
//
//  void handleRequest(Socket connection) {
//    RuntimeNode.Request request = readRequset(connection);
//    if (!isShutdownRequest(request)) {
//      stop();
//    }
//    else
//      dispatchRequest()
//  }


}
