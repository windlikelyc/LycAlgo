package testNetty.ch07.test61;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

import static io.netty.handler.codec.http.HttpHeaders.setContentLength;
import static io.netty.handler.codec.http.HttpMethod.GET;
import static io.netty.handler.codec.http.HttpResponseStatus.*;

public class HttpFileServerHandler extends
    SimpleChannelInboundHandler<FullHttpRequest>{
  @Override
  protected void messageReceived(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws
      Exception {
//    if (!fullHttpRequest.getDecoderResult().isSuccess()) {
//      sendError(channelHandlerContext, BAD_REQUEST);
//      return;
//    }
//    if (fullHttpRequest.getMethod() != GET) {
//      sendError(channelHandlerContext, METHOD_NOT_ALLOWED);
//      return;
//    }
//    final String uri = fullHttpRequest.getUri();
//    final String path = sanitizeUri(uri);
//    if (path == null) {
//      sendError(channelHandlerContext, FORBIDDEN);
//      return;
//    }
//    File file = new File(path);
//    if (file.isHidden() || !file.exists()) {
//      sendError(channelHandlerContext, NOT_FOUND);
//      return;
//    }
//    if (!file.isFile()) {
//      sendError(channelHandlerContext, FORBIDDEN);
//      return;
//    }
//    RandomAccessFile randomAccessFile = null;
//    try {
//      randomAccessFile = new RandomAccessFile(file, "r");
//    } catch (FileNotFoundException fnfe) {
//      sendError(channelHandlerContext, NOT_FOUND);
//      return;
//    }
//    long fileLength = randomAccessFile.length();
//    HttpResponse response = new DefaultHttpResponse(HttpVersion.HTTP_1_1, OK);
//    setContentLength(response, fileLength);
//    setContentTypeHeader(response, file);
  }
}
