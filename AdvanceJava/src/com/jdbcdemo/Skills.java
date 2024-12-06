package com.jdbcdemo;

import java.sql.Connection;
import java.sql.*;

/**
*Author :Kalakoti.Reddy
*Date   :07-Nov-2024
*Time   :4:44:01 pm
*Email  :Kalakoti.Reddy@coforge.com
*/

public class Skills {
	Connection con;
	CallableStatement cstmt;
	ResultSet rs;
	
	int id;
	
	public Skills() throws Exception
	{
		con=ConnectionUtil.createConnection();
	}
	
	public void getSkills(int candidateId) throws Exception
	{
		cstmt=con.prepareCall("{ call get_candidate_skill(?)}");
		cstmt.setInt(1, candidateId);
		rs=cstmt.executeQuery();
		
		if(!rs.next())
		{
			System.out.println("No skills");
		}
		else
		{
			
		
		
		  do {
             System.out.println(String.format("%s - %s",
                    rs.getString("first_name") + " "
                    + rs.getString("last_name"),
                    rs.getString("skill")));
			 }  while(rs.next());
		}
		
				con.close();
		
		
	}

}
