import java.awt.image.BufferedImage;

public class MockView implements ViewInterface {

  /** Object that will keep track of all that happens inside the model. */
  private StringBuilder log;


  /**
   * Constructor for the mock model that takes information from the test so that we can test whether
   * the controller interacted with the model in the expected way.
   */
  public MockView( StringBuilder log) {
    this.log = log;
  }

  @Override
  public void setCommands(Features features) {
    log.append("Set Commands Called: " + features);
  }

  @Override
  public void updateView(BufferedImage image) {
    log.append("UpdateView Called").append(image);
  }
}
