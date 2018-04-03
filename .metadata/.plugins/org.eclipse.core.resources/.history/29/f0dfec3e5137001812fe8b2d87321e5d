//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int xPos, int yPos){
		super(xPos, yPos);
		xSpeed = 3; 
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos, int width, int height){
		super(xPos, yPos, width, height);
		xSpeed = 3; 
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos, int width, int height, Color color){
		super(xPos, yPos, width, height, color);
		xSpeed = 3; 
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos, int width, int height, Color color, int xSpeed, int ySpeed){
		super(xPos, yPos, width, height, color);
		this.xSpeed = xSpeed; 
		this.ySpeed = ySpeed;
	}
	   
   //add the set methods
	
	public void setSpeed(int x, int y){
		xSpeed = x;
		ySpeed = y;
	}
	
	public void setXSpeed(int x){
		xSpeed = x;
	}
	
	public void setYSpeed(int y){
		ySpeed = y;
	}
   
	public int getXSpeed(){
		return xSpeed;
	}
	   
   public int getYSpeed(){
	   return ySpeed;
   }

   public void moveAndDraw(Graphics window)
   {
	  draw(window, Color.white); //draw a white ball at old ball location

      setX(getX()+xSpeed);
      setY(getY()+xSpeed); //setY

      draw(window); //draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if (xSpeed == other.getXSpeed() && ySpeed == other.getYSpeed()){
			return true;
		}
		return false;
	}   

   public String toString(){ //add a toString() method
	   return super.toString() + " " + xSpeed + " " + ySpeed;
   }
}