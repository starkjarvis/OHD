package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.DeleteAssignmentDao;
import com.jcg.examples.dao.DeleteMessageDao;
import com.jcg.examples.service.DeleteMessage;

public class DeleteMessageImpl implements DeleteMessage {

	private DeleteMessageDao deleteMessageDao;
	private DeleteAssignmentDao deleteAssignmentDao;
	
	public DeleteAssignmentDao getDeleteAssignmentDao() {
		return deleteAssignmentDao;
	}

	public void setDeleteAssignmentDao(DeleteAssignmentDao deleteAssignmentDao) {
		this.deleteAssignmentDao = deleteAssignmentDao;
	}

	public DeleteMessageDao getDeleteMessageDao() {
		return deleteMessageDao;
	}

	public void setDeleteMessageDao(DeleteMessageDao deleteMessageDao) {
		this.deleteMessageDao = deleteMessageDao;
	}

	@Override
	public String deleteMessage(int sno) throws SQLException {
		
		return deleteMessageDao.deleteMessage(sno);
	}
	
	
	public String deleteAssignment(int sno) throws SQLException {
		
		return deleteAssignmentDao.deleteMessage(sno);
	}

	
}
