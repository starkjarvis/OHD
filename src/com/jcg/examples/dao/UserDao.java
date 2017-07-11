package com.jcg.examples.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDao
{
		public String isValidUser(String email, String password) throws SQLException;
		public String registerSignUp(String fullName, String email, String password, String dateOfBirth, String usertype, String gender) throws SQLException;
		public ResultSet getMessage(String email) throws SQLException;
}
