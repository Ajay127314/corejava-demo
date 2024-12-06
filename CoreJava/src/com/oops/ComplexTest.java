package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :3:06:28 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ComplexTest 
{
	public static void main(String[] args)
	{
		Complex c1=new Complex(11.11, 12.12);
		Complex c2=new Complex(10.11, 13.12);
		
		c1.add(c2);
		c1.display();
		
		Complex c3=new Complex(14.11, 15.12);
		Complex c4=new Complex(16.11, 17.12);
		
		c3.add(c4);
		c3.display();
		
	}

}
