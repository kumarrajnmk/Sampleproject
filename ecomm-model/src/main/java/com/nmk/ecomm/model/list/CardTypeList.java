package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.CardType;

@XmlRootElement(name = "cardtypes")
public class CardTypeList  extends DataList<CardType> {
	@XmlElement(name = "cardtype")
	@JsonProperty(value="cardtype")
	public List<CardType> getData() {
		return data;	
	}
}
