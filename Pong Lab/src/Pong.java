//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Tile tiles;
	private Tile2 tiles2;
	private Paddle paddle;
	private Wall wall;
	
	private int level=1;
	
	private boolean[] keys;
	private BufferedImage back;
	

	public Pong()
	{
		
		//ball = new Ball(350,200);
		ball = new BlinkyBall(350,200);
		//ball = new SpeedUpBall(350,200);
		wall = new Wall(0, 770, 10, 550);
		paddle = new Paddle(60, 60, 40, 40, Color.BLACK, 5);
		tiles = new Tile();
		
		keys = new boolean[4];

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
	   if (tiles.getSize() == 30 && level < 2)
	   {
		   tiles2 = new Tile2();
		   level = 2; 
	   }
	   
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
		 
		int x = tiles.removeDeadOnes(ball);
		
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		tiles.drawEmAll(graphToBack);

		if (level == 2)
		{
			tiles2.drawEmAll(graphToBack);
			int y = tiles2.removeDeadOnes(ball);

			if(y==1){
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(y==2){
				ball.setXSpeed(-ball.getXSpeed());
			}

		}

	if(ball.didCollideLeftWall(wall)) {
			
			ball.setXSpeed(-ball.getXSpeed());

		}
			
		if(ball.didCollideRightWall(wall)) {
			
			
			ball.setXSpeed(-ball.getXSpeed());
			
		}
		
		if(ball.didCollideTopWall(wall))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollideBottomWall(wall))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		

		if(ball.didCollidePaddle(paddle)&&ball.didCollidePaddleY(paddle)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if(ball.didCollidePaddle(paddle)&&ball.didCollidePaddleX(paddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
	//	int x = tiles.removeDeadOnes(ball);
		
		if(x==1){
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(x==2){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
	
		//see if the paddles need to be moved
	
		if(keys[0] == true)
		{
			paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			paddle.moveRightAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			paddle.moveDownAndDraw(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
	//	repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
	//	repaint();
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
