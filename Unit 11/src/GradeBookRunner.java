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

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
	
		String className = file.nextLine();
		int classSize = file.nextInt();file.nextLine();
		
		Class test = new Class(className, classSize);
		
		for (int i = 0; i < classSize; i++){
			String stuName = file.nextLine();
			String studentGrades = file.nextLine();
			test.addStudent(i, new Student(stuName, studentGrades));
		}
			
		out.println("Failure List = " + test.getFailureList(70));
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
		out.println("Class average = " + test.getClassAverage());

		//ArrayList<Class> one = new ArrayList<Class>();
		

		















	}		
}