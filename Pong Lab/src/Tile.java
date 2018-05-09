//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block
{
   //instance variables

   public Tile()
   {
	   super(10,10);
       
   }

   //add the other Tile constructors
   public Tile(int x, int y){
	  super(x,y);
	  		 
   }
   public Tile (int x, int y, int wid, int ht){
	   super (x,y,wid,ht);
	   
   }
  
	public Tile(int x, int y, int wid, int ht, Color col){
		super(x,y,wid,ht,col);
		
	}
	

  /** public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY()-speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window,Color.WHITE);
	   setY(getY()+speed);
	   draw(window);

   }**/

   //add get methods
  /** public int getSpeed(){
	   return speed;
   }**/
   
   //add a toString() method
   public String toString(){
	   return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor();
   }
}