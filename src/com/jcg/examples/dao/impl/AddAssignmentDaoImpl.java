package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.AddAssignmentDao;

public class AddAssignmentDaoImpl implements AddAssignmentDao {

	@Override
	public String addAssignmentDao(String fullName, String email, String endDate, String assignmentdescription,
			String startDate, String typeOfEvent) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="insert into addassignmentclient(fullName, email, endDate, assignmentDescription, startDate, typeOfEvent) values(?,?,?,?,?,?)";
		System.out.println(typeOfEvent);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, fullName);
		ps.setString(2, email);
		ps.setString(3, endDate);
		ps.setString(4, assignmentdescription);
		ps.setString(5, startDate);
		ps.setString(6, typeOfEvent);
		
		int res=ps.executeUpdate();
		if(res>0)
		{
			return "ok";
		}
		else
		{
			return "not";
		}
		
		
	}

}
