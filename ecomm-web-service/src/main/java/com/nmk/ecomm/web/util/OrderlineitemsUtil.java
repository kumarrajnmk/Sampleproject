package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.OrderLineItems;
import com.nmk.ecomm.web.vo.OrderLineItemsVO;

/**
 * @author NMK OPT 1
 *
 */
public class OrderlineitemsUtil {
	public static OrderLineItems convertOrderLineItemVOObjectToOrderLineItem(final OrderLineItemsVO orderLineItemsVO) {
		final OrderLineItems orderLineItems = new OrderLineItems();
		try {
			BeanUtils.copyProperties(orderLineItems, orderLineItemsVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderLineItems;
	}

	public static OrderLineItemsVO convertOrderLineItemObjectToOrderLineItemVO(final OrderLineItems orderLineItems) {
		final OrderLineItemsVO orderLineItemsVO = new OrderLineItemsVO();
		try {
			BeanUtils.copyProperties(orderLineItemsVO, orderLineItems);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderLineItemsVO;
	}

	public static List<OrderLineItemsVO> convertOrderLineItemVOListToOrderLineItems(
			final List<OrderLineItems> orderLineItemses) {
		final List<OrderLineItemsVO> orderLineItemsList = new ArrayList<OrderLineItemsVO>();
		try {
			for (final OrderLineItems orderLineItems : orderLineItemses) {
				final OrderLineItemsVO orderLineItemsVO = new OrderLineItemsVO();
				BeanUtils.copyProperties(orderLineItemsVO, orderLineItems);
				orderLineItemsList.add(orderLineItemsVO);
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
		return orderLineItemsList;
	}
}
