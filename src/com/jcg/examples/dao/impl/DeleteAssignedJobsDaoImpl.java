package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.jcg.examples.dao.DeleteAssignedJobsDao;


public class DeleteAssignedJobsDaoImpl implements DeleteAssignedJobsDao {

	@Override
	public String deleteAssignedJobs(int sno) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="delete from assignjob where sno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, sno);
		
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
