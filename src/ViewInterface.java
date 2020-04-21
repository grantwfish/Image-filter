import java.awt.image.BufferedImage;
import java.util.Scanner;

/**
 * Interface containing all the things the view can do.
 */
public interface ViewInterface {

  void setCommands(Features features);

  // not one of your images
  void updateView(BufferedImage image);

}
