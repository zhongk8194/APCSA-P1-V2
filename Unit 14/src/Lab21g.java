//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter one = new AtCounter();
		one.countAts(0, 0);
		System.out.print(one.toString());
		out.println("\n");
		
		AtCounter two = new AtCounter();
		two.countAts(2, 5);
		System.out.print(two.toString());
		out.println("\n");
		
		AtCounter three = new AtCounter();
		three.countAts(5, 0);
		System.out.print(three.toString());
		out.println("\n");
		
		AtCounter four = new AtCounter();
		four.countAts(9, 9);
		System.out.print(four.toString());
		out.println("\n");
		
		AtCounter five = new AtCounter();
		five.countAts(3, 9);
		System.out.print(five.toString());
		out.println("\n");

		//test the code
	}
}