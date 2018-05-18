//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TheGame()
	{ 
		super("PONG");
		setSize(WIDTH,HEIGHT);
		
		Pong game = new Pong();
		
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		TheGame run = new TheGame();
	}
}