package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement
@XmlAccessorOrder
@JsonDeserialize
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class AuditLog implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	private String description;
	private String xmlMsg;
	/*
	 * @Pattern(regexp = "(^$|[0-9]+)")
	 */ private String transTypeIdx;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getXmlMsg() {
		return xmlMsg;
	}

	public void setXmlMsg(final String xmlMsg) {
		this.xmlMsg = xmlMsg;
	}

	public String getTransTypeIdx() {
		return transTypeIdx;
	}

	public void setTransTypeIdx(final String transTypeIdx) {
		this.transTypeIdx = transTypeIdx;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(final String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public AuditLog(final String description) {
		super();
		this.description = description;
	}

	public AuditLog(final Integer idx, final String description, final String xmlMsg) {
		super();
		this.idx = idx;
		this.description = description;
		this.xmlMsg = xmlMsg;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(final Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AuditLog(final Integer idx, final String description, final String xmlMsg, final String transTypeIdx,
			final String createdBy, final Date createDate, final String modifiedBy, final Date modifiedDate) {
		super();
		this.idx = idx;
		this.description = description;
		this.xmlMsg = xmlMsg;
		this.transTypeIdx = transTypeIdx;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public AuditLog() {
		super();
	}

	public AuditLog(final long l, final String string, final String string2, final String string3, final int i) {
		// TODO Auto-generated constructor stub
	}

}
