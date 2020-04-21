import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MockTests {

  private Features controller;

  private StringBuilder modelLog;
 
  private ImageInterface mockModel;

  private StringBuilder viewLog;

  private ViewInterface mockView;


  @Before
  public void setUp(){

    viewLog = new StringBuilder();

    mockView = new MockView(viewLog);

    modelLog = new StringBuilder();

    mockModel = new MockModel(modelLog);

    controller = new ImageController(mockModel, mockView);


  }

  @Test
  public void testLoad(){
    controller.loadImage("dog.jpg");
    assertEquals("addObserver Called\nModel Load: dog.jpg", modelLog.toString());

  }

  @Test
  public void testSave() {
    controller.save("dog.jpg");
    assertEquals("addObserver Called\nModel Save: dog.jpg", modelLog.toString());
  }

  @Test
  public void testBlur(){
    controller.blur();
    assertEquals("addObserver Called\nModel Blur Called", modelLog.toString());
  }

  @Test
  public void testSharpen(){
    controller.sharpen();
    assertEquals("addObserver Called\nModel Sharpen Called", modelLog.toString());
  }

  @Test
  public void testGreyscale(){
    controller.greyscale();
    assertEquals("addObserver Called\nModel GreyScale Called", modelLog.toString());
  }

  @Test
  public void testMosaic(){
    controller.mosaic(10000);
    assertEquals("addObserver Called\nModel Mosaic Called Seeds: 10000", modelLog.toString());
  }

  @Test
  public void testDither(){
    controller.dither();
    assertEquals("addObserver Called\nModel Dither Called", modelLog.toString());
  }


  @Test
  public void testRainbow(){
    controller.rainbow(100);
    assertEquals("addObserver Called\nModel Rainbow Called Width: 100", modelLog.toString());
  }

  @Test
  public void testCheckerboard(){
    controller.checkerboard(100);
    assertEquals("addObserver Called\nModel Checkerboard Called Area: 100", modelLog.toString());
  }

  @Test
  public void testUpdate(){
    controller.update();
    assertEquals("addObserver Called\nModel Got Image", modelLog.toString());
    assertEquals("Set Commands Called: ImageController@15327b79UpdateView Callednull", viewLog.toString());
  }

}
