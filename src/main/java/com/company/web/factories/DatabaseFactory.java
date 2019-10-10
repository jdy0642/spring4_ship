package com.company.web.factories;

import com.company.web.enums.DB;

public class DatabaseFactory {
	public static Database createDatabase(String vendor) {
		Database db = null;
		
		switch (DB.valueOf(vendor)) {
		case ORACLE:
			db = new Oracle();
			break;

		default:
			break;
		}
		return db;
	}
}
