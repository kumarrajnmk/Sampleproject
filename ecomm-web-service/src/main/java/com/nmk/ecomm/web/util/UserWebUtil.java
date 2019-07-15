package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.User;
import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.vo.UserAddressVO;
import com.nmk.ecomm.web.vo.UserVO;

/**
 * @author NMK OPT 1
 *
 */
public class UserWebUtil {
	public static User convertUserVOObjectToUser(final UserVO userVO) {
		final User user = new User();
		try {
			BeanUtils.copyProperties(user, userVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return user;
	}

	public static UserVO convertUserToUserVO(final User user) {
		final UserVO userVO = new UserVO();
		try {
			BeanUtils.copyProperties(userVO, user);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userVO;
	}

	public static List<User> convertUserVOListToUser(final List<UserVO> userVOList) {
		final List<User> userList = new ArrayList<User>();
		try {
			for (final UserVO userVO : userVOList) {
				final User user = new User();
				BeanUtils.copyProperties(user, userVO);
				userList.add(user);
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
		return userList;
	}

	public static List<UserVO> convertUserListToUserVOList(List<User> users) {
		List<UserVO> userList = new ArrayList<UserVO>();
		try {
			for (User user : users) {
				UserVO userVO = new UserVO();
				BeanUtils.copyProperties(userVO, users);
				userList.add(userVO);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return userList;
	}
}
