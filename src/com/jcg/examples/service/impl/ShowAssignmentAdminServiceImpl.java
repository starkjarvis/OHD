package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowAssignmentAdminDao;
import com.jcg.examples.service.ShowAssignmentAdminService;

public class ShowAssignmentAdminServiceImpl implements ShowAssignmentAdminService {
	
	private ShowAssignmentAdminDao showAssignmentAdminDao;

	@Override
	public ResultSet showAssignmentAdmin() throws SQLException {
		return showAssignmentAdminDao.showAssignmentAdmin();
	}

	public ShowAssignmentAdminDao getShowAssignmentAdminDao() {
		return showAssignmentAdminDao;
	}

	public void setShowAssignmentAdminDao(ShowAssignmentAdminDao showAssignmentAdminDao) {
		this.showAssignmentAdminDao = showAssignmentAdminDao;
	}

}
