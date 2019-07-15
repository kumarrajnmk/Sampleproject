package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.Order;

@XmlRootElement(name = "orders")
public class OrderList extends DataList<Order>{
	@XmlElement(name = "order")
	@JsonProperty(value="order")
	public List<Order> getData() {
		return data;	
	}
}
