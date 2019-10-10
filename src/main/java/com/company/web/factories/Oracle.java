package com.company.web.factories;

import java.sql.Connection;
import java.sql.DriverManager;

import com.company.web.enums.DBDriver;
import com.company.web.enums.DBUrl;
import com.company.web.pool.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL
					.toString(),Constants.USERNAME,Constants.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
