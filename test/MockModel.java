import java.awt.image.BufferedImage;

public class MockModel implements ImageInterface  {
  /** Object that will keep track of all that happens inside the model. */
  private StringBuilder log;


  /**
   * Constructor for the mock model that takes information from the test so that we can test whether
   * the controller interacted with the model in the expected way.
   */
  public MockModel( StringBuilder log) {
    this.log = log;
  }

  @Override
  public void save(String filename) {
    log.append("Model Save: " + filename);
  }

  @Override
  public void loadImage(String filename) {
    log.append("Model Load: " + filename);
  }

  @Override
  public BufferedImage getImage() {
    log.append("Model Got Image");
    return null;
  }

  @Override
  public void blur() {
    log.append("Model Blur Called");
  }

  @Override
  public void sharpen() {
    log.append("Model Sharpen Called");
  }

  @Override
  public void greyscale() {
    log.append("Model GreyScale Called");
  }

  @Override
  public void sepia() {
    log.append("Model Sepia Called");
  }

  @Override
  public void dither() {
    log.append("Model Dither Called");
  }

  @Override
  public void mosaic(int seed) {
    log.append("Model Mosaic Called Seeds: " + seed);
  }

  @Override
  public void rainbow(int width) {
    log.append("Model Rainbow Called Width: " + width);
  }

  @Override
  public void checkerboard(int checkerSquareArea) {
    log.append("Model Checkerboard Called Area: " + checkerSquareArea);
  }

  @Override
  public void notifyObserver() {
    log.append("notifyObserver Called");
  }

  @Override
  public void addObserver(ControllerObserver observer) {
    log.append("addObserver Called\n");
  }
}


