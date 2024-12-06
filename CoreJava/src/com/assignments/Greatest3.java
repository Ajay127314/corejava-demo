package com.assignments;

import java.util.Scanner;

public class Greatest3 {
	
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the three numbers :");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	
	if(n1>n2 && n1>n3)
	{
		System.out.println(n1+" is Greatest");
	
	}
	
	else if(n2>n3)
	{
		System.out.println(n2+" is Greatest");
	
	}
	else if(n1==n2 && n2==n3)
	{
		System.out.println("All numbers are equal");
	}
	else
	{
		System.out.println(n3 +" is Greatest");
	}
	sc.close();

}
}
