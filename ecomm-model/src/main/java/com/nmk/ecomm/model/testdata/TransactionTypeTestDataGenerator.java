package com.nmk.ecomm.model.testdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.Category;
import com.nmk.ecomm.model.TransType;

public abstract class TransactionTypeTestDataGenerator {
	static List<TransType> transList = new ArrayList<TransType>();
	static {
		TransType transactionType1 = new TransType("siva", "john", "user1", new Date(2019, 8, 10), "gopi", new Date());
		transactionType1.setIdx(1);

		TransType transactionType2 = new TransType("gopi", "john", "user1", new Date(2019, 8, 10), "gopi", new Date());
		transactionType2.setIdx(2);

		TransType transactionType3 = new TransType("kumar", "john", "user1", new Date(2019, 8, 10), "gopi", new Date());
		transactionType3.setIdx(3);

		TransType transactionType4 = new TransType("raheem", "john", "user1", new Date(2019, 8, 10), "gopi",
				new Date());
		transactionType4.setIdx(4);

		TransType transactionType5 = new TransType("rao", "john", "user1", new Date(2019, 8, 10), "gopi", new Date());
		transactionType5.setIdx(5);

		transList.add(transactionType1);
		transList.add(transactionType2);
		transList.add(transactionType3);
		transList.add(transactionType4);
		transList.add(transactionType5);
	}

	public static List<TransType> getAllCardTypes() {
		return transList;
	}
}
