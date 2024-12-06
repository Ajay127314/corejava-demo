package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :10:33:07 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SingleInheritanceDemo
{
	public static void main(String[] args)
	{
		Developer d1=new Developer(101, "Ajay", 120000, "SPRING");
		d1.display();
		d1.displayDeveloperDetails();
		
		
		Developer d2=new Developer(102, "Vijay", 50000, "JDBC");
		d2.display();
		d2.displayDeveloperDetails();
		
		
		Developer d3=new Developer(103, "Honey", 100000, "HIBERNATE");
		d3.display();
		d3.displayDeveloperDetails();
		
		
		
		Employee e1=new Employee(201, "abhay", 12000);
		Employee e2=new Employee(202, "baba",13000);
		
		e1.display();
		e2.display();
		
		
		
		
	}
	

}
