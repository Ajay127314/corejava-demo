package com.assignments;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :9:15:33 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class CityItOrNot {
	
	public static void main(String[] args)
	{
		String city;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter a City Name : ");
		city=s.next();
		
		//use equals() method for comparison of Strings.(Reference type)
		//use == operator for comparison primitive types
		if(city.equalsIgnoreCase("Bengaluru") || city.equalsIgnoreCase("Chennai") || 
				city.equalsIgnoreCase("hyderabad") || city.equalsIgnoreCase("Gurgaon")) 
		{
			System.out.println(city+" is a IT City");
		}
		else
		{
			System.out.println(city+" is Not a IT City");
		}
			s.close();
		
	}

}
