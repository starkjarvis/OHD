package com.jcg.examples.dao;

import java.sql.SQLException;

public interface ChangePasswordDao {
	
	public String changePassword(String email, String OldPassword, String NewPassword) throws SQLException;

}
