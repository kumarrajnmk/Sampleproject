package com.nmk.ecomm.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

public class DataList<T> {

	@XmlTransient
	public List<T> data = new ArrayList<T>();;

	@XmlTransient
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
