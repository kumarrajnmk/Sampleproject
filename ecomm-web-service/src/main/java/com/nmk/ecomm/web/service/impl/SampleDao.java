package com.nmk.ecomm.web.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class SampleDao {

	public static boolean checkLogin1(int loginId, String loginPassword) {

		boolean flag = false;

		try {

			Connection con = DBUtil.getDBCon();

			PreparedStatement pstmt = con
					.prepareStatement("select * from ecomm_demo_db.ecomm_user where uid=? and pwd=?");

			pstmt.setInt(1, loginId);
			pstmt.setString(2, loginPassword);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				flag = true;

			} else {

				flag = false;

			}
		} catch (Exception exc) {

		}

		return flag;
	}

	public static List getCataegoryIds()

	// public static void main(String args[])

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_category";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);

		return list;

	}

	public static List getBrandIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_brand";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getAuditLogIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_audit_log";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getUserIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select uid from ecomm_user";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getUserAddressIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_user_address";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getUserCardIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_user_card";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getProductIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_product";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getOrderIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_order";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;
	}

	public static List getlocationIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_location";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getTransTypeIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_trans_type";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getCardTransactionIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_card_transaction";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getCardTypeIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_card_type";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

	public static List getOrderLineItemsTypeIds()

	{

		ArrayList list = new ArrayList();
		// System.out.println(list.size());
		try {

			Connection con = DBUtil.getDBCon();

			String selectCommand = "select idx from ecomm_order_line_items";

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(selectCommand);

			while (rs.next()) {

				int id = rs.getInt(1);

				list.add(id);
			}

		} catch (Exception exc) {

		}

		// System.out.println(list);
		return list;

	}

}
