package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :3:52:47 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class AccountOperations 
{
	public static void main(String[] args) {

		 Account account;

				//Upcasting
				account=new SavingsAccount("John Micheal",5000, 4);

				System.out.println("\nSavings Account Details");
				System.out.println("------------------------");
				System.out.println("" + account.getName()+ " has an initial Balance of: " + account.getBalance());
				account.deposit(2000);//invokes base class methods
				account.withdraw(3000);// invokes base class methods
				System.out.println("" + account.getName()+ " at the end of transaction has a Balance of: "
						+ account.getBalance()+account);
				
				//double i = account.getInterestRate(); //We cannot access methods of child class
				//Downcasting - To access Child class Methods
				if( account instanceof SavingsAccount) {
					SavingsAccount savingsAccount=(SavingsAccount) account; //Downcasting - Parent to child
					double i =savingsAccount.getInterestRate();
					System.out.println("The Interest Rate for Savings Account is : "+i);
				}
	}
}
