package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.ChangePasswordService;

public class DelegateChangePassword {
	
	private ChangePasswordService changePasswordService;

	public ChangePasswordService getChangePasswordService() {
		return changePasswordService;
	}

	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}
	
	public String changePassword(String email, String OldPassword, String NewPassword) throws SQLException
	{
		return changePasswordService.changePassword(email, OldPassword, NewPassword);
		
	}

}
