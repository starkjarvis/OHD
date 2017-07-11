package com.jcg.examples.dao.impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.sql.DataSource;


import com.jcg.examples.dao.UserDao;

public class UserDaoImpl implements UserDao
{

		@Override
		public String isValidUser(String email, String password) throws SQLException
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
				String query = "Select * from login where email=? and password=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, email);
				pstmt.setString(2, password);
				ResultSet resultSet = pstmt.executeQuery();
				if (resultSet.next())
						return resultSet.getString("usertype");
				else
						return "";
				
		}

		@Override
		public String registerSignUp(String fullName, String email, String password, String dateOfBirth,
				String usertype, String gender) throws SQLException {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String result="ok";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
			String query2="select * from registration where email=?";
			PreparedStatement ps2=con.prepareStatement(query2);
			ps2.setString(1, email);
			ResultSet res=ps2.executeQuery();
			
			if(res.next())
			{
				result="not";
			}
			
			else
			{
			String query="insert into registration(fullName, email, password, dateOfBirth, usertype, gender) values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, fullName);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, dateOfBirth);
			ps.setString(5, usertype.toLowerCase());
			ps.setString(6, gender);
		
			ps.executeUpdate();
			
			
			String query1="insert into login(email, password, usertype) values(?, ?, ?)";
			PreparedStatement ps1=con.prepareStatement(query1);
			ps1.setString(1, email);
			ps1.setString(2, password);
			ps1.setString(3, usertype.toLowerCase());
			ps1.executeUpdate();
			}
			return result;
			
		
		}

		@Override
		public ResultSet getMessage(String email) throws SQLException {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
			String query="select * from message where toEmail=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, email);
			ResultSet res=ps.executeQuery();
			
			return res;
		}

}