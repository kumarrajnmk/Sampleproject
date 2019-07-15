package com.nmk.ecomm.web.service.intf;

import java.util.List;

import com.nmk.ecomm.model.Order;
import com.nmk.ecomm.web.vo.OrderVO;

/**
 * @author NMK OPT 1
 *
 */
public interface ERetailOrderService {

	void createOrder(OrderVO orderVO);

	void updateOrder(OrderVO orderVO);

	void deleteOrder(int id);

	OrderVO getOrderByIdx(int id);

	List<OrderVO> getAllOrder();

	List<Order> test();
}
