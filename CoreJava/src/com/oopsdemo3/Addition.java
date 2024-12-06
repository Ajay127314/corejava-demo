package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :12:14:49 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Addition {
	
	private int a,b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		System.out.println("******* Method Overloading ********");
		System.out.println("The Addition of 2 Integers is : "+(a+b));
	}
	
	public void add(int x)
	{
		System.out.println("The Addition of single number to itself : "+(x+x));
	}

	public void add(int x,int y)
	{
		System.out.println("The Addition of 2 numbers is  : "+(x+y));
	}
	
	public void add(int x,float y)
	{
		System.out.println("The Addition  integer & float is  : "+(x+y));
	}

	public void add(String x,String y)
	{
		System.out.println("The Addition of 2 strings is : "+(x+y));
	}
	
	public void add(double  x,double y)
	{
		System.out.println("The Addition of 2 doubles  is : "+(x+y));
	}
	
	public void add(int x,int  y,int z)
	{
		System.out.println("The Addition of 2 numbers is : "+(x+y+z));
	}



}
