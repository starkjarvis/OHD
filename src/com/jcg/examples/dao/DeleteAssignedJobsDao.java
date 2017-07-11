package com.jcg.examples.dao;

import java.sql.SQLException;

public interface DeleteAssignedJobsDao {
	
	public String deleteAssignedJobs(int sno) throws SQLException;

}
