package com.jcg.examples.service;

import java.sql.SQLException;

public interface UpdateAssignmentService {
	public String UpdateAssignmentClient(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent, int sno) throws SQLException;
}
