//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("H:\\APCSA\\Unit14\\Unit14_2016\\Unit14-Assignments\\Lab24d.dat"));

		int times = file.nextInt();
		file.nextLine();
		
		for (int i = 0; i < times; i++) {
			String game = file.next();
			TicTacToe one = new TicTacToe(game);
			System.out.println(one + one.getWinner() + "\n\n");
			
		}

	}
}



