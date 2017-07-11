package com.jcg.examples.dao;

import java.sql.SQLException;

public interface SendMessageDao {
	public String sendMessage(String toEmail, String message, String fromEmail) throws SQLException;
}
