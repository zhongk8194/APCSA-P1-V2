//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	private double[] nums;
	
	public Grades(int numberOfGrades) {
		nums = new double[numberOfGrades];
		
	}
	
	public void setGrades() {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			System.out.println("Enter a grade: ");
			double answer = keyboard.nextDouble();
			nums[count] = answer;
			count ++;
	}

	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / nums.length;
	
		return average;
	}

	public String toString() {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++)
			System.out.println("Grade " + i + " :: " + nums[i]);
		return "Average = " + getAverage();
	}
	//toString method



}