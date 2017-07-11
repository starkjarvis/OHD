package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.DeleteNoticeService;

public class DelegateDeleteNotice {
	
	private DeleteNoticeService deleteNoticeService;

	public DeleteNoticeService getDeleteNoticeService() {
		return deleteNoticeService;
	}

	public void setDeleteNoticeService(DeleteNoticeService deleteNoticeService) {
		this.deleteNoticeService = deleteNoticeService;
	}

	public String deleteNotice(int sno) throws SQLException
	{
		return deleteNoticeService.deleteNotice(sno);
	}
}
