
/**
 *
 */
package com.jcg.examples.service;

import java.sql.SQLException;

public interface UserService
{
		public String isValidUser(String email, String password) throws SQLException;
		public String registerSignUp(String fullName, String email, String password, String dateOfBirth, String usertype, String gender) throws SQLException;
		
}
