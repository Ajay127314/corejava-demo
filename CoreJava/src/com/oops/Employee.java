package com.oops;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :10:47:42 am
*Email  :Kalakoti.Reddy@coforge.com
*
*Program to enter employee details ,calculate net salary and display salary slip
*/

public class Employee 
{
	private int empId;
	private String firstName,lastName,design;
	private double basic,hra,da,grossSalary,netSalary;
	private static final double TAX=1000; //constant declaration
	
	Scanner sc =new Scanner(System.in);
	
	
	//Default Constructor Added by JVM in Run Time and Initialize object properties with default values
	
	public void inputEmployeeDetails()
	{
		System.out.println("Enter empid ,firstname ,lastname and designation :");
		empId=sc.nextInt();
		firstName=sc.next();
		lastName=sc.next();
		sc.nextLine();
		design=sc.nextLine();
		
		System.out.println("Enter the basic salary :");
		basic=sc.nextDouble();
	}
	
	
	public void calculateNetSalary()
	{
		hra=basic*0.25;
		da=basic*0.15;
		grossSalary=basic+hra+da;
		netSalary=grossSalary-TAX;
	}
	
	public void employeeDetails()
	{
		
		System.out.println("**** Employee Salary Slip ****");
		System.out.println("Employee Id          : "+empId);
		System.out.println("Employee name        : "+firstName+" "+lastName);
		System.out.println("Employee Designation : "+design);
		System.out.println("Basic                : "+basic);
		System.out.println("HRA                  : "+hra);
		System.out.println("Dearness Allow       : "+da);
		System.out.println("Gross Salary         : "+grossSalary);
		System.out.println("TAX                  : "+TAX);
		System.out.println("--------------------------------------");
		System.out.println("Employee Salary      : "+netSalary);
		System.out.println("---------------------------------------");
	}
	
}
