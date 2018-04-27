//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		for (int i = 0; i < size; i++){
			Alien newAlien = new Alien();
			int x = i % 7 * 100 + 75;
			int y = i / 7 * newAlien.getHeight() * 10 - 700;
			newAlien.setPos(x - newAlien.getWidth() / 2, y);
			add(newAlien);
		}
		
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (int i = 0; i < aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i = 0; i < aliens.size(); i++)
		{
			aliens.get(i).move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++)
		{
			for (int x = 0; x < aliens.size(); x++)
			{
				if (shots.get(i).isCollide(aliens.get(x)))
				{
					aliens.remove(x);
					shots.remove(i);
			}
		}

	}

	public String toString()
	{
		return "";
	}
}
