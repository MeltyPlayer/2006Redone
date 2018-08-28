package client.ui;

public class Constants {
  // Width/height of the viewport.
  public static final int WINDOW_VIEWPORT_WIDTH = 765, WINDOW_VIEWPORT_HEIGHT = 503;
  // Necessary to account for parts of the frame obscured by the Windows bar
  // at the top and the edges on the sides.
  public static final int WINDOW_EDGE_WIDTH = 4, WINDOW_BAR_HEIGHT = 22;
  public static final int WINDOW_VIEWPORT_X = WINDOW_EDGE_WIDTH, WINDOW_VIEWPORT_Y = WINDOW_BAR_HEIGHT;
  public static final int WINDOW_WIDTH = WINDOW_EDGE_WIDTH + WINDOW_VIEWPORT_WIDTH + WINDOW_EDGE_WIDTH,
      WINDOW_HEIGHT = WINDOW_BAR_HEIGHT + WINDOW_VIEWPORT_HEIGHT + WINDOW_EDGE_WIDTH;
}
