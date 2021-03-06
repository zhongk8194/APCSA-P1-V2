import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


import javax.imageio.ImageIO;

public class Star extends MovingThing{
	
	private int speed; 
	private Image image;
	private Graphics window;
	
	public Star()
	{
		super(0,0,30,30);
		//setSpeed(2);
	}

	public Star(int x, int y, int w, int h, int s)
	{
		super(x,y,w,h);
		speed = s;
		try
		{
			image = ImageIO.read(new File("H:\\APCSA\\Starfighter\\star.png"));
		}
		catch(Exception e)
		{
			System.out.println("Error with Star!");
		}
	}
	
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	public int getSpeed() 
	{
		return speed;	
	}
	
	public void move(String direction)
	{
		setY(getY() + getSpeed());
		if(getY() < 0 || getY() > 600)
		{
			 setSpeed(-getSpeed());
		}

	}
	
	public boolean collide(Graphics window, Ship ship)
	{
		boolean touching = false;
		if ( ((ship.getX() >= this.getX() && ship.getX() <= this.getX()+45)
				|| (ship.getX()+50 >= this.getX() && ship.getX()+50 <= this.getX()+45))
				&& ((ship.getY()+55 >= this.getY() && ship.getY()+55 <= this.getY()+50)
				|| (this.getY() <= ship.getY() && ship.getY() <= this.getY()+50)) )
		{
			touching = true;
		}
	
	return touching;
		
	}
	
	public void touched(Ship ship)
	{
		if(ship.getX()>=this.getX())
		{
			this.setSpeed(0);
			window.setColor(Color.black);
			ship.setSpeed(0);
		}
	}
	
	public void draw(Graphics window)
	{
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}
	
	public String toString()
	{
		return "";
	}

}
