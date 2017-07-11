package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.CirculateNoticeDao;
import com.jcg.examples.service.CirculateNoticeService;

public class CirculateNoticeServiceImpl implements CirculateNoticeService {

	private CirculateNoticeDao circulateNoticeDao;

	public CirculateNoticeDao getCirculateNoticeDao() {
		return circulateNoticeDao;
	}

	public void setCirculateNoticeDao(CirculateNoticeDao circulateNoticeDao) {
		this.circulateNoticeDao = circulateNoticeDao;
	}
	
	@Override
	public String circulateNotice(String toEmail, String notice) throws SQLException {
		
		return circulateNoticeDao.circulateNotice(toEmail, notice);
	}

}
