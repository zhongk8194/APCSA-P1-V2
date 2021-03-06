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

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String> ();
		nouns = new ArrayList<String> ();
		adjectives = new ArrayList<String> ();

	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()) {
				String symbol = file.next();
				if(symbol.equals("#")) {
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
		}
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner file = new Scanner(new File ("C:\\Users\\zhongk8194\\Documents\\GitHub\\APCSA-P1-V2\\Unit 10\\src\\nouns.dat"));
			while (file.hasNextLine()) {
				nouns.add(file.nextLine());
			}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File ("C:\\Users\\zhongk8194\\Documents\\GitHub\\APCSA-P1-V2\\Unit 10\\src\\verbs.dat"));
			while (file.hasNextLine()){
				verbs.add(file.nextLine());
			}
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File ("C:\\Users\\zhongk8194\\Documents\\GitHub\\APCSA-P1-V2\\Unit 10\\src\\adjectives.dat"));
			while (file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
	
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getRandomVerb()
	{
		int rand = (int) (Math.random() *  verbs.size());
		return (String)(verbs.get(rand));
	}
	
	public String getRandomNoun()
	{

		int rand = (int) (Math.random() *  nouns.size());
		return (String)(nouns.get(rand));
	}
	
	public String getRandomAdjective()
	{
		int rand = (int) (Math.random() *  adjectives.size());
		return (String)(adjectives.get(rand));
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}