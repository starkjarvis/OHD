package com.jcg.examples.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ShowAssignmentClientService {
	
	public ResultSet showAssignmentClient(String email) throws SQLException;

}
