package fileserver.net.ondemand;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import fileserver.fs.FileDescriptor;
import fileserver.net.ondemand.OnDemandRequest.Priority;

/**
 * A {@link FrameDecoder} for the 'on-demand' protocol.
 * 
 * @author Graham
 */
public final class OnDemandRequestDecoder extends FrameDecoder {

  @Override
  protected Object decode(ChannelHandlerContext ctx, Channel c, ChannelBuffer buf) throws Exception {
    if (buf.readableBytes() >= 4) {
      int type = buf.readUnsignedByte() + 1;
      int file = buf.readUnsignedShort();
      int priority = buf.readUnsignedByte();

      FileDescriptor desc = new FileDescriptor(type, file);
      Priority p = Priority.valueOf(priority);

      return new OnDemandRequest(desc, p);
    }
    return null;
  }

}
