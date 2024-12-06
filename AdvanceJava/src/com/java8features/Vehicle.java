package com.java8features;

/**
*Author :Kalakoti.Reddy
*Date   :09-Nov-2024
*Time   :11:37:53 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public interface Vehicle {
	
	//by default all are abstract methods
		String getBrand();
		String speedUp();
		String slowDown();
		
		// Any non-abstract methods must be made default to add any new feature
		default String turnAlarmOn()
		{
			return "Turning the Vehicle Alarm ON.";
		}
		
		default String turnAlarmOff()
		{
			return "Turning the Vehicle Alarm OFF.";
		}
		
		static int getHorsePower(int rpm,int torque)
		{
			return (rpm*torque)/5252;
		}


}
