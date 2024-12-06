package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :2:43:30 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class OverrideDemo {
   public static void main(String[] args)
   {
	SBI sbiBank=new SBI("SBI");
	Axis axisBank =new  Axis("Axis");
	ICICI iciciBank=new ICICI("ICICI");
	
	sbiBank.display();
	System.out.println("\t The Interest rate is : "+sbiBank.getRateOfInterest()+"%" );
	
     axisBank.display();
	 System.out.println("\t The Interest rate is : "+axisBank.getRateOfInterest()+"%" );
	   
	 iciciBank.display();
	 System.out.println("\t The Interest rate is : "+iciciBank.getRateOfInterest()+"%" );
	   
	   
   }
}
