//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit13\\Unit13-2016\\Unit13-Assignments\\lab15d.dat"));
	
		int size = file.nextInt();
		file.nextLine();
	
	
		for (int i = 0; i < size; i++) {
			String sentence = file.nextLine();
			FancyWords fw = new FancyWords(sentence);
			System.out.println(fw);
		}
			
	}
}