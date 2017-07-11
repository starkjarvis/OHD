package com.jcg.examples.service;

import java.sql.SQLException;

public interface AssignJobsService {
	
	public String assignJobs(String email, int sno) throws SQLException;

}
