package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.AddAssignmentClientService;

public class DelegateAddAssignment {
	private AddAssignmentClientService addAssignmentClientService;

	public AddAssignmentClientService getAddAssignmentClientService() {
		return addAssignmentClientService;
	}

	public void setAddAssignmentClientService(AddAssignmentClientService addAssignmentClientService) {
		this.addAssignmentClientService = addAssignmentClientService;
	}

	public String addAssignmentClient(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent) throws SQLException
	{
		return addAssignmentClientService.addAssignmentClient(fullName, email, endDate, assignmentdescription, startDate, typeOfEvent);
	}
}
