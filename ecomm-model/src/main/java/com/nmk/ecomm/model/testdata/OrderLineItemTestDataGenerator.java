package com.nmk.ecomm.model.testdata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.OrderLineItems;

public abstract class OrderLineItemTestDataGenerator {
	static List<OrderLineItems> orderLineItemList = new ArrayList<OrderLineItems>();
	static {
		OrderLineItems orderLineItems1 = new OrderLineItems(new BigDecimal("56790878"), new BigDecimal("734895"),
				"dsgf", new Date(2019, 8, 10), "DAF", new Date(2019, 8, 10), 1, 32);
		orderLineItems1.setIdx(1);

		OrderLineItems orderLineItems2 = new OrderLineItems(new BigDecimal("56790878"), new BigDecimal("734895"),
				"dsgf", new Date(2019, 8, 10), "DAF", new Date(2019, 8, 10), 1, 32);
		orderLineItems2.setIdx(2);

		OrderLineItems orderLineItems3 = new OrderLineItems(new BigDecimal("56790878"), new BigDecimal("734895"),
				"dsgf", new Date(2019, 8, 10), "DAF", new Date(2019, 8, 10), 1, 32);
		orderLineItems3.setIdx(3);

		OrderLineItems orderLineItems4 = new OrderLineItems(new BigDecimal("56790878"), new BigDecimal("734895"),
				"dsgf", new Date(2019, 8, 10), "DAF", new Date(2019, 8, 10), 1, 32);
		orderLineItems4.setIdx(4);

		OrderLineItems orderLineItems5 = new OrderLineItems(new BigDecimal("56790878"), new BigDecimal("734895"),
				"dsgf", new Date(2019, 8, 10), "DAF", new Date(2019, 8, 10), 1, 32);
		orderLineItems5.setIdx(5);

		orderLineItemList.add(orderLineItems1);
		orderLineItemList.add(orderLineItems2);
		orderLineItemList.add(orderLineItems3);
		orderLineItemList.add(orderLineItems4);
		orderLineItemList.add(orderLineItems5);
	}

	public static List<OrderLineItems> getAllCardTypes() {
		return orderLineItemList;
	}
}
