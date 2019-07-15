package com.nmk.ecomm.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nmk.ecomm.web.service.impl.DBUtil;

public class UserForgotJDBC {

	private static String mobilephone;

	private static String newpassword;

	public static String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public static String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	private static final String sqlUpdate = "UPDATE ecomm_user " + "SET pwd = ? " + "WHERE mobile_phone	 = ?";

	public static List<String> getEmails() throws ClassNotFoundException, SQLException {

		DBUtil dBCon = new DBUtil();
		Connection con = dBCon.getDBCon();

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select email_address from ecomm_user");
		List<String> ll = new ArrayList<>();
		while (rs.next()) {
			String l = rs.getString(1);
			ll.add(l);
		}
		System.out.println(ll);
		return ll;

	}

/*	public static void updatePassword() throws SQLException {

		DBUtil dBCon = new DBUtil();
		Connection con = dBCon.getDBCon();

		PreparedStatement preparedStatement = con.prepareStatement(sqlUpdate);
		String mobile = getMobilephone();
		String newpass = getNewpassword();

		preparedStatement.setString(1, newpass);
		preparedStatement.setString(2, mobile);
		int row = preparedStatement.executeUpdate();

		// rows affected
		System.out.println(row);

	}*/

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
	 getEmails();
/*		updatePassword();
*/	}

}