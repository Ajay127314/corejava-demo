package com.controlflow;



/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :3:24:24 pm
*Email  :Kalakoti.Reddy@coforge.com
*
*display odd or even in the following format
*ODD	EVEN
* ---	----
* 1		2
* 3		4
* 5		6
* 7		8
* 9		10
*/

public class DisplayOddEven {
	public static void main(String[] args)
	{
		int i=1;
		System.out.println("Odd \t Even");
		System.out.println("---\t----");
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i +"\t");
			}
			else
			{
				System.out.print(i+"\t");
				
			}
		  i++;
		}
		
		
	}

}
