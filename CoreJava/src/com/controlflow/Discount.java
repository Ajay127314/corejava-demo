package com.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Discount {
	public static void main(String[] args) throws IOException
	{
		/*
		 * Java program to check if the user is eligible for a discount or not.
		 * If the user's age is less than 18 or they are not a member, they are eligible for a discount.
		 * Otherwise, they are not eligible for a discount.
		 */
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		String name;
		int age;
		boolean isMember;
		
		System.out.println("enter your name :");
		name=br.readLine();
		System.out.println("enter your age :");
		age=Integer.parseInt(br.readLine());
        System.out.println("Are you a member ? : (true/false)");
        isMember=Boolean.parseBoolean(br.readLine());
        
        
        
        if(age < 18 || !isMember)
        {
        	System.out.println(name +" is eligible for discount");
        }
        else
        {
        	System.out.println(name +" is not eligible for discount !!!");
        }
		
		
		
	}

}
