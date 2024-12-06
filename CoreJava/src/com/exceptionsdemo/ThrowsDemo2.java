package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :4:23:46 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class ThrowsDemo2 {
	public static void main(String[] args)
	{
	      Product product1=new Product("Laptop",50000);
	        System.out.println("Product Created :"+product1.getName()+" "+product1.getPrice());

	        Product product2=new Product("Cell Phone",25000);
	        System.out.println("Product Created :"+product2.getName()+" "+product2.getPrice());
	        
	        
	        try {
	        	product1.applyDiscount(10);
	        	System.out.println("The Discount price of :"+product1.getName()+" "+product1.getPrice());
	        	
	        	
	        	product1.applyDiscount(110);
	        	System.out.println("The Discount price of :"+product1.getName()+" "+product1.getPrice());
	        }
	        catch(IllegalArgumentException e)
	        {
	        	System.err.println("Error :"+e.getMessage());
	        }
	}

}
