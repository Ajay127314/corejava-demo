package com.controlflow;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :25-Oct-2024
*Time   :9:19:22 am
*Email  :Kalakoti.Reddy@coforge.com
*program to count vowels in a string
*/

public class VowelsCheck {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String sentence;
		System.out.println("Enter the Sentence :");
		sentence=sc.nextLine();
		
		String sentence1=sentence.toLowerCase();
		int count=0;
		sc.close();
		
		for(int i=0;i<sentence1.length();i++)
		{
			if(sentence1.charAt(i)=='a'||sentence1.charAt(i)=='e'||sentence1.charAt(i)=='i'||
					sentence1.charAt(i)=='o'||sentence1.charAt(i)=='u' )
			{
				count++;
				
			}
		}
		System.out.println("The total no of vowels in the \""+sentence+"\" is : "+ count );
		
		
		
		
		
	}

}
