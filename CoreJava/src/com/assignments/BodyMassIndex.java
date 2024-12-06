package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :9:06:50 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class BodyMassIndex {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float weight,height;
		
		System.out.println("Enter the weight in kilograms :");
		weight=sc.nextFloat();
		System.out.println("Enter the height in meters  :");
		height=sc.nextFloat();
		sc.close();
		
		
		float bmi=(weight/(height*height));
		
		System.out.println("Your BMI is : "+bmi);
		
		
		
		
		
		
	}

}
