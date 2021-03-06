import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(0);
	      pixelObj.setGreen(0);
	    }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(255 - pixelObj.getRed());
	      pixelObj.setGreen(255 - pixelObj.getGreen());
	      pixelObj.setBlue(255 - pixelObj.getBlue());
	    }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
	    	pixelObj.setRed(average);
	    	pixelObj.setGreen(average);
	    	pixelObj.setBlue(average);
	    }
	  }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				if (pixelObj.getRed() < 24 && pixelObj.getBlue() > 155)
				{
					 pixelObj.setRed(pixelObj.getRed());
					 pixelObj.setBlue(pixelObj.getBlue());
					 pixelObj.setGreen(pixelObj.getGreen());
				}
				else
				{
					pixelObj.setRed(255);
					pixelObj.setBlue(255);
					pixelObj.setGreen(255);
				}
			}
		}
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

 public void mirrorVerticalRightToLeft() 
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
  }
  
 public void mirrorHorizontal()
 {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int width = pixels[0].length;
	 for (int row = 0; row < pixels.length / 2 - 1; row++)
	   {
	   for (int col = 0; col < width - 1; col++)
	   {
		   	topPixel = pixels[row][col];
	        bottomPixel = pixels[pixels.length - 1 - row][col];
	        bottomPixel.setColor(topPixel.getColor());
	      }
	  }  
 }
 
 public void mirrorHorizontalBotToTop()
 {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int width = pixels[0].length;
	 for (int row = pixels.length / 2 - 1; row < pixels.length; row++)
	 {
	   for (int col = 0; col < width - 1; col++)
	   {
		   	topPixel = pixels[row][col];
	        bottomPixel = pixels[pixels.length - 1 - row][col];
	        bottomPixel.setColor(topPixel.getColor());
	    }
	 }
  }
 
 public void mirrorDiagonal()
 {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel firstPixel = null;
	 Pixel secondPixel = null;
	 int width = pixels[0].length;
	 int height = pixels.length;
	 if (width > height){
		 width = (height - 1);
	 }
	 else if (width < pixels.length){
		 height = (width - 1);
	 }
	 
	 for (int row = 0; row < height; row++){
		 for (int col = 0; col < width; col++){
			 firstPixel = pixels[col][row];
			 secondPixel = pixels[row][col];
			 secondPixel.setColor(firstPixel.getColor());
		 }
	 }
 }
 
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count); 
  }
  
  public void mirrorArms()
  {
	  int mirrorPoint = 195;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	    
	  // loop through the rows
	  for (int row = 163; row < mirrorPoint; row++)
	  {
	    // loop from 13 to just before the mirror point
	    for (int col = 100; col < 300; col++)
	    {
	    	leftPixel = pixels[row][col];      
	        rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
	        rightPixel.setColor(leftPixel.getColor()); 
	      }
	  }
  }
  
  public void mirrorGull()
  {
	  int mirrorPoint = 345;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	    
	  // loop through the rows
	  for (int row = 230; row < 320; row++)
	  {
	    // loop from 13 to just before the mirror point
	    for (int col = 235; col < mirrorPoint; col++)
	    {
	    	leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor()); 
	      }
	  }
  }
  
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2 (Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }
  }
  
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
      Picture picture1 = new Picture("beach.jpg");
      Picture picture2 = new Picture("redMotorcycle.jpg");
      this.copy2(picture1, 0, 400, 0, 400);
      this.copy2(picture2, 80, 180, 100, 295);
      this.mirrorVertical();
      this.mirrorHorizontal();
      this.mirrorHorizontalBotToTop();
      this.write("myCollage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
    for (int row = 0; row < pixels.length - 1; row++)
    {
    	for (int col = 0; col < pixels[0].length - 1; col++)
    	{
    		topPixel = pixels[row][col];
    		bottomPixel = pixels[row + 1][col];
    		bottomColor = bottomPixel.getColor();
    		if (topPixel.colorDistance(bottomColor) > edgeDist)
    		{
    			topPixel.setColor(Color.BLACK);
    		}
    		else
    		{
    			topPixel.setColor(Color.WHITE);
    		}
    	}
    }
  }
  
  public void sharpen(int x, int y, int w, int h)
  {
	  System.out.println("Kelly Zhong, Period 1, 4/24/18, Computer # 10");
	  Pixel newPixel = null;
	  Pixel originalPixel = null;
	  Color newColor = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for (int row = y; row < h; row++)
	  {
	    for (int col = x; col < w; col++)
	    {
	    	originalPixel = pixels[row][col];
	    	newPixel = pixels[row - 1][col - 1];
	    	originalPixel.setRed(originalPixel.getRed() + ((originalPixel.getRed() - newPixel.getRed())/2));
	    	originalPixel.setBlue(originalPixel.getBlue() + ((originalPixel.getBlue() - newPixel.getBlue())/2));
	    	originalPixel.setGreen(originalPixel.getGreen() + ((originalPixel.getGreen() - newPixel.getGreen())/2));
	    	if (originalPixel.getRed() > 255)
	    	{
	    		originalPixel.setRed(255);
	    	}
	    	if (originalPixel.getBlue() > 255)
	    	{
	    		originalPixel.setBlue(255);
	    	}
	    	if (originalPixel.getGreen() > 255)
	    	{
	    		originalPixel.setGreen(255);
	    	}
	    	if (originalPixel.getRed() < 0)
	    	{
	    		originalPixel.setRed(0);
	    	}
	    	if (originalPixel.getBlue() < 0)
	    	{
	    		originalPixel.setBlue(0);
	    	}
	    	if (originalPixel.getGreen() < 0)
	    	{
	    		originalPixel.setGreen(0);
	    	}
	    }
	  }
  }
  
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() / 10 == (0 % 3))
				  currPixel.setRed(currPixel.getRed() - 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
				  if (messagePixel.getRed() / 10 == (1 % 3))
				  {
					  messagePixel.setRed(messagePixel.getRed() - 1);
				  }
				  
				  
				  currPixel.setRed(currPixel.getRed() + 1);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
  }
  
	
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
			  {
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
