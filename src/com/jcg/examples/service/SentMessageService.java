package com.jcg.examples.service;

import java.sql.*;

public interface SentMessageService {
	
	public ResultSet showSentMessage(String fromEmail) throws SQLException;

}
