//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Class
{
	private String name;
	private ArrayList <Student> studentList;
	
	public Class()
	{
		name="";
		studentList= new ArrayList<Student> ();
	}
	
	public Class(String names, int stuCount)
	{
		name = names;
		studentList = new ArrayList<Student> (stuCount);
	
	}
	
	public void addStudent(Student s)
	{
		studentList.add(s);

	}
	
	public void sort(){
		Collections.sort(studentList);
		
	}
	
	public String getClassName()
	{
	   return name;
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.size(); i++){
			classAverage += getStudentAverage(i);
		}
		classAverage = classAverage/ studentList.size();


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index = 0;
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getName() == stuName){
				index = i;
			}
		}

		return getStudentAverage(index);
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i < studentList.size(); i++){
			if (getStudentAverage(i) > high){
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}
		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		/**double low = Double.MAX_VALUE;
		String hName ="";		
		for (int i = 0; i < studentList.size(); i++){
			if (getStudentAverage(i) < low){
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}
		}**/
		sort();
		return studentList.get(studentList.size() - 1).getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		/**String output="";
		for (int i = 0; i < studentList.size(); i++){
			if (studentList.get(i).getAverage() <= failingGrade){
				output += studentList.get(stuNum).getName() + " ";
			}
		}
**/
		sort();
		return studentList.get(0).getName();
	}
	
	public String toString()
	{
		String output=""+ getClassName() +"\n";
		for (int i = 0; i < studentList.size(); i++){
			output = output + studentList.get(i).toString() + "\t" + studentList.get(i).getAverage() + "\n";
		}
		
		return output;
	}  	
}