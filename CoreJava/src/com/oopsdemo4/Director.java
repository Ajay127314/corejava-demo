package com.oopsdemo4;

/**
*Author :Kalakoti.Reddy
*Date   :30-Oct-2024
*Time   :11:52:21 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Director extends Employee {
	
	private double transportAllowance;

	public Director(String name, double basic, String address, double transportAllowance) {
		super(name, basic, address);
		this.transportAllowance = transportAllowance;
	}

	@Override
	double totalPay() {
		double totalAmount = 0;
		double houseRentAllowance = (basic * 0.08);
		double dearnessAllowance = (basic * 0.3);
		double medicalAllowance = 1500;
		totalAmount = basic + houseRentAllowance
				+ dearnessAllowance + medicalAllowance;
		return totalAmount;
	}
	
	void show()
	{
		super.show();
		System.out.println("Transport Allowance : \t"+transportAllowance);
	}	

}
