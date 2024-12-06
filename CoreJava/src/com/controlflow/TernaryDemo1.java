package com.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :11:46:07 am
*Email  :Kalakoti.Reddy@coforge.com
*
*program to find max of two numbers using ternary operator
*/

public class TernaryDemo1 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n1,n2,result;
		
		System.out.println("Enter the 2 numbers :");
		
		n1=Integer.parseInt(br.readLine());
		n2=Integer.parseInt(br.readLine());
		
		
		String msg=(n1>n2)?"n1 is greatest":"n2 is greatest";
		System.out.println(msg);
		
		result=(n1>n2) ? n1 : n2;
		System.out.println("The maximum of two numbers is : "+result);
		
	}
	
}
