package lab18d;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		while (file.hasNextLine()){
			Word one = new Word(file.nextLine());
			while (file.hasNextLine()){
				int num = one.compareTo(new Word(file.nextLine()));
				if (num == 1){
				System.out.println(one);
				}

			}

		}
	}
}