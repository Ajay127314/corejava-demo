package com.exceptionsdemo;

/**
*Author :Kalakoti.Reddy
*Date   :06-Nov-2024
*Time   :4:20:39 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Product {
	
	private String name;
    private double price;
    
    
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	
	

    // User-defined method to apply a discount
   //Whoever wants to call this method, they must handle IllegalArgumentException in catch Block
   public void applyDiscount(double discount) throws IllegalArgumentException {
       if (discount < 0 || discount > 100) {
           throw new IllegalArgumentException("Discount must be between 0 and 100.");
       }
       double discountAmount = price * (discount / 100);
       price -= discountAmount;
   }
    
	

}
