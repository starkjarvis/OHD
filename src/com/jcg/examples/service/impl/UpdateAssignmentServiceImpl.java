package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.UpdateAssignmentDao;
import com.jcg.examples.service.UpdateAssignmentService;

public class UpdateAssignmentServiceImpl implements UpdateAssignmentService {
	private UpdateAssignmentDao updateAssignmentDao;
	public UpdateAssignmentDao getUpdateAssignmentDao() {
		return updateAssignmentDao;
	}
	public void setUpdateAssignmentDao(UpdateAssignmentDao updateAssignmentDao) {
		this.updateAssignmentDao = updateAssignmentDao;
	}
	@Override
	public String UpdateAssignmentClient(String fullName, String email, String endDate, String assignmentdescription,
			String startDate, String typeOfEvent, int sno) throws SQLException {
		return updateAssignmentDao.updateAssignmentDao(fullName, email, endDate, assignmentdescription, startDate, typeOfEvent, sno);
	}

}


