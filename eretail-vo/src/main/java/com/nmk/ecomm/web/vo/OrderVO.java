package com.nmk.ecomm.web.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class OrderVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;
	/**
	*/
	private String deliveryMethod;
	/**
	*/
	private BigDecimal baseGrandTotal;
	/**
	*/
	private String checkoutComment;
	/**
	*/
	private int status;
	/**
	*/
	private int userUid;
	/**
	*/
	private int userAddressIdx;
	/**
	*/
	private int userCardIdx;
	/**
	*/
	private int locationIdx;
	/**
	*/
	private String transactionid;
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

	public OrderVO() {

	}

	public OrderVO(final Integer idx, final String deliveryMethod, final BigDecimal baseGrandTotal,
			final String checkoutComment, final int status, final int userUid, final int userAddressIdx,
			final int userCardIdx, final int locationIdx, final String transactionid, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate) {

		this.idx = idx;
		this.deliveryMethod = deliveryMethod;
		this.baseGrandTotal = baseGrandTotal;
		this.checkoutComment = checkoutComment;
		this.status = status;
		this.userUid = userUid;
		this.userAddressIdx = userAddressIdx;
		this.userCardIdx = userCardIdx;
		this.locationIdx = locationIdx;
		this.transactionid = transactionid;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getdeliveryMethod() {
		return deliveryMethod;
	}

	public void setdeliveryMethod(final String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public BigDecimal getBaseGrandTotal() {
		return baseGrandTotal;
	}

	public void setBaseGrandTotal(final BigDecimal baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public String getCheckoutComment() {
		return checkoutComment;
	}

	public void setCheckoutComment(final String checkoutComment) {
		this.checkoutComment = checkoutComment;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(final int status) {
		this.status = status;
	}

	public int getUserUid() {
		return userUid;
	}

	public void setUserUid(final int userUid) {
		this.userUid = userUid;
	}

	public int getUserAddressIdx() {
		return userAddressIdx;
	}

	public void setUserAddressIdx(final int userAddressIdx) {
		this.userAddressIdx = userAddressIdx;
	}

	public int getUserCardIdx() {
		return userCardIdx;
	}

	public void setUserCardIdx(final int userCardIdx) {
		this.userCardIdx = userCardIdx;
	}

	public int getLocationIdx() {
		return locationIdx;
	}

	public void setLocationIdx(final int locationIdx) {
		this.locationIdx = locationIdx;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(final String transactionid) {
		this.transactionid = transactionid;
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

	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("OrderVO Details/n").append("\tidx: " + this.idx)
				.append("\tdeliverymethod: " + this.deliveryMethod).append("\tbaseGrandTotal: " + this.baseGrandTotal)
				.append("\tcheckoutComment: " + this.checkoutComment).append("\tstatus: " + this.status)
				.append("\tcreatedBy: " + this.createdBy).append("\tuserUid: " + this.userUid)
				.append("\tuserAddressIdx: " + this.userAddressIdx).append("\tuserCardIdx: " + this.userCardIdx)
				.append("\tlocationIdx: " + this.locationIdx).append("\ttransactionId: " + this.transactionid)
				.append("\tcreateDate: " + this.createDate).append("\tmodifiedBy: " + this.modifiedBy)
				.append("\tmodifiedDate: " + this.modifiedDate);

		return builder.toString();
	}

}
