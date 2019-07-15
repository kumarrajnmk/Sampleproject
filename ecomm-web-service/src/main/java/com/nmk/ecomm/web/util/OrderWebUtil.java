package com.nmk.ecomm.web.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;

import com.nmk.ecomm.model.Order;
import com.nmk.ecomm.web.vo.OrderVO;

/**
 * @author NMK OPT 1
 *
 */
public class OrderWebUtil {
	public static Order convertOrderVOObjectToOrder(final OrderVO orderVO) {
		final Order order = new Order();
		try {
			BeanUtils.copyProperties(order, orderVO);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return order;
	}

	public static OrderVO convertOrderToOrderVO(final Order order) {
		final OrderVO orderVO = new OrderVO();
		try {
			BeanUtils.copyProperties(orderVO, order);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			new RuntimeException(e);
		}
		return orderVO;
	}

	public static List<OrderVO> convertOrderListToOrderVOList(final List<Order> orders) {
		final List<OrderVO> orderVOList = new ArrayList<OrderVO>();
		try {
			for (final Order order : orders) {
				final OrderVO orderVO = new OrderVO();
				BeanUtils.copyProperties(order, orderVO);
				orderVOList.add(orderVO);
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
		return orderVOList;
	}
}
