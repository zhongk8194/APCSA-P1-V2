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
		
		loadAndAnalyzeFile();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()) {
				String letter = file.next();
				int count = 0;
				for (int i = 0; i < values.length(); i++){
					if (values[i] == letter)
						count ++;
						
				/**if(valuesletter != -1) {
						out.print(getRandomNoun() + " ");
				}
				else if (symbol.equals("@")) {
					out.print(getRandomVerb() + " ");
				}
				else if (symbol.equals("&")) {
					out.print(getRandomAdjective() + " ");
				}
				else
					out.print(symbol + " ");
			}

	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		} **/
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{

		try{
			
			Scanner file = new Scanner(new File (fName));
			while (file.hasNextLine()) {
				nouns.add(file.nextLine());
			}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	






	}

	public char mostFrequent()
	{
		for (int i = 0; i < letters.length)
		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}