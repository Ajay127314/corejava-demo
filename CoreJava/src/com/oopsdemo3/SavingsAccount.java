package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :3:41:00 pm
*Email  :Kalakoti.Reddy@coforge.com
*
*/

public class SavingsAccount extends Account
{
	private double interestRate;

	public SavingsAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	
}
