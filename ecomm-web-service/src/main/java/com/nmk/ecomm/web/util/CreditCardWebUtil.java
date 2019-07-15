package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.CreditCard;
import com.nmk.ecomm.web.vo.CreditCardVO;

/**
 * @author NMK OPT 1
 *
 */
public class CreditCardWebUtil {
	public static CreditCard convertCreditCardVOObjectToCreditCard(final CreditCardVO creditCardVO) {
		final CreditCard creditCard = new CreditCard();
		try {
			BeanUtils.copyProperties(creditCard, creditCardVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return creditCard;
	}

	public static CreditCardVO convertCreditCardToCreditCardVO(final CreditCard creditCard) {
		final CreditCardVO creditCardVO = new CreditCardVO();
		try {
			BeanUtils.copyProperties(creditCardVO, creditCard);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return creditCardVO;
	}

	public static List<CreditCard> convertCreditCardVOListToCreditCard(final List<CreditCardVO> creditCardVOList) {
		final List<CreditCard> creditCardList = new ArrayList<CreditCard>();
		try {
			for (final CreditCardVO creditCardVO : creditCardVOList) {
				final CreditCard creditCard = new CreditCard();
				BeanUtils.copyProperties(creditCard, creditCardVO);
				creditCardList.add(creditCard);
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
		return creditCardList;
	}
}
