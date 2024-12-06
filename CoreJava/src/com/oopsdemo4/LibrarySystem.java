package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :12:56:09 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class LibrarySystem {
	public static void main(String[] args)
	{
		Library l1=new Library();
		//display books
		l1.displayItems();
		
		//
		l1.borrowItem("1984");
		l1.borrowItem("The Great Gatsby");
		l1.returnItem("1984");
		
		l1.displayItems();
		
		
		
	}

}
