package com.jcg.examples.dao;

import java.sql.SQLException;

public interface CirculateNoticeDao {
	
	public String circulateNotice(String toEmail, String notice) throws SQLException;

}
