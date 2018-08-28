package client.ui;

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public final class RSImageProducer implements ImageProducer, ImageObserver {

  public RSImageProducer(int width, int height, Component component) {
    this.width = width;
    this.height = height;
    anIntArray315 = new int[width * height];
    colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
    // TODO: Why is this repeated???
    anImage320 = component.createImage(this);
    transferPixelArrayToImage();
    component.prepareImage(anImage320, this);
    transferPixelArrayToImage();
    component.prepareImage(anImage320, this);
    transferPixelArrayToImage();
    component.prepareImage(anImage320, this);
    initDrawingArea();
  }

  public void initDrawingArea() {
    DrawingArea.initDrawingArea(height, width, anIntArray315);
  }

  public void drawGraphics(Graphics g, int x, int y) {
    transferPixelArrayToImage();
    g.drawImage(anImage320, x, y, this);
  }

  @Override
  public synchronized void addConsumer(ImageConsumer imageconsumer) {
    anImageConsumer319 = imageconsumer;
    imageconsumer.setDimensions(width, height);
    imageconsumer.setProperties(null);
    imageconsumer.setColorModel(colorModel);
    imageconsumer.setHints(14);
  }

  @Override
  public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
    return anImageConsumer319 == imageconsumer;
  }

  @Override
  public synchronized void removeConsumer(ImageConsumer imageconsumer) {
    if (anImageConsumer319 == imageconsumer) {
      anImageConsumer319 = null;
    }
  }

  @Override
  public void startProduction(ImageConsumer imageconsumer) {
    addConsumer(imageconsumer);
  }

  @Override
  public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
    System.out.println("TDLR");
  }

  private synchronized void transferPixelArrayToImage() {
    if (anImageConsumer319 != null) {
      anImageConsumer319.setPixels(0, 0, width, height, colorModel, anIntArray315, 0, width);
      anImageConsumer319.imageComplete(2);
    }
  }

  @Override
  public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
    return true;
  }

  public final int[] anIntArray315;
  private final int width, height;
  private final ColorModel colorModel;
  private ImageConsumer anImageConsumer319;
  private final Image anImage320;
}
