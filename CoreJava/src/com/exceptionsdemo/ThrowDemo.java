package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :3:27:16 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ThrowDemo {
	
	public static void test(int a)
	{
		if(a==0)
		{
			throw new ArithmeticException("Pass Non Zero Values :by raj");
		}
		else
			System.out.println("The Value passed ro method is : "+a);
	}
	
	public static void main(String[] args) 
	{
		ThrowDemo.test(250);
		ThrowDemo.test(5);
		
	}

}
