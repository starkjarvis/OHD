package com.jcg.examples.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ShowAssignmentClientDao {
	public ResultSet showAssignmentClient(String email) throws SQLException;
}
