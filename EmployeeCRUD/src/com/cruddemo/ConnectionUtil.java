package com.cruddemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :12:08:19 pm
*Email  :Kalakoti.Reddy@coforge.com
*/
//Utility class to connect mysql server
public class ConnectionUtil
{
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","cfg@1234");
		return con;
	}
	

}
