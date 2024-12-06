package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :10:25:27 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Developer extends Employee
{
	private String tech;

	public Developer(int empId, String name, float basic,String tech) 
	{
		super(empId, name, basic);
		this.tech=tech;
	}
	
	public void displayDeveloperDetails()
	{
		System.out.println("Technology            : "+tech);
		System.out.println("*****************************");
	}
	
}
