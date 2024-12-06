package com.oopsdemo3;

import com.oops.Complex;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :9:52:55 am
*Email  :Kalakoti.Reddy@coforge.com
*/



class Test
{
	int a; // default variable - accessible within the package
	private int b; //private variable - accessible within class only
	protected int c; // accessible in class & subclass
	public int d; //accessible from any part of the project
	
	
	public Test(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	 void display(){ // default method
			System.out.println("Private Variable : "+b);
		}	
}


class Test2 extends Test
{

	public Test2(int a, int b, int c, int d) {
		super(a, b, c, d);
	}

	public  void display(){ // public method
			System.out.println("Protected Variable : "+c);
		}	
	
}


public class AccessSpecifiersDemo {
	public static void main(String[] args)
	{
		Test t1=new Test(300,400, 500, 600);
		t1.display();
		
		//t1.b=500 //Compilation error --private variables cannot be accessed outside class
		System.out.println("The default varaible value in new class : "+t1.a);
		
		
		Test2 test2=new Test2(300, 400, 500, 600);
		test2.display();
		
		//create complex object with real & imaginary part
		
		Complex complex1=new Complex(10.3,67.4);
		Complex complex2=new Complex(0.7,3.6);
		
		complex1.add(complex2);
		complex1.display();
	    	
	
	}

}
