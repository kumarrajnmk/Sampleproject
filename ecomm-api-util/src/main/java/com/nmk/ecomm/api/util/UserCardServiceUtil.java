package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.UserCard;
import com.nmk.ecomm.service.entity.EcommUserCard;

/**
 * @author NMK OPT 1
 *
 */
public class UserCardServiceUtil {
	public static UserCard convertEcommUserCardObjectToUserCard(final EcommUserCard ecommUserCard) {
		final UserCard userCard = new UserCard();
		try {
			BeanUtils.copyProperties(userCard, ecommUserCard);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userCard;
	}

	public static EcommUserCard convertUserCardToEcommUserCard(final UserCard userCard) {
		final EcommUserCard ecommUserCard = new EcommUserCard();
		try {
			BeanUtils.copyProperties(ecommUserCard, userCard);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommUserCard;
	}

	public static List<UserCard> convertEcommUserCardListToUserCard(final List<EcommUserCard> ecommUserCardList) {
		final List<UserCard> userCardList = new ArrayList<UserCard>();
		try {
			for (final EcommUserCard ecommUserCard : ecommUserCardList) {
				final UserCard userCard = new UserCard();
				BeanUtils.copyProperties(userCard, ecommUserCard);
				userCardList.add(userCard);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return userCardList;
	}
}
