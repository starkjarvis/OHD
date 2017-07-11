package com.jcg.examples.delegate;

import java.sql.*;

import com.jcg.examples.service.SentMessageService;

public class DelegateSentMessage {
	
	private SentMessageService sentMessageService;

	public SentMessageService getSentMessageService() {
		return sentMessageService;
	}

	public void setSentMessageService(SentMessageService sentMessageService) {
		this.sentMessageService = sentMessageService;
	}
	
	public ResultSet showSentMessage(String fromEmail) throws SQLException
	{
		return sentMessageService.showSentMessage(fromEmail);
	}

}
