package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :10:35:13 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Triangle {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int s1,s2,s3;
		System.out.println("Enter the three values :");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		sc.close();
		
		if(s1==s2 && s2==s3 )
		{
			System.out.println("The Triangle is Equilateral");
		}
		else if(s1==s2 || s2==s3||s3==s1 )
		{
			System.out.println("The Triangle is Isosceles");
		}
		else
		{
			System.out.println("The Triangle is Scalene ");
		}

	}

}
