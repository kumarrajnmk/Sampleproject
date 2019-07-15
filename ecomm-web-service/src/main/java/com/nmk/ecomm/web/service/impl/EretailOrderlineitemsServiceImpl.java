package com.nmk.ecomm.web.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.nmk.ecomm.api.client.OrderlineitemsServiceClient;
import com.nmk.ecomm.model.OrderLineItems;
import com.nmk.ecomm.web.service.intf.EretailOrderlineitemsService;
import com.nmk.ecomm.web.util.OrderlineitemsUtil;
import com.nmk.ecomm.web.vo.OrderLineItemsVO;

/**
 * @author NMK OPT 1
 *
 */
@Service
public class EretailOrderlineitemsServiceImpl implements EretailOrderlineitemsService {
	private static final Logger LOGGER = Logger.getLogger(EretailOrderlineitemsServiceImpl.class);

	public OrderLineItemsVO getOrderlineitemsByIdx(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailOrderlineitemsServiceImpl.getOrderlineitemsByIdx()");
		}
		final OrderLineItems orderLineItems = OrderlineitemsServiceClient.getOrderlineitemsByIdx(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: EretailOrderlineitemsServiceImpl.getOrderlineitemsByIdx()");
		}
		return OrderlineitemsUtil.convertOrderLineItemObjectToOrderLineItemVO(orderLineItems);
	}

	public void createOrderlineitems(final OrderLineItemsVO orderLineItemsVO) {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailOrderlineitemsServiceImpl.createOrderlineitems()");
		}
		final OrderLineItems orderLineItems = OrderlineitemsUtil
				.convertOrderLineItemVOObjectToOrderLineItem(orderLineItemsVO);
		OrderlineitemsServiceClient.createOrderlineitems(orderLineItems);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: EretailOrderlineitemsServiceImpl.createOrderlineitems()");
		}

	}

	public void updateOrderlineitems(final OrderLineItemsVO orderLineItemsVO) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailOrderlineitemsServiceImpl.updateOrderlineitems()");
		}
		final OrderLineItems orderLineItems = OrderlineitemsUtil
				.convertOrderLineItemVOObjectToOrderLineItem(orderLineItemsVO);
		OrderlineitemsServiceClient.updateOrderlineitems(orderLineItems);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: EretailOrderlineitemsServiceImpl.updateOrderlineitems()");
		}
	}

	public void deleteOrderlineitems(final int id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailOrderlineitemsServiceImpl.deleteOrderlineitems()");
		}
		OrderlineitemsServiceClient.deleteOrderlineitems(id);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: EretailOrderlineitemsServiceImpl.deleteOrderlineitems()");
		}
	}

	public List<OrderLineItemsVO> getAllOrderLineItems() {
		// TODO Auto-generated method stub
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Start: EretailOrderlineitemsServiceImpl.getAllOrderLineItems()");
		}
		List<OrderLineItems> orderLineItemses = (List<OrderLineItems>) OrderlineitemsServiceClient
				.getAllOrderLineItems();
		final List<OrderLineItemsVO> orderLineItemsVOList = OrderlineitemsUtil
				.convertOrderLineItemVOListToOrderLineItems(orderLineItemses);
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("End: EretailOrderlineitemsServiceImpl.getAllOrderLineItems()");
		}
		return orderLineItemsVOList;

	}

	public List<OrderLineItems> test() {
		// TODO Auto-generated method stub
		return null;
	}

}
