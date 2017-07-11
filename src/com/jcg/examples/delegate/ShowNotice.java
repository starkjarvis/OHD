package com.jcg.examples.delegate;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.service.ShowNoticeService;

public class ShowNotice {

	private ShowNoticeService showNoticeService;

	public ShowNoticeService getShowNoticeService() {
		return showNoticeService;
	}

	public void setShowNoticeService(ShowNoticeService showNoticeService) {
		this.showNoticeService = showNoticeService;
	}
	
	public ResultSet showNotice() throws SQLException
	{
		return showNoticeService.showNotice();
	}
}
