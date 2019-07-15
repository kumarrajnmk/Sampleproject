package com.nmk.ecomm.web.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class OrderLineItemsVO implements java.io.Serializable {

	/**
	*/
	private static final long serialVersionUID = 1L;
	/**
	*/
	private Integer idx;
	/**
	*/
	private BigDecimal price;
	/**
	*/
	private BigDecimal quantity;
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
	/**
	*/
	private int productIdx;
	/**
	*/
	private int ecommOrderIdx;

	public OrderLineItemsVO() {
	}

	public OrderLineItemsVO(final BigDecimal price, final BigDecimal quantity, final String createdBy,
			final Date createDate, final int productIdx, final int ecommOrderIdx) {
		this.price = price;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.productIdx = productIdx;
		this.ecommOrderIdx = ecommOrderIdx;
	}

	public OrderLineItemsVO(final BigDecimal price, final BigDecimal quantity, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate, final int productIdx,
			final int ecommOrderIdx) {
		this.price = price;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.productIdx = productIdx;
		this.ecommOrderIdx = ecommOrderIdx;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(final BigDecimal quantity) {
		this.quantity = quantity;
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

	public int getProductIdx() {
		return this.productIdx;
	}

	public void setProductIdx(final int productIdx) {
		this.productIdx = productIdx;
	}

	public int getEcommOrderIdx() {
		return this.ecommOrderIdx;
	}

	public void setEcommOrderIdx(final int ecommOrderIdx) {
		this.ecommOrderIdx = ecommOrderIdx;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("OrderLineItemsVO Details/n").append("\tid:" + this.idx).append("\tname:" + this.price)
				.append("\tdescr:" + this.quantity).append("\tcreatedBy:" + this.createdBy)
				.append("\tcreateDate:" + this.createDate).append("\tmodifiedBy" + this.modifiedBy)
				.append("\tmodifiedDate" + this.modifiedDate).append("\tproductIdx" + this.productIdx)
				.append("\tecommOrderIdx" + this.ecommOrderIdx);

		return builder.toString();
	}
}
