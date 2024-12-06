package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :12:28:15 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class OverLoadDemo {
	public static void main(String[] args) {
		Addition a1=new Addition(33,45);
		
		a1.add();
		a1.add(999);
		a1.add(89,175);
		a1.add(450,350.50f);
		a1.add(20.50d,45.50d);
		a1.add("Hello ","World");
		a1.add(300,250,500);
		
		
	}

}
