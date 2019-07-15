package com.nmk.ecomm.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author NMK OPT 1
 *
 * @param <T>
 */
public class DataList<T> {

	@XmlTransient
	public List<T> data = new ArrayList<T>();

	@XmlTransient
	public List<T> getData() {
		return data;
	}

	public void setData(final List<T> data) {
		this.data = data;
	}
}
