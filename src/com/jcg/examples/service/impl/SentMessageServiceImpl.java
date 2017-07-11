package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.SentMessageDao;
import com.jcg.examples.service.SentMessageService;

public class SentMessageServiceImpl implements SentMessageService {

	
	private SentMessageDao sentMessageDao;
	@Override
	public ResultSet showSentMessage(String fromEmail) throws SQLException {
		
		return sentMessageDao.showSentMessage(fromEmail);
	}
	public SentMessageDao getSentMessageDao() {
		return sentMessageDao;
	}
	public void setSentMessageDao(SentMessageDao sentMessageDao) {
		this.sentMessageDao = sentMessageDao;
	}

}
