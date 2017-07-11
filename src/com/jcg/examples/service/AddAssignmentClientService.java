package com.jcg.examples.service;

import java.sql.SQLException;


public interface AddAssignmentClientService {
	public String addAssignmentClient(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent) throws SQLException;
}
