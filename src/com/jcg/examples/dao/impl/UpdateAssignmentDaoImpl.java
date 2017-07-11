package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jcg.examples.dao.UpdateAssignmentDao;

public class UpdateAssignmentDaoImpl implements UpdateAssignmentDao {

	

	@Override
	public String updateAssignmentDao(String fullName, String email, String endDate, String assignmentdescription,
			String startDate, String typeOfEvent, int sno) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="update addassignmentclient set fullName=?, email=?, endDate=?, assignmentDescription=?, startDate=?, typeOfEvent=? where Sno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, fullName);
		ps.setString(2, email);
		ps.setString(3, endDate);
		ps.setString(4, assignmentdescription);
		ps.setString(5, startDate);
		ps.setString(6, typeOfEvent);
		ps.setInt(7, sno);
		
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
