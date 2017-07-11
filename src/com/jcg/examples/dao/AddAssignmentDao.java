package com.jcg.examples.dao;

import java.sql.SQLException;

public interface AddAssignmentDao {
	public String addAssignmentDao(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent) throws SQLException;
	
}
