//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{

		passCount = 0; 
		quickSort(list, 0, list.length - 1);
		System.out.println();

	}


	private static void quickSort(Comparable[] list, int low, int high)
	{

		if (low < high){
			int p = partition(list, low, high);
			System.out.println("pass " + passCount + " " + Arrays.toString(list));
			passCount++; 
			quickSort(list, low, p);
			quickSort(list, p + 1, high);
		}

	}

	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable p = list[low];
		int bot = low - 1;
		int top = high + 1;

		while (bot < top) {
			while (list[++bot].compareTo(p) < 0);
			while (list[--top].compareTo(p) > 0); 
		
			if (bot >= top){
				return top;
			}
			else { 
				Comparable temp = list[top]; 
				list[top] = list[bot]; 
				list[bot] = temp;
			}
		}
		return 0;

	}
}