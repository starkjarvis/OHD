package com.jcg.examples.service;


import java.sql.SQLException;

public interface DeleteMessage {
	public String deleteMessage(int sno) throws SQLException;
	public String deleteAssignment(int sno) throws SQLException;
}
