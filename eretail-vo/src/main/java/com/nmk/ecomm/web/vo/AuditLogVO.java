package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */

public class AuditLogVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;

	private String description;

	private String xmlMsg;

	private String createdBy;

	private Date createDate;

	private String modifiedBy;

	private Date modifiedDate;

	private String transTypeIdx;

	// public AuditLogVO() {
	// }

	/**
	 * @param createdBy
	 * @param createDate
	 * @param transTypeIdx
	 */
	public AuditLogVO(final String createdBy, final Date createDate, final String transTypeIdx) {
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.transTypeIdx = transTypeIdx;
	}

	/**
	 * @param
	 * @param
	 * @param
	 */
	public AuditLogVO(final Integer idx, final String description, final String xmlMsg, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate, final String transTypeIdx) {
		super();
		this.idx = idx;
		this.description = description;
		this.xmlMsg = xmlMsg;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.transTypeIdx = transTypeIdx;
	}

	/**
	 * @param
	 * @param
	 * @param
	 */
	public AuditLogVO(final String description, final String xmlMsg, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate, final String transTypeIdx) {
		this.description = description;
		this.xmlMsg = xmlMsg;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.transTypeIdx = transTypeIdx;
	}

	/**
	 * @param
	 * 
	 */
	public AuditLogVO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getXmlMsg() {
		return this.xmlMsg;
	}

	public void setXmlMsg(final String xmlMsg) {
		this.xmlMsg = xmlMsg;
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

	public String getTransTypeIdx() {
		return transTypeIdx;
	}

	public void setTransTypeIdx(final String transTypeIdx) {
		this.transTypeIdx = transTypeIdx;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("AuditLogVO Details/n").append("\tid:" + this.idx).append("\tmodifiedby:" + this.modifiedBy)
				.append("\tdescription:" + this.description).append("\tcreatedBy:" + this.createdBy)
				.append("\tcreateDate:" + this.createDate).append("\ttransTypeIdx:" + this.transTypeIdx)
				.append("\tmodifiedDate" + this.modifiedDate);
		return builder.toString();
	}
}
