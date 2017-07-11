package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.UserDao;
import com.jcg.examples.service.UserService;

public class UserServiceImpl implements UserService
{

		private UserDao userDao;

		public UserDao getUserDao()
		{
				return this.userDao;
		}

		public void setUserDao(UserDao userDao)
		{
				this.userDao = userDao;
		}

		@Override
		public String isValidUser(String email, String password) throws SQLException
		{
				return userDao.isValidUser(email, password);
		}

		@Override
		public String registerSignUp(String fullName, String email, String password, String dateOfBirth,
				String usertype, String gender) throws SQLException {
			
			return userDao.registerSignUp(fullName, email, password, dateOfBirth, usertype, gender);
		}

}
