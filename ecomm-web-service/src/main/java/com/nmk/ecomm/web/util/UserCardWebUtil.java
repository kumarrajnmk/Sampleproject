package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.UserCard;
import com.nmk.ecomm.web.vo.UserCardVO;

/**
 * @author NMK OPT 1
 *
 */
public class UserCardWebUtil {

	public static UserCard convertUserCardVOObjectToUserCard(final UserCardVO usercardVO) {
		final UserCard usercard = new UserCard();
		try {
			BeanUtils.copyProperties(usercard, usercardVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return usercard;
	}

	public static UserCardVO convertUserCardToUserCardVO(final UserCard usercard) {
		final UserCardVO usercardVO = new UserCardVO();
		try {
			BeanUtils.copyProperties(usercardVO, usercard);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return usercardVO;
	}

	public static List<UserCardVO> convertUserCardListToUserCardVOList(final List<UserCard> usercards) {
		final List<UserCardVO> usercardList = new ArrayList<UserCardVO>();
		try {
			BeanUtils.copyProperties(usercardList, usercards);

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return usercardList;
	}
}
