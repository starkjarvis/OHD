package com.jcg.examples.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import com.jcg.examples.dao.CirculateNoticeDao;

public class CirculateNoticeDaoImpl implements CirculateNoticeDao {

	@Override
	public String circulateNotice(String toEmail, String notice) throws SQLException {
		
		Date date=new Date();
		Calendar cal = Calendar.getInstance();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ohd","root","root");
		String query="insert into notice(notice, fromEmail, date, time) values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1, notice);
		ps.setString(2, toEmail);
		ps.setString(3, date.toGMTString().substring(0,11));
		ps.setString(4, cal.getTime().toString().substring(11, 20));
		
		int res=ps.executeUpdate();
		
		if(res>0)
			return "ok";
		else
			return "not";	
		
		
		
	}

}
