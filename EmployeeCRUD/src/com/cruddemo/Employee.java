package com.cruddemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :5:11:36 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Employee {
	
    Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet res;

	int count;
	
	public Connection getConnection() throws Exception
	{
		con=ConnectionUtil.createConnection();
	
		return con;
	}
	
	
	
	public void insertEmployee(String name, String city, String contact,String email) throws Exception 
 
	{
		try
		{
			con=getConnection();
		
		    
		System.out.println("**************** Insert new Employees*****************");
		
		
		String in="insert into employee(emp_name,city,contactno,email) values(?,?,?,?)";
		
		 ps=con.prepareStatement(in);
		 
		 ps.setString(1, name);
		 ps.setString(2, city);
		 ps.setString(3,contact);
		 ps.setString(4, email);
		 
		 ps.executeUpdate();
		
		System.out.println("Record inserted sucessfully");	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
     	}
		
	}
	
		
	//Display
	public void getEmployee() throws Exception 
 
	{
		try
		{
		con=getConnection();
	 System.out.println("**************** Display Employees*****************");
	 
	 String s="Select * from employee";
	  
	 ps=con.prepareStatement(s);
	  res=ps.executeQuery();
			 
	  while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+
					"\t"+res.getString(4)+"\t"+res.getString(5));
		}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	 
	 
	}
	
	
	
	
	//update
	public void updateEmployee(int eid,String city) throws Exception 
	{
		try
		{
		con=getConnection();
		System.out.println("**************** Update Employees*****************");
		
		String update="update employee set city=? where emp_id=?";
		
		    ps=con.prepareStatement(update);
			ps.setInt(2, eid);
			ps.setString(1,city);
			
			count=ps.executeUpdate();
			System.out.println(String.format("Row affected : %d", count));
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	

  //delete 	
	public void deleteEmployee(int eid) throws Exception 
	{
		
		try
		{
		con=getConnection();
		System.out.println("**************** Delete Employees*****************");
		
		String delete="delete from employee where emp_id=?";
		
		   ps=con.prepareStatement(delete);
		   ps.setInt(1, eid);
           ps.executeUpdate();
		    System.out.println(" Record Deleted ");
		
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	public void updateEmployeeEmail(int eid,String email) throws Exception
	{
		
		try
		{
		con=getConnection();
		String update2="update employee set email=? where emp_id=?";
		
		ps=con.prepareStatement(update2);
		
		ps.setInt(2, eid);
		ps.setString(1,email);
		
	  count = ps.executeUpdate();
	  System.out.println(String.format("Row affected : %d", count));
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
		
	}


}
