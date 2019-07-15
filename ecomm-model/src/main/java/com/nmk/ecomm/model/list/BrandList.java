package com.nmk.ecomm.model.list;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.Brand;


@XmlRootElement(name = "brands")
public class BrandList extends DataList<Brand> {
	@XmlElement(name = "brand")
	@JsonProperty(value="brands")


	public List<Brand> getData() {
		return data;	
	}
}
