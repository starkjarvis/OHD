package com.jcg.examples.dao;

import java.sql.SQLException;

public interface AssignJobsDao {
	
	public String assignJobs(String email, int sno) throws SQLException;

}
