package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class TransTypeVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;

	/**
	*/
	private String transType;

	/**
	*/
	private String description;

	/**
	*/
	private String createdBy;

	/**
	*/
	private Date createDate;

	/**
	*/
	private String modifiedBy;

	/**
	*/
	private Date modifiedDate;

	public TransTypeVO() {
	}

	public TransTypeVO(final String transType, final String createdBy, final Date createDate) {
		this.transType = transType;
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	public TransTypeVO(final String transType, final String description, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate) {
		this.transType = transType;
		this.description = description;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(final String transType) {
		this.transType = transType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
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
