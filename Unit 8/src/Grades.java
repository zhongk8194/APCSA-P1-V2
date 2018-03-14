//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Grades
{
	private ArrayList<Double> nums;
	
	public Grades(int numberOfGrades) {
		nums = new ArrayList<Double>(numberOfGrades);
		
	}
	
	public void setGrades() {
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < nums.size(); i++)
			System.out.println("Enter a grade: ");
			double answer = keyboard.nextDouble();
			nums.set(count, answer);
			count ++;
	}

	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < nums.size(); i++)
			sum += nums.get(i);

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum() / nums.size();
	
		return average;
	}

	public String toString() {
		Collections.sort(nums);
		for (int i = 0; i < nums.size(); i++)
			System.out.println("Grade " + i + " :: " + nums.get(i));
		return "Average = " + getAverage();
	}
	//toString method



}