package com.nmk.ecomm.service.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@Entity
@Table(name = "ecomm_order")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;
	@NotBlank(message = "delivery_method can't empty!")
	private String deliveryMethod;
	private BigDecimal baseGrandTotal;

	private String checkoutComment;

	private Integer status;

	@Column(unique = true)
	private Integer userUid;

	private Integer userAddressIdx;

	private Integer userCardIdx;

	private Integer locationIdx;

	@Column(name = "transaction_id", unique = true)
	private String transactionid;

	@Size(min = 2, message = "created_by can't empty! should have atleast 2 characters")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

	@Size(min = 2, message = "modified_by can't empty! should have atleast 2 characters")
	private String modifiedBy;
	/*
	 * @Column(nullable = false)
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @LastModifiedDate
	 */
	private Date modifiedDate;

	@EnableTransactionManagement
	public class ConfigurationBean {
	}

	public Integer getIdx() {
		return idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(final Integer status) {
		this.status = status;
	}

	public Integer getUserUid() {
		return userUid;
	}

	public void setUserUid(final Integer userUid) {
		this.userUid = userUid;
	}

	public Integer getUserAddressIdx() {
		return userAddressIdx;
	}

	public void setUserAddressIdx(final Integer userAddressIdx) {
		this.userAddressIdx = userAddressIdx;
	}

	public Integer getUserCardIdx() {
		return userCardIdx;
	}

	public void setUserCardIdx(final Integer userCardIdx) {
		this.userCardIdx = userCardIdx;
	}

	public Integer getLocationIdx() {
		return locationIdx;
	}

	public void setLocationIdx(final Integer locationIdx) {
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

}
