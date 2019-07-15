package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.User;

@XmlRootElement(name = "users")
public class UserList extends DataList<User> {
	@XmlElement(name = "user")
	@JsonProperty(value="user")
	public List<User> getData() {
		return data;	
	}
}
