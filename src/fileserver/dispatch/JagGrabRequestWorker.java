package fileserver.dispatch;

import java.io.IOException;
import java.nio.ByteBuffer;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFutureListener;

import fileserver.fs.IndexedFileSystem;
import fileserver.net.jaggrab.JagGrabRequest;
import fileserver.net.jaggrab.JagGrabResponse;
import fileserver.resource.ResourceProvider;
import fileserver.resource.VirtualResourceProvider;

/**
 * A worker which services JAGGRAB requests.
 * 
 * @author Graham
 */
public final class JagGrabRequestWorker extends RequestWorker<JagGrabRequest, ResourceProvider> {

  /**
   * Creates the JAGGRAB request worker.
   * 
   * @param fs
   *          The file system.
   */
  public JagGrabRequestWorker(IndexedFileSystem fs) {
    super(new VirtualResourceProvider(fs));
  }

  @Override
  protected ChannelRequest<JagGrabRequest> nextRequest() throws InterruptedException {
    return RequestDispatcher.nextJagGrabRequest();
  }

  @Override
  protected void service(ResourceProvider provider, Channel channel, JagGrabRequest request) throws IOException {
    ByteBuffer buf = provider.get(request.getFilePath());
    if (buf == null) {
      channel.close();
    } else {
      ChannelBuffer wrapped = ChannelBuffers.wrappedBuffer(buf);
      channel.write(new JagGrabResponse(wrapped)).addListener(ChannelFutureListener.CLOSE);
    }
  }

}
