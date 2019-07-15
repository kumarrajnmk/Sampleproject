package com.nmk.ecomm.web.service.impl;

import java.sql.*;

public class DBUtil {

	public static Connection getDBCon() {

		Connection con = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://nmkglobal.com:3306/ecomm_demo_db_QA1", "ecomm_demo",
					"ecomm_demo");

		} catch (Exception exc) {

			// System.out.println(exc);

		}
		return con;

	}

}
