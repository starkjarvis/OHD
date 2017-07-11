package com.jcg.examples.delegate;

import java.sql.SQLException;

import com.jcg.examples.service.UserService;

public class LoginDelegate
{
		private UserService userService;

		public UserService getUserService()
		{
				return this.userService;
		}

		public void setUserService(UserService userService)
		{
				this.userService = userService;
		}

		public String isValidUser(String email, String password) throws SQLException
		{
		    return userService.isValidUser(email, password);
		}
		public String registerSignUp(String fullName, String email, String password, String dateOfBirth, String usertype, String gender) throws SQLException
	    {
			    return userService.registerSignUp(fullName, email, password, dateOfBirth, usertype, gender);
	    }
		
}
