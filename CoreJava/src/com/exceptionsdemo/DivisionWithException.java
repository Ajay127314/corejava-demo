package com.exceptionsdemo;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :12:51:42 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class DivisionWithException {
	public static void main(String[] args) {
		
		int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        
        try
        {
        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
        System.out.println("Result = " + result);
        }
        
        catch (ArithmeticException ex)
        {
        	System.out.println("please enter second number as non zero");
        	System.err.println("Exception name and  description :"+ex.toString());
        	System.err.println("Exception Description : "+ex.getMessage());
        	
        	ex.printStackTrace();
        	
        }
        
        
        finally
        {
        input.close();
        System.out.println("In finally block");
        }
		
	}

}
