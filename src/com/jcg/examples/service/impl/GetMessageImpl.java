package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.UserDao;
import com.jcg.examples.service.GetMessage;

public class GetMessageImpl implements GetMessage{

	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public ResultSet getMessage(String email) throws SQLException {
		
		return userDao.getMessage(email);
	}

}
