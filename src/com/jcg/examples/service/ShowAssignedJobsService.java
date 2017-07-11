package com.jcg.examples.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ShowAssignedJobsService {
	
	public ResultSet showAssignedJobs(String email) throws SQLException;
	
}
