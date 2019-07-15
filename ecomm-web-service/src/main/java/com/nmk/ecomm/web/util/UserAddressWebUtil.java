package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.vo.UserAddressVO;

/**
 * @author NMK OPT 1
 *
 */
public class UserAddressWebUtil {
	public static UserAddress convertUserAddressVOObjectToUserAddress(final UserAddressVO userAddressVO) {
		final UserAddress userAddress = new UserAddress();
		try {
			BeanUtils.copyProperties(userAddress, userAddressVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userAddress;
	}

	public static UserAddressVO convertUserAddressToUserAddressVO(final UserAddress userAddress) {
		final UserAddressVO userAddressVO = new UserAddressVO();
		try {
			BeanUtils.copyProperties(userAddressVO, userAddress);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userAddressVO;
	}

	public static List<UserAddressVO> convertUserAddressListToUserAddressVOList(final List<UserAddress> useraddresses) {
		final List<UserAddressVO> userAddressList = new ArrayList<UserAddressVO>();
		try {
			for (final UserAddress userAddress : useraddresses) {
				final UserAddressVO userAddressVO = new UserAddressVO();
				BeanUtils.copyProperties(userAddressVO, userAddress);
				userAddressList.add(userAddressVO);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userAddressList;
	}

}
