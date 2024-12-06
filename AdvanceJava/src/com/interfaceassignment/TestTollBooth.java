package com.interfaceassignment;

/**
*Author :Kalakoti.Reddy
*Date   :10-Nov-2024
*Time   :10:07:46 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class TestTollBooth {


public static void main(String[] args) {
	 
ToolBooth booth = new AlleghenyTollBooth();

Truck ford = new Ford(5, 12500);
Truck nissan = new Nissan(2, 5000);
Truck daewoo = new Daewoo(6, 17000);

booth.calculateTool(ford);
booth.calculateTool(nissan);
booth.calculateTool(daewoo);

booth.collectReceipts();
	}

}