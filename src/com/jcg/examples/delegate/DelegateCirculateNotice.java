package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.CirculateNoticeService;

public class DelegateCirculateNotice {
	
	private CirculateNoticeService circulateNoticeService;

	public CirculateNoticeService getCirculateNoticeService() {
		return circulateNoticeService;
	}

	public void setCirculateNoticeService(CirculateNoticeService circulateNoticeService) {
		this.circulateNoticeService = circulateNoticeService;
	}

	public String circulateNotice(String toEmail, String notice) throws SQLException
	{
		return circulateNoticeService.circulateNotice(toEmail, notice);
	}
	
}
