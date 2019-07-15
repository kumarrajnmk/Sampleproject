package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.User;

import com.nmk.ecomm.service.entity.EcommUser;

/**
 * @author NMK OPT 1
 *
 */
public class UserServiceUtil {
	public static User convertEcommUserObjectToUser(final EcommUser ecommUser) {
		final User user = new User();
		try {
			BeanUtils.copyProperties(user, ecommUser);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return user;
	}

	public static EcommUser convertUserToEcommUser(final User user) {
		final EcommUser ecommUser = new EcommUser();
		try {
			BeanUtils.copyProperties(ecommUser, user);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommUser;
	}

	public static List<User> convertEcommUserListToUser(final List<EcommUser> ecommTransTypeList) {
		final List<User> transTypeList = new ArrayList<User>();
		try {
			for (final EcommUser ecommTransType : ecommTransTypeList) {
				final User transType = new User();
				BeanUtils.copyProperties(transType, ecommTransType);
				transTypeList.add(transType);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transTypeList;
	}
}
