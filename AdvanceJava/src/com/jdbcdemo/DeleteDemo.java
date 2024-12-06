package com.jdbcdemo;

import java.sql.*;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :4:18:39 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class DeleteDemo {
	public static void main(String[] args) 
	{
		Connection con;
		Statement stmt;
		int cnt=0;
		
		try
		{
			con=ConnectionUtil.createConnection();
			String sql="Delete from candidates where rtrim(last_name)"+ "like\'k%g\';";
			
		String sql1="Delete from candidates where id=101";
			
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			
			if(cnt<0)
			{
				System.out.println(cnt+" Record Deleted ");
			}
			else
			{
				System.out.println("Records not found");
			}
			
			con.close();
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
