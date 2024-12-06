package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :29-Oct-2024
*Time   :11:22:09 am
*Email  :Kalakoti.Reddy@coforge.com
*/


class Hyundai extends Car
{
	public void hyundaiStart()
	{
		Engine heng=new Engine();
		heng.startEngine();
	}
	
}

class Maruthi extends Car
{
	public void maruthiStart()
	{
		Engine meng=new Engine();
		meng.startEngine();
	}
}

public class CompositionDemo {
	
	public static void main(String[] args) 
	{
	    Maruthi baleno =new Maruthi();
		
		baleno.setColor("Silver"); //car class methods
		baleno.setMax_speed(180);	//car class methods
		
		System.out.println("*******Maruti Car Details *********");
		System.out.println(baleno.getColor() +" Color");//car class methods
		System.out.println(baleno.getMax_speed()+" Speed");//car class methods
		
		baleno.maruthiStart(); // Maruthi class method-- > call ENgine class method
		
		baleno=null; // baleno object destroyed
		System.gc();
		System.out.println(baleno.getColor());
		
		
		
		Hyundai creta=new Hyundai();
		
		
		
	}
	
	

}
