package com.jcg.examples.delegate;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.service.GetMessage;

public class DelegateGetMessage {
	private GetMessage getMessage;

	

	public GetMessage getGetMessage() {
		return getMessage;
	}



	public void setGetMessage(GetMessage getMessage) {
		this.getMessage = getMessage;
	}



	public ResultSet getMessage(String email) throws SQLException
	{
		return getMessage.getMessage(email);
	}
}
