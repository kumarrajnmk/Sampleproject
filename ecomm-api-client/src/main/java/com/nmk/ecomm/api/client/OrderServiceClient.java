package com.nmk.ecomm.api.client;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nmk.ecomm.model.Order;

@RestController
public class OrderServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String orderSeriviceURL = "http://localhost:8088/api/v1/order";
	private static final Logger logger = LoggerFactory.getLogger(OrderServiceClient.class);

	public static Order getOrderByIdx(int id) {
		logger.debug("Start  :OrderServiceClient .getOrderByIdx() ");

		Order order = restTemplate.getForObject(orderSeriviceURL + "/" + id, Order.class);
		System.out.println(order.getIdx() + " " + order.getDeliveryMethod() + " " + order.getBaseGrandTotal() + " "
				+ order.getCheckoutComment() + " " + order.getStatus() + " " + order.getUserUid() + " "
				+ order.getUserAddressIdx() + " " + order.getUserCardIdx() + " " + order.getLocationIdx() + " "
				+ order.getTransactionid() + " " + order.getCreatedBy() + " " + order.getCreateDate() + " "
				+ order.getModifiedBy() + " " + order.getModifiedDate());
		logger.debug("Start  :OrderServiceClient .getOrderByIdx() ");

		return order;
	}

	public static Order getAllOrder() {
		logger.debug("Start  :OrderServiceClient .getAllOrder() ");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<String> result = restTemplate.exchange(orderSeriviceURL, HttpMethod.GET, entity, String.class);

		System.out.println(result);
		logger.debug("Start  :OrderServiceClient .getAllOrder() ");

		return null;
	}

	public static void deleteOrder(int id) {

		logger.debug("Start  :OrderServiceClient .deleteOrder() ");

		restTemplate.delete(orderSeriviceURL + "/" + id);
		logger.debug("Start  :OrderServiceClient .deleteOrder() ");

	}

	public static void createOrder(Order order) {
		logger.debug("Start  :OrderServiceClient .createOrder() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Order> request = new HttpEntity<Order>(order);
		ResponseEntity<Order> response = restTemplate.exchange(orderSeriviceURL, HttpMethod.POST, request, Order.class);
		logger.debug("Start  :OrderServiceClient .createOrder() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("order Data Inserted Successfully");
	}

	public static void updateOrder(Order order) {

		orderSeriviceURL = "http://localhost:8088/api/v1/order/2";
		logger.debug("Start  :OrderServiceClient .updateOrder() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Order> request = new HttpEntity<Order>(order);
		ResponseEntity<Order> response = restTemplate.exchange(orderSeriviceURL, HttpMethod.PUT, request, Order.class);
		logger.debug("Start  :OrderServiceClient .updateOrder() ");

		if (200 == response.getStatusCodeValue())
			System.out.println("order Data Updated Successfully");
	}

	public static void main(String[] args) {
		// We should use these for above methods
		// Order order = new Order("Credit Card24",new BigDecimal("12381263.87123"),
		// "Description11",2,99,5,44,66,"9999","vijay", new java.util.Date(),"siva",new
		// java.util.Date());
		// updateOrder(order);
		// createOrder(order);
		// Order order = getOrderByIdx(2);
		// Order order =getAllOrder();
		// Order order = new Order();
		// Order brand = getAllBrand();

		// deleteOrder(11);
	}

	public static List<Order> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
}
