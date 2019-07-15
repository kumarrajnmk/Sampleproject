package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.UserAddress;

import com.nmk.ecomm.service.entity.EcommUserAddress;

/**
 * @author NMK OPT 1
 *
 */
public class UserAddressServiceUtil {
	public static UserAddress convertEcommUserAddressObjectToUserAddress(final EcommUserAddress ecommUserAddress) {
		final UserAddress userAddress = new UserAddress();
		try {
			BeanUtils.copyProperties(userAddress, ecommUserAddress);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userAddress;
	}

	public static EcommUserAddress convertUserAddressToEcommUserAddress(final UserAddress userAddress) {
		final EcommUserAddress ecommUserAddress = new EcommUserAddress();
		try {
			BeanUtils.copyProperties(ecommUserAddress, userAddress);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommUserAddress;
	}

	public static List<UserAddress> convertEcommUserAddressListToUserAddress(
			final List<EcommUserAddress> ecommUserAddressList) {
		final List<UserAddress> transTypeList = new ArrayList<UserAddress>();
		try {
			for (final EcommUserAddress ecommUserAddress : ecommUserAddressList) {
				final UserAddress userAddress = new UserAddress();
				BeanUtils.copyProperties(userAddress, ecommUserAddress);
				transTypeList.add(userAddress);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return transTypeList;
	}
}
