package com.controlflow;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The given number "+num +" is even number");
		}
		else
		{
			System.out.println("The given number "+num +" is odd number");
		}
		sc.close();
		
		
	}

}
