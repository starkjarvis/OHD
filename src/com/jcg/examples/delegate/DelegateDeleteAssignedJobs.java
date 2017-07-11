package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.DeleteAssignedJobsService;

public class DelegateDeleteAssignedJobs {
	
	private DeleteAssignedJobsService deleteAssignedJobsService;

	public DeleteAssignedJobsService getDeleteAssignedJobsService() {
		return deleteAssignedJobsService;
	}

	public void setDeleteAssignedJobsService(DeleteAssignedJobsService deleteAssignedJobsService) {
		this.deleteAssignedJobsService = deleteAssignedJobsService;
	}
	
	public String deleteAssignedJobs(int sno) throws SQLException
	{
		return deleteAssignedJobsService.deleteAssignedJobs(sno);
	}

}
