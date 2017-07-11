package com.jcg.examples.delegate;

import java.sql.*;

import com.jcg.examples.service.ShowRegistrationTableService;

public class DelegateShowRegistrationTable {
	
	private ShowRegistrationTableService showRegistrationTableService;

	public ShowRegistrationTableService getShowRegistrationTableService() {
		return showRegistrationTableService;
	}

	public void setShowRegistrationTableService(ShowRegistrationTableService showRegistrationTableService) {
		this.showRegistrationTableService = showRegistrationTableService;
	}
	
	public ResultSet showRegistrationTable() throws SQLException
	{
		return showRegistrationTableService.showRegistrationTable();
		
	}

}
