package com.jcg.examples.service;

import java.sql.SQLException;

public interface CirculateNoticeService {
	
	public String circulateNotice(String toEmail, String notice) throws SQLException;

}
