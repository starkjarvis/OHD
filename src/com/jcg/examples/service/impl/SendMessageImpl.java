package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.SendMessageDao;

import com.jcg.examples.service.SendMessage;

public class SendMessageImpl implements SendMessage {
	private SendMessageDao sendMessageDao;
	public SendMessageDao getSendMessageDao() {
		return sendMessageDao;
	}
	public void setSendMessageDao(SendMessageDao sendMessageDao) {
		this.sendMessageDao = sendMessageDao;
	}
	@Override
	public String sendMessage(String toEmail, String message, String fromEmail) throws SQLException {
		
		return  sendMessageDao.sendMessage(toEmail, message, fromEmail);
	}

}
