package com.jdbcdemo;


import java.sql.*;
/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :12:12:07 pm
*Email  :Kalakoti.Reddy@coforge.com
*/
//Demonstrate Projection

public class SelectDemo1 {
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try
		{
			con=ConnectionUtil.createConnection();
			stmt=con.createStatement();
			
			rs=stmt.executeQuery("select first_name,last_name,email from candidates order by last_name");
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+
						"\t"+rs.getString("email"));
			}
			con.close();
					
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}

}
