package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.web.vo.CardTypeVO;

/**
 * @author NMK OPT 1
 *
 */
public class CardTypeWebUtil {

	public static CardType convertCardTypeVOObjectToCardType(final CardTypeVO cardTypeVO) {
		final CardType cardType = new CardType();
		try {
			BeanUtils.copyProperties(cardType, cardTypeVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardType;
	}

	public static CardTypeVO convertCardTypeToCardTypeVO(final CardType cardType) {
		final CardTypeVO cardTypeVO = new CardTypeVO();
		try {
			BeanUtils.copyProperties(cardTypeVO, cardType);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTypeVO;
	}

	public static List<CardTypeVO> convertCardTypeListToCardTypeVOList(final List<CardType> cardTypes) {
		final List<CardTypeVO> cardTypeList = new ArrayList<CardTypeVO>();
		try {
			for (final CardType cardType : cardTypes) {
				final	CardTypeVO cardTypeVO = new CardTypeVO();
				BeanUtils.copyProperties(cardType, cardTypeVO);
				cardTypeList.add(cardTypeVO);
			}
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
		return cardTypeList;
	}
}
