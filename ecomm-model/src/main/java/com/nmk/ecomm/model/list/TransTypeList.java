package com.nmk.ecomm.model.list;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.TransType;

@XmlRootElement(name = "transtypes")
public class TransTypeList extends DataList<TransType> {
	@XmlElement(name = "transtype")
	@JsonProperty(value="transtype")
	public List<TransType> getData() {
		return data;	
	}
}
