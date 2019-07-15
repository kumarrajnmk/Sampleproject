package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.CreditCard;

/**
 * @author NMK OPT 1
 *
 */
public abstract class CreditCardTestDataGenerator {

	public CreditCardTestDataGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	static List<CreditCard> creditCardList = new ArrayList<CreditCard>();
	static {
		final CreditCard creditCard1 = new CreditCard("ro", "hai", "icici", new Date(2017, 9, 10), 121, 12314, "rao",
				"r", "hyd", "rao", new Date(), "rao", new Date(), 123, 454);
		creditCard1.setIdx(1);

		final CreditCard creditCard2 = new CreditCard("o", "hai", "icici", new Date(2017, 9, 10), 121, 12314, "rao",
				"r", "hyd", "rao", new Date(), "rao", new Date(), 123, 454);

		final CreditCard creditCard3 = new CreditCard("ra", "hai", "icici", new Date(2017, 9, 10), 121, 12314, "rao",
				"r", "hyd", "rao", new Date(), "rao", new Date(), 123, 454);

		final CreditCard creditCard4 = new CreditCard("ao", "hai", "icici", new Date(2017, 9, 10), 121, 12314, "rao",
				"r", "hyd", "rao", new Date(), "rao", new Date(), 123, 454);
		creditCard4.setIdx(4);

		creditCardList.add(creditCard1);
		creditCardList.add(creditCard2);
		creditCardList.add(creditCard3);
		creditCardList.add(creditCard4);
	}
}
