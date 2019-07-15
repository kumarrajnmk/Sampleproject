package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.OrderServiceClient;
import com.nmk.ecomm.model.Order;
import com.nmk.ecomm.web.service.intf.ERetailOrderService;
import com.nmk.ecomm.web.util.OrderWebUtil;
import com.nmk.ecomm.web.vo.OrderVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class ERetailOrderServiceImpl implements ERetailOrderService {

	private static final Logger LOGGER = Logger.getLogger(ERetailOrderServiceImpl.class);

	public void createOrder(final OrderVO orderVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailOrderServiceImpl.createOrder()");
		}
		final Order order = OrderWebUtil.convertOrderVOObjectToOrder(orderVO);
		OrderServiceClient.createOrder(order);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailOrderServiceImpl.createOrder()");
		}
	}

	public void updateOrder(final OrderVO orderVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailOrderServiceImpl.updateOrder()");
		}
		final Order order = OrderWebUtil.convertOrderVOObjectToOrder(orderVO);
		OrderServiceClient.updateOrder(order);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailOrderServiceImpl.updateOrder()");
		}
	}

	public void deleteOrder(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailOrderServiceImpl.deleteOrder()");
		}
		OrderServiceClient.deleteOrder(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailOrderServiceImpl.deleteOrder()");
		}

	}

	public OrderVO getOrderByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailOrderServiceImpl.getOrderByIdx()");
		}

		final Order order = OrderServiceClient.getOrderByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailOrderServiceImpl.getOrderByIdx()");
		}
		return OrderWebUtil.convertOrderToOrderVO(order);

	}

	public List<OrderVO> getAllOrder() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.getAllProduct()");
		}
		List<Order> orders = (List<Order>) OrderServiceClient.getAllOrder();
		final List<OrderVO> orderVOList = OrderWebUtil.convertOrderListToOrderVOList(orders);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.getAllProduct()");
		}
		return orderVOList;
	}

	public void placeorderedItems(OrderVO orderVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.getOrderByIdx()");
		}
		// Order order = OrderServiceClient.getOrderByIdx(orderVO);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.getOrderByIdx()");
		}

	}

	public List<Order> getAllOrders() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: ERetailProductServiceImpl.getAllOrder()");
		}
		// List<Order> o rders = (List<Order>) OrderServiceClient.getAllOrders();
		// List<OrderVO> orderVOList =
		// OrderWebUtil.convertOrderListToOrderVOList(orders);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: ERetailProductServiceImpl.getAllOrder()");
		}
		// return orders;
		return null;

	}

	public List<Order> test() {
		// TODO Auto-generated method stub
		return null;
	}
}
