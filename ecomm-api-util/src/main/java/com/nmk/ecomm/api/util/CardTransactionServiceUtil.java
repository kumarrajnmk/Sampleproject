
package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.CardTransaction;

import com.nmk.ecomm.service.entity.EcommCardTransaction;

/**
 * @author NMK OPT 1
 *
 */
public class CardTransactionServiceUtil {
	public static CardTransaction convertEcommCardTransactionObjectToCardTransaction(
			final EcommCardTransaction ecommCardTransaction) {
		final CardTransaction cardTransaction = new CardTransaction();
		try {
			BeanUtils.copyProperties(cardTransaction, ecommCardTransaction);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTransaction;
	}

	public static EcommCardTransaction convertCardTransactionoEcommCardTransaction(
			final CardTransaction cardTransaction) {
		final EcommCardTransaction ecommCardTransaction = new EcommCardTransaction();
		try {
			BeanUtils.copyProperties(ecommCardTransaction, cardTransaction);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommCardTransaction;
	}

	public static List<CardTransaction> convertEcommCardTransactionListToCardTransaction(
			final List<EcommCardTransaction> ecommCardTransactionList) {
		final List<CardTransaction> cardTransactionList = new ArrayList<CardTransaction>();
		try {
			for (final EcommCardTransaction ecommCardTransaction : ecommCardTransactionList) {
				final CardTransaction cardTransaction = new CardTransaction();
				BeanUtils.copyProperties(cardTransaction, ecommCardTransaction);
				cardTransactionList.add(cardTransaction);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return cardTransactionList;
	}
}
