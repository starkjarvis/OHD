package com.jcg.examples.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ShowAssignedJobsDao {
	
	public ResultSet showAssignedJobs(String email) throws SQLException ;

}
