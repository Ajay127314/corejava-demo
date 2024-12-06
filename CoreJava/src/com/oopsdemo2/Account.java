package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :12:03:41 pm
*Email  :Kalakoti.Reddy@coforge.com
*
*Account---->SavingsAccount----->AccountTransactions
*/

public class Account {
	
	private int accountNumber;
	private String name;
	
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	  public void display()
	  {
	        System.out.println("********** Account Details ***********");
	        System.out.println("Account Number : "+accountNumber);
	        System.out.println("Customer Name  :"+name);
	    }

}
