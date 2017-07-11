package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jcg.examples.dao.ChangePasswordDao;

public class ChangePasswordDaoImpl implements ChangePasswordDao {

	@Override
	public String changePassword(String email, String OldPassword, String NewPassword) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		
		String query="update login set password=? where email=? and password=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, NewPassword);
		ps.setString(2, email);
		ps.setString(3, OldPassword);
		
		int res=ps.executeUpdate();
				
		if(res>0)
		{
			String query2="update registration set password=? where email=?";
			PreparedStatement ps2=con.prepareStatement(query2);
			ps2.setString(1, NewPassword);
			ps2.setString(2, email);
			ps2.executeUpdate();
			return "ok";
			
		}
		else
			return "not";
	
	}

}
