package com.jcg.examples.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jcg.examples.dao.ShowRegistrationTableDao;
import com.jcg.examples.service.ShowRegistrationTableService;

public class ShowRegistrationTableServiceImpl implements ShowRegistrationTableService{

	private ShowRegistrationTableDao showRegistrationTableDao;
	
	public ShowRegistrationTableDao getShowRegistrationTableDao() {
		return showRegistrationTableDao;
	}

	public void setShowRegistrationTableDao(ShowRegistrationTableDao showRegistrationTableDao) {
		this.showRegistrationTableDao = showRegistrationTableDao;
	}

	@Override
	public ResultSet showRegistrationTable() throws SQLException {
		
		return showRegistrationTableDao.showRegistrationTable();
	}

}
