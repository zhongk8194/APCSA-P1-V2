//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package lab18e;
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
		Scanner file = new Scanner (new File ("H:\\APCSA\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18e\\lab18e.dat"));
		int size = file.nextInt();
		file.nextLine();
		
		Word2[] wordlist = new Word2[size];
		
		for(int i = 0; i < size; i++){
			wordlist[i] = new Word2(file.nextLine());
		}
		
		for(int i = 0; i < size; i++){
			for(int a = 0; a < size - 1; a++){
				if(wordlist[a].compareTo(wordlist[a + 1]) == 1){
					Word2 one = wordlist[a + 1];
					wordlist[a + 1] = wordlist[a];
					wordlist[a] = one;
				}
			}
		}
		
		for(int i = 0; i < wordlist.length; i++){
			System.out.println(wordlist[i].toString());
		}
	
	}
	
		
		/**int size = file.nextInt();
		file.nextLine();
		
		Word2[] output = new Word2[size];
		int i = 0;
		while (file.hasNextLine()){
			output[i] = new Word2(file.nextLine());
			i++;
			
		}
		Arrays.sort(output);

		for (Word2 j: output){
			System.out.println(j);
			
		}**/
		
		/**int size = file.nextInt();
		Word2[] Array = new Word2[size];
		
		for (int i = 0; i < size; i++){
			Word2 one =  new Word2(file.nextLine());
			if (one.compareTo(new Word2(file.nextLine())) == 1){
				Array[i] = one;
				
			}
		}
		
		Collections.sort(Array);
		
		for (int a = 0; a < size; a++){
			System.out.println(Array[a]);
		}
		

**/



	}
