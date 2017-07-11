package com.jcg.examples.dao.impl;

import java.sql.*;


import com.jcg.examples.dao.AssignJobsDao;


public class AssignJobsDaoImpl implements AssignJobsDao {

	@Override
	public String assignJobs(String email, int sno) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="insert into assignjob(employeeEmail, sno) values(?,?)";
		PreparedStatement ps=con.prepareStatement(query);
				
		ps.setString(1, email);
		ps.setInt(2, sno);
		int res=ps.executeUpdate();
		
		if(res==1)
		{
			return "ok";
		}
		else
		{
			return "not";
		}
	}

}
