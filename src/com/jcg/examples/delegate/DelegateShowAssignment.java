package com.jcg.examples.delegate;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.service.ShowAssignmentAdminService;
import com.jcg.examples.service.ShowAssignmentClientService;

public class DelegateShowAssignment {
	private ShowAssignmentClientService showAssignmentClientService;
	private ShowAssignmentAdminService showAssignmentAdminService;

	public ShowAssignmentClientService getShowAssignmentClientService() {
		return showAssignmentClientService;
	}

	public void setShowAssignmentClientService(ShowAssignmentClientService showAssignmentClientService) {
		this.showAssignmentClientService = showAssignmentClientService;
	}
	
	

	public ShowAssignmentAdminService getShowAssignmentAdminService() {
		return showAssignmentAdminService;
	}

	public void setShowAssignmentAdminService(ShowAssignmentAdminService showAssignmentAdminService) {
		this.showAssignmentAdminService = showAssignmentAdminService;
	}
	
	
	
	
	
	public ResultSet showAssignmentClient(String email) throws SQLException
	{
		return showAssignmentClientService.showAssignmentClient(email);
	}
	
	public ResultSet showAssignmentAdmin() throws SQLException
	{
		return showAssignmentAdminService.showAssignmentAdmin();
	}
	
	
}
