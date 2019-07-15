package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "cardType")
@XmlAccessorOrder
public class CardType implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @NotEmpty
	 * 
	 * @Size(min=5,max=10)
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 */
	private String name;
	/*
	 * @NotEmpty
	 * 
	 * @Size(min=5,max=20)
	 */
	private String description;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public CardType(final String name, final String description, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate) {
		this.idx = idx;
		this.name = name;
		this.description = description;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public CardType() {
	}

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(final Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
