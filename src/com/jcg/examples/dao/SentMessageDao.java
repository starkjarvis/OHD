package com.jcg.examples.dao;

import java.sql.*;

public interface SentMessageDao {
	
	public ResultSet showSentMessage(String fromEmail) throws SQLException;

}
