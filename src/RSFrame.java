
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.Frame;
import java.awt.Graphics;

import client.ui.Constants;
import server.ServerConstants;

@SuppressWarnings("serial")
final class RSFrame extends Frame {

  public RSFrame(RSApplet RSApplet_, int width, int height) {
    rsApplet = RSApplet_;
    setTitle(ServerConstants.SERVER_NAME);
    setResizable(false);
    setVisible(true);
    toFront();
    setSize(width + 2 * Constants.WINDOW_EDGE_WIDTH, height + Constants.WINDOW_BAR_HEIGHT + Constants.WINDOW_EDGE_WIDTH);
    setLocationRelativeTo(null);
  }

  @Override
  public Graphics getGraphics() {
    Graphics g = super.getGraphics();
    g.translate(Constants.WINDOW_VIEWPORT_X, Constants.WINDOW_VIEWPORT_Y);
    return g;
  }

  @Override
  public void update(Graphics g) {
    rsApplet.update(g);
  }

  @Override
  public void paint(Graphics g) {
    rsApplet.paint(g);
  }

  private final RSApplet rsApplet;
}
