//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		while (file.hasNextLine()){
			System.out.println(file.nextLine());
		}
	
		Class test = new Class();
		String className = "";
		while (!file.hasNextInt()){
			className = className + file.next() + " ";
		}
		












	}		
}