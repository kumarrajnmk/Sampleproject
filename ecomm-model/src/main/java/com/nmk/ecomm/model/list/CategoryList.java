package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.Category;
@XmlRootElement(name = "categories")
public class CategoryList extends DataList<Category>{
	@XmlElement(name = "category")
	@JsonProperty(value="category")
	public List<Category> getData() {
		return data;	
	}
}
