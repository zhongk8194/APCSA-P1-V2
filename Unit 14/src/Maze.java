//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;

	public Maze()
	{
		maze = new int [0][0]; 
			
	}

	public Maze(int size, String line)
	{
		exitFound = false; 
		maze = new int[size][size];
		Scanner chopper = new Scanner(line);
		for (int i = 0; i < size; i++){
			for (int a = 0; a < size; a++){
				maze[i][a] = chopper.nextInt();
			}
		}
	
	}

	public void hasExitPath(int r, int c)
	{
		if (r >= 0 && c >= 0 && (r < maze.length) && (c < maze.length) && (maze[r][c] == 1)) {
			if (c == maze.length - 1){
				exitFound = true;
			}
			else 
			{
				int save = maze[r][c];
				maze[r][c] = 0;
				hasExitPath(r + 1, c);
				hasExitPath(r - 1, c);
				hasExitPath(r, c + 1);
				hasExitPath(r, c - 1);
				maze[r][c] = save;
				
			}
		}
		
	}

	public String toString()
	{
		String output = "";
		for (int r = 0; r < maze.length; r++){
			for (int c = 0; c < maze[r].length; c++){
				output += maze[r][c] + " ";
			}
			output += "\n";
		}
		
		if (exitFound = true){
			output += "exit found";
		}
		else 
			output += "exit not found";

		return output;
	}
}