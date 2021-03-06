//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer> ();
		letters = new ArrayList<Character> ();

	}

	public Histogram(char[] values, String fName)
	{
		
		this();
		
		for (int i = 0; i < values.length; i++){
			letters.add(values[i]);
		}
		fileName = fName;
		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(new File ("C:\\Users\\zhongk8194\\Documents\\GitHub\\APCSA-P1-V2\\Unit 10\\src\\" + fileName));
		for (int i = 0; i < letters.size(); i++) {
			int counter = 0;
			while (file.hasNext()){
				String letter = file.next();
				for (int a = 0; a < letter.length(); a++){
					if (letter.charAt(a) == letters.get(i)){
						counter++;
					}
				}
			}
			file.close();
			file = new Scanner(new File ("C:\\Users\\zhongk8194\\Documents\\GitHub\\APCSA-P1-V2\\Unit 10\\src\\" + fileName));
			count.add(counter);
		}
	}
		
	
	public char mostFrequent()
	{
		char letter = letters.get(0);
		int variable = count.get(0);
		for (int i = 0; i < count.size(); i++){
			if (count.get(i) > variable) {
				variable = count.get(i);
				letter = letters.get(i);
			}
	}
		
		return letter;
 
	}

	public char leastFrequent()
	{
		char letter = letters.get(0);
		int variable = count.get(0);
		for (int i = 0; i < count.size(); i++) {
			if (count.get(i) < variable) {
				variable = count.get(i);
				letter = letters.get(i);
			}
		}
		return letter;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}