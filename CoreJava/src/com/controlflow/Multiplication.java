package com.controlflow;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :3:15:37 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Multiplication {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int num,l,i=1;
		System.out.println("enter the table :");
		num=sc.nextInt();
		System.out.println("enter the limit :");
		l=sc.nextInt();
		while(i<=l)
		{
			System.out.println(num +" x "+ i+ " = "+num*i);
			i++;
		}
		sc.close();
		
		
		
	}

}
