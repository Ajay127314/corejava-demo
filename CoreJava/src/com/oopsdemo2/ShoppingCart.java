package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :11:39:07 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ShoppingCart extends Customer
{
	private String[] items;
	private int itemCount;
	
	

	public ShoppingCart(String name, String email) {
		super(name, email);
		items=new String[5];
		itemCount=0;
	
	}
	
	  
	    public void addItem(String item)
	    {
		    if(itemCount < items.length)
		    {
		        items[itemCount]=item;
		        itemCount++;
		        System.out.println(item+" Added to Cart");
		    }
		    else
		    {
		        System.out.println("Cart is Full. Cannot Add More Items.");
		    }
	     }

		public void displayCart()
		{
		    System.out.println("Items in Cart: ");
		    for (int i = 0; i < itemCount; i++) 
		    {
		        System.out.println("\t"+items[i]);
		    }
		}

	
}
