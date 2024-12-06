package com.controlflow;


//sum and average of 3 numbers which are greater than 100

import java.util.Scanner;

public class SumAverage {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the three numbers :");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>100 && n2>100 && n3>100)
		{
		int sum=n1+n2+n3;
		float avg=(float)(sum/3);
		
		System.out.println("The sum of three numbers is :"+ sum);
		System.out.println("The average of three numbers is :"+avg);
		System.out.println("average "+String.format("%.2f",avg));
		
		}
		else
		{
			System.out.println("please enter numbers greater than 100");
		}
		
		
		sc.close();
		
	}

}
