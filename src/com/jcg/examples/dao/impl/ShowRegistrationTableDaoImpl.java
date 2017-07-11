package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowRegistrationTableDao;

public class ShowRegistrationTableDaoImpl implements ShowRegistrationTableDao {

	@Override
	public ResultSet showRegistrationTable() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="select fullName, email, dateOfBirth, usertype, gender from registration";
		PreparedStatement ps=con.prepareStatement(query);
		
		ResultSet res=ps.executeQuery();
		return res;
	}

}
