package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowAssignedJobsDao;
import com.jcg.examples.service.ShowAssignedJobsService;

public class ShowAssignedJobsServiceImpl implements ShowAssignedJobsService {

	private ShowAssignedJobsDao showAssignedJobsDao; 
	
	
	public ShowAssignedJobsDao getShowAssignedJobsDao() {
		return showAssignedJobsDao;
	}

	public void setShowAssignedJobsDao(ShowAssignedJobsDao showAssignedJobsDao) {
		this.showAssignedJobsDao = showAssignedJobsDao;
	}
	
	@Override
	public ResultSet showAssignedJobs(String email) throws SQLException {
		
		return showAssignedJobsDao.showAssignedJobs(email);
	}


}
