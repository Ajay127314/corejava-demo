package com.assignments;

/**
*Author :Kalakoti.Reddy
*Date   :24-Oct-2024
*Time   :10:48:53 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Calculator {
	public static void main(String[] args)
	{
		int a,b,res;
		String c;
		System.out.println("enter the two numbers and operator :");
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=args[2];
		
		switch(c)
		{
		case "+":
			res=a+b;
			System.out.println("Addition : "+res);
			break;
		case "-":
			res=a-b;
			System.out.println("Subtraction : "+res);
			break;
		case "*":
			res=a*b;
			System.out.println("Multiplication : "+res);
			break;
		case "/":
			res=a/b;
			System.out.println("Division : "+res);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		
	}

}
