package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.AddAssignmentDao;
import com.jcg.examples.service.AddAssignmentClientService;

public class AddAssignmentClientImpl implements AddAssignmentClientService {
	private AddAssignmentDao addAssignmentDao;
	
	public AddAssignmentDao getAddAssignmentDao() {
		return addAssignmentDao;
	}
	public void setAddAssignmentDao(AddAssignmentDao addAssignmentDao) {
		this.addAssignmentDao = addAssignmentDao;
	}
	@Override
	public String addAssignmentClient(String fullName, String email, String endDate, String assignmentdescription,
			String startDate, String typeOfEvent) throws SQLException {
		return addAssignmentDao.addAssignmentDao(fullName, email, endDate, assignmentdescription, startDate, typeOfEvent);
	}

}
