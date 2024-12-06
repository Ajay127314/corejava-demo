package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :2:36:03 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ConstructorDemo 
{
	int id;
	String name;
	float salary;
	
	public ConstructorDemo() 
	{
		System.out.println("No arguments constructor");
		this.id=101;
		this.name="ajay";
		this.salary=89000.0f;
	}
	
	

	public ConstructorDemo(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public void name()
	{
		System.out.println("I am a Method");
		System.out.println(this.id+"  "+this.name+"  "+this.salary);
	}
	
	

	public static void main(String[] args)
	{		
		ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo(102,"vijay",67000.0f);
		ConstructorDemo c3=new ConstructorDemo();
		
		System.out.println();
		
		c1.name();
		System.out.println();
		c2.name();
		
		
	}

}
