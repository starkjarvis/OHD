package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.DeleteAssignedJobsDao;
import com.jcg.examples.service.DeleteAssignedJobsService;

public class DeleteAssignedJobsServiceImpl implements DeleteAssignedJobsService {

	
	private DeleteAssignedJobsDao deleteAssignedJobsDao;
	
	public DeleteAssignedJobsDao getDeleteAssignedJobsDao() {
		return deleteAssignedJobsDao;
	}
	public void setDeleteAssignedJobsDao(DeleteAssignedJobsDao deleteAssignedJobsDao) {
		this.deleteAssignedJobsDao = deleteAssignedJobsDao;
	}
	
	@Override
	public String deleteAssignedJobs(int sno) throws SQLException {
		
		return deleteAssignedJobsDao.deleteAssignedJobs(sno);
	}

}
