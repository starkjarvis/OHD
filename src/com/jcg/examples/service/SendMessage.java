package com.jcg.examples.service;


import java.sql.SQLException;

public interface SendMessage {
	public String sendMessage(String toEmail, String message, String fromEmail) throws SQLException;
}
