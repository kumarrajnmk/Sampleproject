package com.nmk.ecomm.model.list;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nmk.ecomm.model.AuditLog;

@XmlRootElement(name = "auditlogs")
public class AuditLogList extends DataList<AuditLog> {
	@XmlElement(name = "auditlog")
	@JsonProperty(value="auditlog")
	public List<AuditLog> getData() {
		return data;	
	}

}
