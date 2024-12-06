package com.stringsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :04-Nov-2024
*Time   :12:10:33 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class StringComparisionDemo 
{
	public static void main(String[] args)
	{
		String s1="James Gosling";
		String s2="James Gosling";
		
		String s3=new String("Hello World");
		String s4=new String("Hello World");
		
		if(s1==s2)//address checking or reference value checking
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are  not equal");
		}
		

		if(s3.equals(s4))// content checking
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String are  not equal");
		}
		
		
	}

}
