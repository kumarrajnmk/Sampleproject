package com.nmk.ecomm.model.list;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.UserCard;
@XmlRootElement(name = "ecommUsercards")
public class UserCardList extends DataList<UserCard> {
	@XmlElement(name = "Usercard")
	@JsonProperty(value="Usercard")
	public List<UserCard> getData() {
		return data;	
	}
}

