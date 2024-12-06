package com.assignments;

/**
*Author :Kalakoti.Reddy
*Date   :27-Oct-2024
*Time   :7:01:54 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class BankAccountTest {

	public static void main(String[] args)
	{
		BankAccount b1=new BankAccount();
		b1.input();
		b1.deposit(1200);
		b1.withDrawn(5000);
		b1.displayDetails();
		
	}
}
