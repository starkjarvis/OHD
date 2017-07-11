package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.jcg.examples.dao.SendMessageDao;

public class SendMessageDaoImpl implements SendMessageDao {
	
	
	@Override
	public String sendMessage(String toEmail, String message, String fromEmail) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="insert message set toEmail=? , message=? , fromEmail=?, date=?, time=?";
		
	
				Date date=new Date();
		Calendar cal = Calendar.getInstance();
		
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, toEmail);
		ps.setString(2, message);
		ps.setString(3, fromEmail);
		ps.setString(4, date.toGMTString().substring(0,11));
		ps.setString(5, cal.getTime().toString().substring(11, 20));
		
		int res=ps.executeUpdate();
		
		if(res>0)
			return "ok";
		else
			return "not";	
	}
}
