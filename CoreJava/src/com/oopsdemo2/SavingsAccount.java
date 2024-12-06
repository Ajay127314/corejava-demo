package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :12:06:27 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SavingsAccount extends Account
{
	private float minimumBalance;
	protected double balance;

	public SavingsAccount(int accountNumber, String name,float minimumBalance,double balance)
	{
		super(accountNumber, name);
		this.minimumBalance=minimumBalance;
		this.balance=balance;
		
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Minimum Balance         : "+minimumBalance);
        System.out.println("Savings Account Balance : "+balance);
	}

}
