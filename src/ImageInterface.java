import java.awt.image.BufferedImage;

public interface ImageInterface extends Subject {
  /**
   * Save an image to a file.
   *
   * @param filename name of file to save this image to.
   */
  void save(String filename);

  /**
   * Load an image.
   *
   * @param filename filename you are trying to load from
   */
  void loadImage(String filename);

  /**
   * Return a BufferedImage based on the current Image's rgb, width, height.
   * This is to be used to update picture in GUI.
   *
   * @return a BufferedImage based on the current Image's rgb, width, height
   */
  BufferedImage getImage();

  /**
   * Returns a blurred version of this Image.
   *
   * @return a blurred version of this Image.
   */
  void blur();

  /**
   * Returns a sharpened version of this Image.
   *
   * @return a sharpened version of this Image
   */
  void sharpen();

  /**
   * Make an Image greyscale.
   *
   * @return a greyscale version of this image
   */
  void greyscale();

  /**
   * Make an Image sepia
   *
   * @return a sepia version of this image
   */
  void sepia();

  /**
   * Return a dithered version of this Image.
   *
   * @return a dithered version of this Image
   **/
  void dither();

  /**
   * Return a mosaic version of this Image.
   *
   * @param seed the number of seeds that share the same color
   * @return a mosaic version of this Image
   */
  void mosaic(int seed);

  /**
   * Generate a rainbow image based on width.
   *
   * @param width width of the rainbow image
   */
  void rainbow(int width);

  /**
   * Generates a Checkerboard Image based on the checker square area.
   *
   * @param checkerSquareArea square area of the individual squares in the checkerboard
   */
  void checkerboard(int checkerSquareArea);
}
