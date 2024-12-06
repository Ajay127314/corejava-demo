package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :10:16:01 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Employee {
	
	private int empId;
	private String name;
	private float basic;
	
	
	
	public Employee(int empId, String name, float basic) {
		this.empId = empId;
		this.name = name;
		this.basic = basic;
	}
	
	
	public void display()
	{
		System.out.println("*****   Employee Information *****");
		System.out.println("Employee Id           : "+empId);
		System.out.println("Employee Name         : "+name);
		System.out.println("Basic Salary          : "+basic);
		
	}
	
	

}
