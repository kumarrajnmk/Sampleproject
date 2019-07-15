package com.nmk.ecomm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement
@XmlAccessorOrder
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Size(min = 2, max = 10)
	 * 
	 * @NotEmpty
	 */
	private String deliveryMethod;
	private BigDecimal baseGrandTotal;
	private String checkoutComment;
	private int status;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int userUid;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int userAddressIdx;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int userCardIdx;
	// @Min(value=1, message="Must be equal or greater than 1")
	// @Max(value=500, message="Must be equal or less than 500")
	private int locationIdx;
	/*
	 * @Pattern(regexp = "(^$|[0-9]+)")
	 * 
	 * @NotEmpty
	 */
	private String transactionid;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public Order() {
	}

	/*
	 * public Order(String deliveryMethod, int status, String createdBy, Date
	 * createDate, int userUid, int userAddressIdx, int userCardIdx, int
	 * locationIdx) { this.delivery_method = deliveryMethod; this.status = status;
	 * this.createdBy = createdBy; this.createDate = createDate; this.userUid =
	 * userUid; this.userAddressIdx = userAddressIdx; this.userCardIdx =
	 * userCardIdx; this.locationIdx = locationIdx; }
	 */

	public Integer getIdx() {
		return idx;
	}

	public Order(final String deliveryMethod, final BigDecimal baseGrandTotal, final String checkoutComment,
			final int status, final int userUid, final int userAddressIdx, final int userCardIdx, final int locationIdx,
			final String transactionid, final String createdBy, final Date createDate, final String modifiedBy,
			final Date modifiedDate) {
		super();
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

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(final String deliveryMethod) {
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

	public void setModifiedBy(String modifiedBy) {
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

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

}
