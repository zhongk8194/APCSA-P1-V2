//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle Paddle;
	private boolean[] keys;
	private BufferedImage back;
	private ArrayList<Tile> upperTiles;
	private ArrayList<Tile> lowerTiles;
	private ArrayList<Tile> leftTiles;
	private ArrayList<Tile> rightTiles;


	public Pong()
	{
		//set up all variables related to the game
	
		//instantiate a Ball
		//ball = new Ball(350,200);
		ball = new BlinkyBall(350,200);
		//ball = new SpeedUpBall(350,200);
		
		//instantiate a Paddle
		Paddle = new Paddle(60, 60, 40, 40, Color.BLACK, 5);
	
		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		Paddle.draw(graphToBack);

		//see if ball hits left wall or right wall
//!(ball.getX()>=leftPaddle.getX() && ball.getX()+ball.getWidth()<=rightPaddle.getX()+rightPaddle.getWidth())
		if(!(ball.getX()>0 && ball.getX()+ball.getWidth()<getWidth()))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.setXSpeed(-ball.getXSpeed());
		/**	if (ball.getX() <= Paddle.getX()){
				graphToBack.setColor(Color.WHITE);
				
				
			}
			else if (ball.getX() >= Paddle.getX()+Paddle.getWidth()){
				graphToBack.setColor(Color.WHITE);
	
			}
			**/
			
			ball.draw(graphToBack, Color.WHITE);
			//ball = new Ball(350,200);
			ball= new BlinkyBall(350,200);
			//ball = new SpeedUpBall(350,200);
			ball.moveAndDraw(graphToBack);
			
		}

		//see if the ball hits the top or bottom wall 
		if (!(ball.getY()>=0 && ball.getY()<=getHeight())){
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (ball.didCollideLeft(Paddle)|| ball.didCollideRight(Paddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		else if (ball.didCollideTop(Paddle) || ball.didCollideBottom(Paddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		upperTiles = new ArrayList<Tile>();
		lowerTiles = new ArrayList<Tile>();
		leftTiles = new ArrayList<Tile>();
		rightTiles = new ArrayList<Tile>();
		
		for (int i = 0; i < 800; i += 50)
		{
			lowerTiles.add(new Tile(i, 520, 48, 30, Color.darkGray));
			lowerTiles.add(new Tile(i, 480, 48, 30, Color.darkGray));
			upperTiles.add(new Tile(i, 20, 48, 30, Color.pink));
			upperTiles.add(new Tile(i, 60, 48, 30, Color.pink));
			
		}
		
		for (int i = 0; i < 600; i += 50)
		{
			leftTiles.add(new Tile(20, i, 30, 48, Color.lightGray));
			leftTiles.add(new Tile(60, i, 30, 48, Color.lightGray));
			rightTiles.add(new Tile(740, i, 30, 48, Color.red));
			rightTiles.add(new Tile(700, i, 30, 48, Color.red));
			
		}
		
		for (Tile t: upperTiles){
			t.draw(graphToBack);
		}
		for (Tile t: lowerTiles){
			t.draw(graphToBack);
		}
		for (Tile t: leftTiles){
			t.draw(graphToBack);
		}
		for (Tile t: rightTiles){
			t.draw(graphToBack);
		}
		
	
		//see if the paddles need to be moved
	
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			Paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			Paddle.moveDownAndDraw(graphToBack);
			
		}
		if(keys[2] == true)
		{
			Paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			Paddle.moveRightAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=true; break;
			case 'M' : keys[1]=true; break;
			case 'J' : keys[2]=true; break;
			case 'L' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'I' : keys[0]=false; break;
			case 'M' : keys[1]=false; break;
			case 'J' : keys[2]=false; break;
			case 'L' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}