package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.UserAddress;

@XmlRootElement(name = "userAddresses")
public class UserAddressList extends DataList<UserAddress> {
	@XmlElement(name = "useraddress")
	@JsonProperty(value="useraddress")
	public List<UserAddress> getData() {
		return data;	
	}
}
