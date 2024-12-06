package com.oopsdemo2;

import java.util.Scanner;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :11:47:38 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ShoppingApplication 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***** Online Shopping Portal *****");
		System.out.println("Enter the customer name & mail :");
		String name=sc.nextLine();
		String email=sc.nextLine();
		sc.close();
		
		
		ShoppingCart cart1 =new ShoppingCart(name,email);

        System.out.println("********** Online Shopping Portal ************");

        //Add items to Cart
        cart1.addItem("Boat Ear Buds");//Invoke method addItem() for Object cart1
        cart1.addItem("Logitech Mouse");
        cart1.addItem("Samsung HDD");
        cart1.addItem("HP Laser Printer");
        cart1.addItem("Pen Drive");
        cart1.addItem("HP Printer");
        

        System.out.println("Customer Details :");
        cart1.display(); //Base class method
        System.out.println("Cart Details :");
        cart1.displayCart();

	}
}
