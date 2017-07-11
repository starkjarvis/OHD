package com.jcg.examples.service.impl;

import java.sql.SQLException;

import com.jcg.examples.dao.ChangePasswordDao;
import com.jcg.examples.service.ChangePasswordService;

public class ChangePasswordServiceImpl implements ChangePasswordService {

	private ChangePasswordDao changePasswordDao;
	@Override
	public String changePassword(String email, String OldPassword, String NewPassword) throws SQLException {
		// TODO Auto-generated method stub
		return changePasswordDao.changePassword(email, OldPassword, NewPassword);
	}
	public ChangePasswordDao getChangePasswordDao() {
		return changePasswordDao;
	}
	public void setChangePasswordDao(ChangePasswordDao changePasswordDao) {
		this.changePasswordDao = changePasswordDao;
	}

}
