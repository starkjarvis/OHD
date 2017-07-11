package com.jcg.examples.delegate;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.service.ShowAssignedJobsService;

public class DelegateShowAssignedJobs {
	
	private ShowAssignedJobsService showAssignedJobsService;

	public ShowAssignedJobsService getShowAssignedJobsService() {
		return showAssignedJobsService;
	}

	public void setShowAssignedJobsService(ShowAssignedJobsService showAssignedJobsService) {
		this.showAssignedJobsService = showAssignedJobsService;
	}
	
	public ResultSet showAssignedJobs(String email) throws SQLException
	{
		return showAssignedJobsService.showAssignedJobs(email);
	}

}
