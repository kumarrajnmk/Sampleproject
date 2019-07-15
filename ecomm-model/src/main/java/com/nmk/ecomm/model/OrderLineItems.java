package com.nmk.ecomm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "orderlineitem")
@XmlAccessorOrder
public class OrderLineItems implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private BigDecimal price;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private BigDecimal quantity;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int productIdx;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int ecommOrderIdx;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public OrderLineItems(BigDecimal price, BigDecimal quantity, String createdBy, Date createDate, int productIdx,
			int ecommOrderIdx) {
		this.price = price;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.productIdx = productIdx;
		this.ecommOrderIdx = ecommOrderIdx;
	}

	public OrderLineItems(BigDecimal price, BigDecimal quantity, String createdBy, Date createDate, String modifiedBy,
			Date modifiedDate, int productIdx, int ecommOrderIdx) {
		this.price = price;
		this.quantity = quantity;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.productIdx = productIdx;
		this.ecommOrderIdx = ecommOrderIdx;
	}

	public OrderLineItems() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getProductIdx() {
		return this.productIdx;
	}

	public void setProductIdx(int productIdx) {
		this.productIdx = productIdx;
	}

	public int getEcommOrderIdx() {
		return this.ecommOrderIdx;
	}

	public void setEcommOrderIdx(int ecommOrderIdx) {
		this.ecommOrderIdx = ecommOrderIdx;
	}

}
