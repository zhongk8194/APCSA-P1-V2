package lab18d;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int getLength(){
		return word.length();
	}
	
	public char getChar(){
		return word.charAt(0);
	}
	
	public int compareTo( Word rhs )
	{
		if (word.length() != rhs.getLength()){
			if (word.length() > rhs.getLength()){
				return 1;
			}
			return -1;
		}
		else if (word.charAt(0) != rhs.getChar()){
			if (word.charAt(0) > rhs.getChar()){
				return 1;
			}
			return -1;
		}
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}