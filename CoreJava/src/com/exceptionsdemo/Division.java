package com.exceptionsdemo;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :12:51:42 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Division {
	public static void main(String[] args) {
		
		int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();

        result = a / b; //Exception is thrown by JRE for Divide by Zero Exception
        System.out.println("Result = " + result);

        input.close();
		
	}

}
