package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.UpdateAssignmentService;

public class DelegateUpdateAssignment {
	
	private UpdateAssignmentService updateAssignmentService;

	public UpdateAssignmentService getUpdateAssignmentService() {
		return updateAssignmentService;
	}

	public void setUpdateAssignmentService(UpdateAssignmentService updateAssignmentService) {
		this.updateAssignmentService = updateAssignmentService;
	}
	
	
	public String UpdateAssignmentClient(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent, int sno) throws SQLException
	{
		return updateAssignmentService.UpdateAssignmentClient(fullName, email, endDate, assignmentdescription, startDate, typeOfEvent, sno);
	}

}
