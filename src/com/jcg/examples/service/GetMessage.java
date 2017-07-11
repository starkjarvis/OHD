package com.jcg.examples.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface GetMessage {
	public ResultSet getMessage(String email) throws SQLException;
}
