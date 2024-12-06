package com.oopsdemo3;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :9:40:39 am
*Email  :Kalakoti.Reddy@coforge.com
*/

class MyDemo{
	
	private static final int MAX_AGE=65;
	private int age=21;
	
	/*
	 * public void test() { MAX_AGE=60;//We cannot modify the final variable }
	 */
	
	public final void test1()
	{
		System.out.println("The Age is : "+age);
	}

}

class MyTemp extends MyDemo
{
	/*
	 * public void test1()//we cannot overridden the final method {
	 * System.out.println("The Age is : "+age); }
	 */
}

final class Hello
{
	int a,b;

	public Hello(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Hello [a=" + a + ", b=" + b + "]";
	}
}

/*
 * class World extends Hello//Final Classes cannot extended {
 * 
 * }
 */
	
	
	
	

public class FinalDemo
{
	public static void main(String[] args)
	{
		
	}
}
