package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class CategoryVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
	*/
	private Integer idx;
	/**
	*/
	private String name;

	/**
	*/
	private String descr;
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

	public CategoryVO() {
	}

	public CategoryVO(final String name, final String createdBy, final Date createDate) {
		this.name = name;
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	public CategoryVO(final String name, final String descr, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate) {
		this.name = name;
		this.descr = descr;
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

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("categoryVO Details/n").append("\tid:" + this.idx).append("\tname:" + this.name)
				.append("\tdescr:" + this.descr).append("\tcreatedBy:" + this.createdBy)
				.append("\tcreateDate:" + this.createDate).append("\tmodifiedDate:" + this.modifiedDate)
				.append("\tmodifiedBy:" + this.modifiedBy).append("\tid:" + this.idx).append("\tid:" + this.idx);
		return builder.toString();

	}

}
