package com.jdbcdemo;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :3:33:28 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class UpdateDemo {
	public static void main(String[] args) 
	{
		Candidates c1=new Candidates();
		
		try
		{
			c1.getConnection();
			c1.updateCandidate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
