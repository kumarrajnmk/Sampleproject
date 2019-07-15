package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.Product;

@XmlRootElement(name = "products")
public class ProductList extends DataList<Product> {
	@XmlElement(name = "product")
	@JsonProperty(value="product")
	public List<Product> getData() {
		return data;	
	}

}
