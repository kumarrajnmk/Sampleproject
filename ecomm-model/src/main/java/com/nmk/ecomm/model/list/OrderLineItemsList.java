package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.OrderLineItems;

@XmlRootElement(name = "orderlineitems")
public class OrderLineItemsList extends DataList<OrderLineItems> {
	@XmlElement(name = "orderlineitem")
	@JsonProperty(value="orderlineitem")
	public List<OrderLineItems> getData() {
		return data;	
	}
}
