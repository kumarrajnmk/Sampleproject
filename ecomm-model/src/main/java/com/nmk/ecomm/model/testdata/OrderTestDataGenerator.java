package com.nmk.ecomm.model.testdata;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nmk.ecomm.model.Order;

public abstract class OrderTestDataGenerator {
	static List<Order> orderList = new ArrayList<Order>();
	static {
		Order order1 = new Order("Standard Delivery", new BigDecimal("450546.6544"), "Delivery In Time", 56, 7, 6, 8, 4,
				"9", "smith", new Date(2014, 8, 6), "kanna", new Date());
		order1.setIdx(1);

		Order order2 = new Order("Standard Delivery", new BigDecimal("450546.6544"), "Delivery In Time", 56, 8, 7, 9, 5,
				"10", "smith", new Date(2014, 8, 6), "kanna", new Date());
		order2.setIdx(2);

		Order order3 = new Order("Standard Delivery", new BigDecimal("450546.6544"), "Delivery In Time", 56, 9, 8, 10,
				6, "11", "smith", new Date(2014, 8, 6), "kanna", new Date());
		order3.setIdx(3);

		Order order4 = new Order("Standard Delivery", new BigDecimal("450546.6544"), "Delivery In Time", 56, 10, 9, 11,
				7, "12", "smith", new Date(2014, 8, 6), "kanna", new Date());
		order4.setIdx(4);

		Order order5 = new Order("Standard Delivery", new BigDecimal("450546.6544"), "Delivery In Time", 56, 11, 10, 12,
				8, "13", "smith", new Date(2014, 8, 6), "kanna", new Date());
		order5.setIdx(5);

		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
	}

	public static List<Order> getAllOrders() {

		return orderList;
	}
}
