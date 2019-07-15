package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Order;

import com.nmk.ecomm.service.entity.EcommOrder;

/**
 * @author NMK OPT 1
 *
 */
public class OrderServiceUtil {
	public static Order convertEcommOrderObjectToOrder(final EcommOrder ecommOrder) {
		final Order order = new Order();
		try {
			BeanUtils.copyProperties(order, ecommOrder);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return order;
	}

	public static EcommOrder convertOrderToEcommOrder(final Order order) {
		final EcommOrder ecommOrder = new EcommOrder();
		try {
			BeanUtils.copyProperties(ecommOrder, order);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommOrder;
	}

	public static List<Order> convertEcommOrderListToOrder(final List<EcommOrder> ecommOrderList) {
		final List<Order> orderList = new ArrayList<Order>();
		try {
			for (final EcommOrder ecommOrder : ecommOrderList) {
				final Order order = new Order();
				BeanUtils.copyProperties(order, ecommOrder);
				orderList.add(order);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderList;
	}
}
