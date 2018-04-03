//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed = 5;
   }


   //add the other Paddle constructors
   public Paddle(int xPos, int yPos){
		super(xPos, yPos);
		speed = 5;
	}
   
   public Paddle(int xPos, int yPos, int width, int height){
		super(xPos, yPos, width, height);
		speed = 5;
	}
	
	public Paddle(int xPos, int yPos, int width, int height, Color color){
		super(xPos, yPos, width, height, color);
		speed = 5;
	}
   
   public Paddle(int xPos, int yPos, int speed){
		super(xPos, yPos);
		this.speed = speed;
	}
   
   public Paddle(int xPos, int yPos, int width, int height, int speed){
		super(xPos, yPos, width, height);
		this.speed = speed;
	}
	
	public Paddle(int xPos, int yPos, int width, int height, Color color, int speed){
		super(xPos, yPos, width, height, color);
		this.speed = speed; 
		
	}
	
	public void setSpeed(int s){
		speed = s;
	}
   
	public int getSpeed(){
		return speed;
	}
	   
   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.blue); 
	   setY(getY() - speed); 

	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY() + speed); 

	   draw(window);

   }
   
   public String toString(){ //add a toString() method
	   return super.toString() + " " + speed;
   }
}