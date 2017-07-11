package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.AssignJobsDao;
import com.jcg.examples.service.AssignJobsService;

public class AssignJobsServiceImpl implements AssignJobsService{
	private AssignJobsDao assignJobsDao;
	
	
	
	public AssignJobsDao getAssignJobsDao() {
		return assignJobsDao;
	}
	public void setAssignJobsDao(AssignJobsDao assignJobsDao) {
		this.assignJobsDao = assignJobsDao;
	}

	@Override
	public String assignJobs(String email, int sno) throws SQLException {
		return assignJobsDao.assignJobs(email, sno);
	}
	
	
	
}
