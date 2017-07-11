package com.jcg.examples.delegate;

import com.jcg.examples.service.ShowNoticeService;
import java.sql.*;

public class DelegateShowNotice {
	
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
