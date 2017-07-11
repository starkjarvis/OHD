package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.DeleteMessage;

public class DelegateDeleteMessage {
	private DeleteMessage deleteMessage;
	

	public DeleteMessage getDeleteMessage() {
		return deleteMessage;
	}

	public void setDeleteMessage(DeleteMessage deleteMessage) {
		this.deleteMessage = deleteMessage;
	}
	
	public String deleteMessage(int sno) throws SQLException
	{
		return deleteMessage.deleteMessage(sno);
	}
	public String deleteAssignment(int sno) throws SQLException
	{
		return deleteMessage.deleteAssignment(sno);
	}
}
