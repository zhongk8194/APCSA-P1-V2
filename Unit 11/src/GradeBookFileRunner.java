//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
	//	out.print("\n\nWhat is the name of this class?");
		String className = file.nextLine();
	//	out.print("\n\nHow many students are in this class?");
		int classSize = file.nextInt();file.nextLine();
		
		Class test = new Class(className, classSize);
		
		for (int i = 0; i < classSize; i++){
			String stuName = file.nextLine();
			String studentGrades = file.nextLine();
			test.addStudent(new Student(stuName, studentGrades));
		}
		
	//	out.println("\n\n"+test);
		test.sort();
		
		out.println("\n\n"+ test);
			
		out.println("Failure List = " + test.getFailureList(70));
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
		out.println("Class average = " + test.getClassAverage());

		
  
		String className2 = "APCSP";
		int classSize2 = 3;
		Class test2 = new Class(className2, classSize2);
		Student first = new Student("Adam", "3 - 90.0 100.0 89.0");
		Student second = new Student("Ava", "3 - 91.0 85.0 92.0");
		Student third = new Student("Aaron", "4 - 78.0 98.0 89.0 93.0");
		test2.addStudent(first);
		test2.addStudent(second);
		test2.addStudent(third);
		
		ArrayList<Class> one = new ArrayList<Class>();
		one.add(test2);
		out.println(one);
		
   }
}