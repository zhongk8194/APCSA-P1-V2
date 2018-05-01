import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Color color;
	
	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,0);
		
		
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x,y);
		setSpeed(s);
		
		
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void draw( Graphics window )
	{
		//add code to draw the ammo
		//window.setColor(Color.black);
	//	window.fillRect(getX(),getY(),5,5);
		move("");
		window.setColor(Color.yellow);
		window.fillRect(getX(),getY(),5,5);
		

	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
	//	setY(getY()-getSpeed());
		
	}

	public String toString()
	{
		return "";
	}
}