//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File ("H:\\APCSA\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18e"));
		int size = file.nextInt();
		Word[] Array = new Word[size];
		
		for (int i = 0; i < size; i++){
			Word one =  new Word(file.nextLine());
			if (one.compareTo(new Word(file.nextLine())) == 1){
				Array[i] = one;
				
			}
		}
		
		Collections.sort(Array);
		
		for (int a = 0; a < size; a++){
			System.out.println(Array[a]);
		}
		





	}
}