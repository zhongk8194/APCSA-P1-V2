/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  public static void testNegate()
  {
	  Picture beach = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayscale() 
  {
	  Picture beach = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
	  Picture caterpillar = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVerticalRightToLeft();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture caterpillar = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontal();
	  caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture caterpillar = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorHorizontalBotToTop();
	  caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA\\Unit16\\pixLab\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
 
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
  //  testZeroBlue(); *
  //  testKeepOnlyBlue(); *
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
  //  testNegate();
  //  testGrayscale(); *
    //testFixUnderwater();
    //testMirrorVertical(); *
  //  testMirrorHorizontal(); *
	// testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
   // testMirrorDiagonal();
 //   testCollage(); *
    //testCopy();
  //  testEdgeDetection(); *
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}