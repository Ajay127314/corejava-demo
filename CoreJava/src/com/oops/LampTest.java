package com.oops;

/**
*Author :Kalakoti.Reddy
*Date   :26-Oct-2024
*Time   :11:48:25 am
*Email  :Kalakoti.Reddy@coforge.com
*/

class Lamp
{
	//Stores status of Lamp
		private boolean isOn;
		
		//Default Constructor - 
		//Compiler Creates it for Automatic initialization of Object Properties
		
		//Method to turn On the Lamp
		public void turnOn() {
			isOn=true;
			System.out.println("Light On ? : "+isOn);
		}
		//Method to turn Off the Lamp
			public void turnOff() {
				isOn=false;
				System.out.println("Light On ? : "+isOn);
			}	
	
}


//main class - File should be saved as LampTest - The Main class name
public class LampTest {
	public static void main(String[] args)
	{
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		led.turnOn();
		halogen.turnOn();
		
		
		led.turnOff();
		halogen.turnOff();
	}

}
