package com.jcg.examples.delegate;

import java.sql.SQLException;


import com.jcg.examples.service.AssignJobsService;

public class DelegateAssignJobs {
	
	private AssignJobsService assignJobsService;

	
	

	public AssignJobsService getAssignJobsService() {
		return assignJobsService;
	}



	public void setAssignJobsService(AssignJobsService assignJobsService) {
		this.assignJobsService = assignJobsService;
	}
	

	public String assignJobs(String email, int sno) throws SQLException
	{
		return assignJobsService.assignJobs(email, sno);
	}



}
