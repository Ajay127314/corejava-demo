package com.oops;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :25-Oct-2024
*Time   :4:12:27 pm
*Email  :Kalakoti.Reddy@coforge.com
*Program to create class and define state and behavior
*
*Encapsulation
*/
//Instance class
public class Student {
	
	private int rollNumber;
	private String firstName,lastName;
	private float [] marks=new float[5];
	private float total;
	
	Scanner sc=new Scanner(System.in);
	
	public void inputStudentDetails()
	{
		System.out.println("Enter roll number of a student :");
		rollNumber=sc.nextInt();
		
		System.out.println("Enter first name  and last name of a student :");
		firstName=sc.next();
		lastName=sc.next();
		
		System.out.println("Enter the marks of five subjects :");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextFloat();
		}	
	}
	
	public float  calculateTotalMarks()
	{
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}	
		return total;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("***** Student Details *****");
		System.out.println("Roll number         : "+rollNumber);
		System.out.println("Student Name        : "+firstName+" "+lastName);
		System.out.println("Total Marks         : "+total);
		System.out.println("******************************");
	}
	
	
	
	

}
