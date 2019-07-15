package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.OrderLineItems;
import com.nmk.ecomm.web.vo.OrderLineItemsVO;

/**
 * @author NMK OPT 1
 *
 */
public interface EretailOrderlineitemsService {

	OrderLineItemsVO getOrderlineitemsByIdx(int id);


	void createOrderlineitems(OrderLineItemsVO orderLineItemsVO);


	void updateOrderlineitems(OrderLineItemsVO orderLineItemsVO);


	void deleteOrderlineitems(int id);


	List<OrderLineItemsVO> getAllOrderLineItems();


	List<OrderLineItems> test();

}
