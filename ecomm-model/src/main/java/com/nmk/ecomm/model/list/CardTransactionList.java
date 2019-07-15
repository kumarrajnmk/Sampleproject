package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.CardTransaction;

@XmlRootElement(name = "cardtransactions")
public class CardTransactionList extends DataList<CardTransaction> {
	@XmlElement(name = "cardtransaction")
	@JsonProperty(value="cardtransaction")
	public List<CardTransaction> getData() {
		return data;	
	}
}
