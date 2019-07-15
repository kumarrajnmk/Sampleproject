package com.nmk.ecomm.api.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.OrderLineItems;
import com.nmk.ecomm.service.entity.EcommOrderLineItems;

/**
 * @author NMK OPT 1
 *
 */
public class OrderLineItemsServiceUtil {
	public static OrderLineItems convertEcommOrderLineItemsObjectToOrderLineItems(
			final EcommOrderLineItems ecommOrderLineItems) {
		final OrderLineItems orderLineItems = new OrderLineItems();
		try {
			BeanUtils.copyProperties(orderLineItems, ecommOrderLineItems);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderLineItems;
	}

	public static EcommOrderLineItems convertOrderLineItemsToEcommOrderLineItems(final OrderLineItems orderLineItems) {
		final EcommOrderLineItems ecommOrderLineItems = new EcommOrderLineItems();
		try {
			BeanUtils.copyProperties(ecommOrderLineItems, orderLineItems);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return ecommOrderLineItems;
	}

	public static List<OrderLineItems> convertEcommOrderLineItemsListToOrderLineItems(
			final List<EcommOrderLineItems> ecommOrderLineItemsList) {
		final List<OrderLineItems> orderLineItemsList = new ArrayList<OrderLineItems>();
		try {
			for (final EcommOrderLineItems ecommOrderLineItems : ecommOrderLineItemsList) {
				final OrderLineItems orderLineItems = new OrderLineItems();
				BeanUtils.copyProperties(orderLineItems, ecommOrderLineItems);
				orderLineItemsList.add(orderLineItems);
			}
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated caStch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderLineItemsList;
	}
}
