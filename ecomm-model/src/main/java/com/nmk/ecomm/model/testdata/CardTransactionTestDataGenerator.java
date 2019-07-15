package com.nmk.ecomm.model.testdata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.CardTransaction;

public abstract class CardTransactionTestDataGenerator {
	static List<CardTransaction> cardTransactionList = new ArrayList<CardTransaction>();
	static {
		CardTransaction cardTransaction1 = new CardTransaction("2", "online", new Date(2019, 6, 4),
				new BigDecimal("6726809.49"), "payment successful", 3, 4, "sami", new Date(2018, 5, 7), "santosh",
				new Date());
		cardTransaction1.setIdx(1);

		CardTransaction cardTransaction2 = new CardTransaction("3", "debit", new Date(2019, 6, 4),
				new BigDecimal("6726809.49"), "payment successful", 3, 4, "sami", new Date(2018, 5, 7), "santosh",
				new Date());
		;
		cardTransaction2.setIdx(2);

		CardTransaction cardTransaction3 = new CardTransaction("4", "credit", new Date(2019, 6, 4),
				new BigDecimal("6726809.49"), "payment successful", 3, 4, "sami", new Date(2018, 5, 7), "santosh",
				new Date());
		;
		cardTransaction3.setIdx(3);

		CardTransaction cardTransaction4 = new CardTransaction("5", "online", new Date(2019, 6, 4),
				new BigDecimal("6726809.49"), "payment successful", 3, 4, "sami", new Date(2018, 5, 7), "santosh",
				new Date());
		;
		cardTransaction4.setIdx(4);

		CardTransaction cardTransaction5 = new CardTransaction("6", "Upi", new Date(2019, 6, 4),
				new BigDecimal("6726809.49"), "payment successful", 3, 4, "sami", new Date(2018, 5, 7), "santosh",
				new Date());
		;
		cardTransaction5.setIdx(5);

		cardTransactionList.add(cardTransaction1);
		cardTransactionList.add(cardTransaction2);
		cardTransactionList.add(cardTransaction3);
		cardTransactionList.add(cardTransaction4);
		cardTransactionList.add(cardTransaction5);
	}

	public static List<CardTransaction> getAllUsers() {

		return cardTransactionList;
	}
}
