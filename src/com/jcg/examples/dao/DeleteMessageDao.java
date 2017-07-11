package com.jcg.examples.dao;

import java.sql.SQLException;

public interface DeleteMessageDao {
	public String deleteMessage(int sno) throws SQLException;
}
