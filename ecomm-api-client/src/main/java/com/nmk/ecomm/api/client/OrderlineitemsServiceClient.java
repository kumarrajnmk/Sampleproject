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

import com.nmk.ecomm.model.OrderLineItems;
@RestController
public class OrderlineitemsServiceClient {
	@Autowired
	static RestTemplate restTemplate = new RestTemplate();
	static String orderlineitemsSeriviceURL = "http://localhost:8087/api/v1/orderlineitems";
	private static final Logger logger = LoggerFactory.getLogger(OrderlineitemsServiceClient.class);

	
	public static OrderLineItems getOrderlineitemsByIdx(int id){
		logger.debug("Start  :OrderlineitemsServiceClient .getOrderlineitemsByIdx() ");

		OrderLineItems orderLineItems = restTemplate.getForObject(orderlineitemsSeriviceURL + "/" + id, OrderLineItems.class);
		 System.out.println(orderLineItems.getIdx() + "   " + orderLineItems.getPrice() + "   " + orderLineItems.getQuantity()+ "   " + orderLineItems.getProductIdx()+ "   " + orderLineItems.getEcommOrderIdx() + "   " + orderLineItems.getCreatedBy() + "   " + orderLineItems.getCreateDate() + "   " + orderLineItems.getModifiedBy() + "   " + orderLineItems.getModifiedDate());
			logger.debug("Start  :OrderlineitemsServiceClient .getOrderlineitemsByIdx() ");

		 return orderLineItems;
	} 
	public static OrderLineItems getAllOrderLineItems()
	{	 	     
		logger.debug("Start  :OrderlineitemsServiceClient .getAllOrderLineItems() ");

		RestTemplate restTemplate = new RestTemplate();
	     
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	     
	    ResponseEntity<String> result = restTemplate.exchange(orderlineitemsSeriviceURL, HttpMethod.GET, entity, String.class);
		logger.debug("Start  :OrderlineitemsServiceClient .getAllOrderLineItems() ");
	     
	    System.out.println(result);
		return null;
	}
	public static void deleteOrderlineitems(int id){
		logger.debug("Start  :OrderlineitemsServiceClient .deleteOrderlineitems() ");

		restTemplate.delete(orderlineitemsSeriviceURL+ "/" + id);
		logger.debug("Start  :OrderlineitemsServiceClient .deleteOrderlineitems() ");

	} 
	public static void createOrderlineitems(OrderLineItems orderLineItems){
		logger.debug("Start  :OrderlineitemsServiceClient .createOrderlineitems() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<OrderLineItems> request = new HttpEntity<OrderLineItems>(orderLineItems);
		ResponseEntity<OrderLineItems> response = restTemplate.exchange(orderlineitemsSeriviceURL, HttpMethod.POST, request, OrderLineItems.class);
		logger.debug("Start  :OrderlineitemsServiceClient .createOrderlineitems() ");

		if(200==response.getStatusCodeValue())
			System.out.println("Orderlineitems Data Inserted Successfully");
	}
	public static void updateOrderlineitems(OrderLineItems orderLineItems){
		orderlineitemsSeriviceURL = "http://localhost:8087/api/v1/orderlineitems/10";
		logger.debug("Start  :OrderlineitemsServiceClient .updateOrderlineitems() ");

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<OrderLineItems> request = new HttpEntity<OrderLineItems>(orderLineItems);
		ResponseEntity<OrderLineItems> response = restTemplate.exchange(orderlineitemsSeriviceURL, HttpMethod.PUT, request, OrderLineItems.class);
		logger.debug("Start  :OrderlineitemsServiceClient .updateOrderlineitems() ");

		if(200==response.getStatusCodeValue())
		System.out.println("Orderlineitems Data Updated Successfully");
	}
	public static void main(String[] args) {
		//OrderLineItems orderLineItems = new OrderLineItems(new BigDecimal("12.00"), new BigDecimal("12.00"), 1, 2,"Satish", new java.util.Date(), "asdsaddgs", new java.util.Date());
		//createOrderlineitems(orderLineItems);
		//OrderLineItems  orderLineItems=new OrderLineItems();
		//updateOrderlineitems(orderLineItems);
		//OrderLineItems orderLineItems =getOrderlineitemsByIdx(1);
		//OrderLineItems  orderLineItems= getAllOrderLineItems();
		deleteOrderlineitems(10);
	}
	public static List<OrderLineItems> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
