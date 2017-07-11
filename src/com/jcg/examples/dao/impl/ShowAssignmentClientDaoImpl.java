package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowAssignmentClientDao;

public class ShowAssignmentClientDaoImpl implements ShowAssignmentClientDao{

	@Override
	public ResultSet showAssignmentClient(String email) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="select * from addassignmentclient where email=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, email);
		ResultSet res=ps.executeQuery();
		
		return res;
	}
	

}
