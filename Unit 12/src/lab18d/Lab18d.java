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
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Word[] wordList = new Word[size];
		
		for (int i = 0; i < size; i++){
			wordList[i] = new Word(file.nextLine());
		}
		
		for (int i = 0; i < size; i++){
			for (int a = 0; a < size - 1; a++){
				if (wordList[a].compareTo(wordList[a + 1]) == 1){
					Word one = wordList[a + 1];
					wordList[a + 1] = wordList[a];
					wordList[a] = one;
				}
			}
		}
		
		for (int i = 0; i < size; i++){
			System.out.println(wordList[i].toString());
		}
	

		}
	}
