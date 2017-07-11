package com.jcg.examples.dao;

import java.sql.SQLException;

public interface UpdateAssignmentDao {
	
	public String updateAssignmentDao(String fullName,  String email, String endDate, String assignmentdescription, String startDate, String typeOfEvent, int sno) throws SQLException;

}
