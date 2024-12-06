package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :11:08:37 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		
		employee1.inputEmployeeDetails();
		employee1.calculateNetSalary();
		employee1.employeeDetails();
		
		
		employee2.inputEmployeeDetails();
		employee2.calculateNetSalary();
		employee2.employeeDetails();
		
		
		employee3.inputEmployeeDetails();
		employee3.calculateNetSalary();
		employee3.employeeDetails();
		
		
		
		
	}
}
