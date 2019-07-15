package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.service.entity.EcommCardType;

/**
 * @author NMK OPT 1
 *
 */
public class CardTypeServiceUtil {
	public static CardType convertEcommCardTypeObjectToCardType(final EcommCardType ecommCardType) {
		final CardType cardType = new CardType();
		try {
			BeanUtils.copyProperties(cardType, ecommCardType);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return cardType;
	}

	public static EcommCardType convertCardTypeToEcommCardType(final CardType cardType) {
		final EcommCardType ecommCardType = new EcommCardType();
		try {
			BeanUtils.copyProperties(ecommCardType, cardType);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommCardType;
	}

	public static List<CardType> convertEcommCardTypeListToCardType(final List<EcommCardType> ecommCardTypeList) {
		final List<CardType> cardTypeList = new ArrayList<CardType>();
		try {
			for (final EcommCardType ecommCardType : ecommCardTypeList) {
				final CardType cardType = new CardType();
				BeanUtils.copyProperties(cardType, ecommCardType);
				cardTypeList.add(cardType);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTypeList;
	}
}
