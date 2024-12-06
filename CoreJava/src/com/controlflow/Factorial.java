package com.controlflow;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :5:07:19 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Factorial {
	public static void main(String[] args) 
	{
		int n,fact=1,i;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n=scanner.nextInt();
		
		if(n > 0) {
			//Loop to find factorial
			for(i=1;i<=n;i++) {
				fact =fact *i;
			}
			
			System.out.println("The Factorial of "+n+" is : "+fact);
			
			}
		else {
			System.out.println("Please Enter Value greater Than Zero");
		}
		scanner.close();
		
	}

}
