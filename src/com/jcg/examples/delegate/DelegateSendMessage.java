package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.SendMessage;

public class DelegateSendMessage {
	private SendMessage sendMessage;

	public SendMessage getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(SendMessage sendMessage) {
		this.sendMessage = sendMessage;
	}
	
	public String sendMessage(String toEmail, String message, String fromEmail) throws SQLException
	{
		return sendMessage.sendMessage(toEmail, message, fromEmail);
	}
}
