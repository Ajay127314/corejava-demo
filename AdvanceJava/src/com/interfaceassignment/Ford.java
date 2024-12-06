package com.interfaceassignment;

/**
*Author :Kalakoti.Reddy
*Date   :10-Nov-2024
*Time   :9:49:40 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Ford implements Truck {
	
	private int axles;
	private double weight;
	
	
	public Ford(int axles, double weight) {
		this.axles = axles;
		this.weight = weight;
	}

	
	@Override
	public int getAxles() {
		
		return axles;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public String getBrand() {
		return "ford";
	}

}
