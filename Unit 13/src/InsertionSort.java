//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{



	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		
		for (int i = 0; i < list.size(); i++){
			int compare = (word).compareTo(list.get(i));
			
			if (compare < 0){
				String temp = list.get(i);
				list.set(i, word);
				list.add(i + 1, temp);
			}
			
			else if (compare > 0){
				String temp = list.get(i);
				list.set(i, word);
				list.add(i - 1, temp);
			}
			
			else 
				list.add(i + 1, word);
		}

	}


	public void remove(String word)
	{
		list.remove(list.indexOf(word));

	}

	public String toString()
	{
		return "";
	}
}