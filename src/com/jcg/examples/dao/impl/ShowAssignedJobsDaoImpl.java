package com.jcg.examples.dao.impl;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.jcg.examples.dao.ShowAssignedJobsDao;


public class ShowAssignedJobsDaoImpl implements ShowAssignedJobsDao {

	@Override
	public ResultSet showAssignedJobs(String email) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="select a1.fullName, a1.email, a1.endDate, a1.assignmentDescription, a1.startDate, a1.Sno, a1.typeOfEvent, a2.employeeEmail from addassignmentclient a1, assignjob a2 where a1.Sno=a2.sno and a1.email=?";
                
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, email);
		ResultSet res=ps.executeQuery();
		System.out.println(email);
		return res;
	}

}
