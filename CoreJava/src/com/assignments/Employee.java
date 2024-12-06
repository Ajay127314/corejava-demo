package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :27-Oct-2024
*Time   :6:00:03 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Employee {
	
	private double salary;
	private float hoursPerDay;
	
	
	
	Scanner sc=new Scanner(System.in);
	
	public void getInfo()
	{
		System.out.println("Enter the salary  and hours :");
		salary=sc.nextDouble();
		hoursPerDay=sc.nextFloat();
	}
	
	public void addSal()
	{
		if(salary<500)
		{
			salary+=10;
		}
	}
	
	public void addWork()
	{
		if(hoursPerDay>6)
		{
			salary+=5;
		}
		
	}
	
	
	public void displayInfo()
	{
		System.out.println("Final salary is : "+salary);
	
	}
	
	


}


