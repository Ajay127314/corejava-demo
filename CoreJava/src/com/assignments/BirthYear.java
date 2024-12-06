package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :8:58:41 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class BirthYear {
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int p_year=2024,age=0;
		System.out.println("enter the birth year :");
		int year=sc.nextInt();
		sc.close();
		if(year>1900 && year <=2024)
		{
		while(year<=p_year)
		{
			year=year+1;
			age++;	
		}
		System.out.println("The present age is : "+age);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
