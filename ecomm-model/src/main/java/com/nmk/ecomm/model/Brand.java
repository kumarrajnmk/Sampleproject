package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class Brand implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Size(min = 5, max = 10)
	 * 
	 * @NotEmpty
	 */
	/*
	 * @Pattern(regexp = "[a-zA-Z]+")
	 */ private String name;
	/*
	 * @NotEmpty
	 * 
	 * @Size(min = 5, max = 20)
	 */
	private String descr;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public Brand() {
	}

	/*
	 * public Brand(String name, String descr, String createdBy, Date createDate) {
	 * this.name = name; this.descr = descr; this.createdBy = createdBy;
	 * this.createDate = createDate; }
	 */

	public Brand(final String name, final String descr, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate) {
		this.name = name;
		this.descr = descr;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public Brand(final int i, final String string, final String string2) {
		// TODO Auto-generated constructor stub
	}

	public Brand(final int i, final String string, final String string2, final String string3) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(final String descr) {
		this.descr = descr;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(final String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(final Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
