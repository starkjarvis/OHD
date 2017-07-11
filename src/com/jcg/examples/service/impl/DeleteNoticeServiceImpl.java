package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.DeleteNoticeDao;
import com.jcg.examples.service.DeleteNoticeService;

public class DeleteNoticeServiceImpl implements DeleteNoticeService{

	private DeleteNoticeDao deleteNoticeDao;
	@Override
	public String deleteNotice(int sno) throws SQLException {
		// TODO Auto-generated method stub
		return deleteNoticeDao.deleteNotice(sno);
	}
	public DeleteNoticeDao getDeleteNoticeDao() {
		return deleteNoticeDao;
	}
	public void setDeleteNoticeDao(DeleteNoticeDao deleteNoticeDao) {
		this.deleteNoticeDao = deleteNoticeDao;
	}

}
