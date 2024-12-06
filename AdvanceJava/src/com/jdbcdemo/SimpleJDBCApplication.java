package com.jdbcdemo;

import java.sql.*;



/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :10:50:08 am
*Email  :Kalakoti.Reddy@coforge.com
*/

public class SimpleJDBCApplication {
	public static void main(String[] args)
	{
		try
		{
			//load the jdbc driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//establish the connection
			
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username="root";
			String password="cfg@1234";
			Connection connection=DriverManager.getConnection(url,username,password);
			
			//execute the query
			Statement statement = connection.createStatement();
			String sql ="SELECT *  FROM employees";
			ResultSet resultSet = statement.executeQuery(sql);
 
              System.out.println("EmployeeNumber\t First Name\t Designation");
			//process the result
			while(resultSet.next()) {
				int id = resultSet.getInt("employeeNumber");
				String name = resultSet.getString("firstName");
				
				
				System.out.println( id +"\t\t"+ name+"\t\t"+resultSet.getString(8));
			}

			
			
			
			//close the resources
			resultSet.close();
			statement.close();
			connection.close();
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
