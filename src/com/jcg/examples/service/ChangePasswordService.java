package com.jcg.examples.service;

import java.sql.SQLException;

public interface ChangePasswordService {
	
	public String changePassword(String email, String OldPassword, String NewPassword) throws SQLException;

}
