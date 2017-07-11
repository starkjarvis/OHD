package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowNoticeDao;
import com.jcg.examples.service.ShowNoticeService;

public class ShowNoticeServiceImpl implements ShowNoticeService {

	private ShowNoticeDao showNoticeDao;
	@Override
	public ResultSet showNotice() throws SQLException {
		
		return showNoticeDao.showNotice();
	}
	public ShowNoticeDao getShowNoticeDao() {
		return showNoticeDao;
	}
	public void setShowNoticeDao(ShowNoticeDao showNoticeDao) {
		this.showNoticeDao = showNoticeDao;
	}

}
