package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.SentMessageDao;

public class SentMessageDaoImpl implements SentMessageDao {

	@Override
	public ResultSet showSentMessage(String fromEmail) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="select * from message where fromEmail=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, fromEmail);
		ResultSet res=ps.executeQuery();
		return res;
	}

}
