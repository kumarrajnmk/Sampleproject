package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.CardTransaction;
import com.nmk.ecomm.web.vo.CardTransactionVO;

/**
 * @author NMK OPT 1
 *
 */
public class CardTransactionWebUtil {
	public static CardTransaction convertCardTransactionVOObjectToCardTransaction(
			final CardTransactionVO cardTransactionVO) {
		final CardTransaction cardTransaction = new CardTransaction();
		try {
			BeanUtils.copyProperties(cardTransaction, cardTransactionVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTransaction;
	}

	public static CardTransactionVO convertCardTransactionToCardTransactionVO(final CardTransaction cardTransaction) {
		final CardTransactionVO cardTransactionVO = new CardTransactionVO();
		try {
			BeanUtils.copyProperties(cardTransactionVO, cardTransaction);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTransactionVO;
	}

	public static List<CardTransactionVO> convertCardTransactionVOListToCardTransaction(
			final List<CardTransaction> cardTransaction2) {
		final List<CardTransactionVO> cardTransactionList = new ArrayList<CardTransactionVO>();
		try {
			for (CardTransactionVO cardTransactionVO : cardTransactionList) {
				CardTransactionVO cardTransaction = new CardTransactionVO();
				BeanUtils.copyProperties(cardTransaction, cardTransactionVO);
				cardTransactionList.add(cardTransaction);
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
		return cardTransactionList;
	}
}
