package com.oopsdemo2;

/**
*Author :Kalakoti.Reddy
*Date   :28-Oct-2024
*Time   :2:30:54 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class DoctorHierarchicalTest {
	public static void main(String[] args) {
		Specialist specialistDoctor=new Specialist(10001,"Mary King","Bengaluru","Cardiologist");

		NonSpecialist nonSpecialistDoctor=new NonSpecialist(20001,"Gavin King","Melbourne");

		specialistDoctor.display();
		nonSpecialistDoctor.display();
	}

}
