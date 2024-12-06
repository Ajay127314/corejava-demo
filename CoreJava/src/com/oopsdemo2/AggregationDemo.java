package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :10:07:46 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class AggregationDemo {
	public static void main(String[] args)
	{
		Address ad1=new Address("Benguluru", "Karnataka", "India", 566016);
		Address ad2=new Address("Vijayawada", "Andhra Pradesh", "India", 521109);
		
		
		Student s1=new Student(101, "Vamsi", ad1);
		Student s2=new Student(102, "Ajay", ad2);
		
		s1.display();
		s2.display();
	}

}
