//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number != 0){
			number /= 10; 
			count++;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int numDigits = getNumDigits(number);
		int[] sorted = new int[numDigits];
		
		for (int i = 0; i < numDigits; i++){
			sorted[i] = number % 10;
			number /= 10;
		}
		
		for (int i = 0; i < numDigits; i++){
			for (int a = 0; a < numDigits - 1; a++){
				if (sorted[a] > sorted[a + 1]){
					int hold = sorted[a];
					sorted[a] = sorted[a+1];
					sorted[a + 1] = hold;
				}
			}
		}
		return sorted;
	}
}