package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.DeleteMessageDao;

public class DeleteMessageDaoImpl implements DeleteMessageDao {

	@Override
	public String deleteMessage(int sno) throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="delete from message where Sno=?";
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
