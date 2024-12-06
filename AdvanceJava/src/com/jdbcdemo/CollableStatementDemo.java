package com.jdbcdemo;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :4:44:15 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class CollableStatementDemo {
	public static void main(String[] args) 
	{
		try
		{
			Skills s=new Skills();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter candidate id :");
			int id=sc.nextInt();
			
			s.getSkills(id);
			sc.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
