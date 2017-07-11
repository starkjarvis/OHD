package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowAssignmentClientDao;
import com.jcg.examples.service.ShowAssignmentClientService;

public class ShowAssignmentClientServiceImpl implements ShowAssignmentClientService {
	private ShowAssignmentClientDao showAssignmentDao;
	public ShowAssignmentClientDao getShowAssignmentDao() {
		return showAssignmentDao;
	}
	public void setShowAssignmentDao(ShowAssignmentClientDao showAssignmentDao) {
		this.showAssignmentDao = showAssignmentDao;
	}
	@Override
	public ResultSet showAssignmentClient(String email) throws SQLException {
		
		return showAssignmentDao.showAssignmentClient(email);
	}

}
