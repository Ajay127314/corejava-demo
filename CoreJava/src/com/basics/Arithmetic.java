package com.basics;

import java.util.Scanner;

public class Arithmetic {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the number :");
	int a=sc.nextInt();
	System.out.println("Enter the number :");
	int b=sc.nextInt();
	
	System.out.println("Enter your name :");
	String name=sc.next();
	
	
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	float div=(float)a/b;
	
	System.out.println("The sum of two numbers :"+ sum);
	System.out.println("The difference of two numbers :"+ sub);
	System.out.println("The multiplication of two numbers :"+ mul);
	System.out.println("The division of two numbers :"+ div);
	System.out.println("Program  created by "+ name);
	sc.close();
	
	
	
}

}
