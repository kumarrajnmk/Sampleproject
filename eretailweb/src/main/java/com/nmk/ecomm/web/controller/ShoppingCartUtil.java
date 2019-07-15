package com.nmk.ecomm.web.controller;

import java.util.ArrayList;

/**
 * ShoppingCartUtil
 *
 */


public class ShoppingCartUtil {

	/**
	 * @shoppingCart1
	 */
	private static ArrayList shoppingCart1;
	/**
	 * @address
	 *
	 */
	private static String address;
	/**
	 * @contact
	 *
	 */
	private static String contact;
	/**
	 * @name
	 *
	 */
	private static String name; 

	public static ArrayList getShoppingCart() {
		return shoppingCart1;
	}

	public static void setShoppingCart(ArrayList shoppingCart) {
		shoppingCart1 = shoppingCart;
	}

	/**
	 * @return
	 */
	public static String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public static void setAddress(final String address) {
		ShoppingCartUtil.address = address;
	}

	/**
	 * @return
	 */
	public static String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 */
	public static void setContact(final String contact) {
		ShoppingCartUtil.contact = contact;
	}

	/**
	 * @return
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public static void setName(final String name) {
		ShoppingCartUtil.name = name;
	}
	
	
	
	
}
