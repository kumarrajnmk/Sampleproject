package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.Location;
@XmlRootElement(name = "locations")
public class LocationList extends DataList<Location>{
	@XmlElement(name = "location")
	@JsonProperty(value="location")
	public List<Location> getData() {
		return data;	
	}
}
