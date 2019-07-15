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
@Table(name = "ecomm_card_transaction")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)

public class EcommCardTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;
	@Column(unique = true, name = "transaction_id")
	private String transactionid;
	@Column(unique = true, name = "transaction_type")
	@NotBlank(message = "transactiontype can't empty!")
	private String transactiontype;

	@Column(name = "transaction_date")
	@CreatedDate
	private Date transactiondate;
	@Column(name = "charge_amount")
	private BigDecimal chargeamount;
	@NotBlank(message = "description can't empty!")
	private String description;
	@Column(name = "ecomm_user_card_idx")
	private Integer ecommusercardidx;
	@Column(name = "parent_idx")
	private Integer parentidx;
	@Column
	@Size(min = 2, message = "createdBy can't empty! should have atleast 2 characters")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

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

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(final String transactionid) {
		this.transactionid = transactionid;
	}

	public String getTransactiontype() {
		return transactiontype;
	}

	public void setTransactiontype(final String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(final Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public BigDecimal getChargeamount() {
		return chargeamount;
	}

	public void setChargeamount(final BigDecimal chargeamount) {
		this.chargeamount = chargeamount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Integer getEcommusercardidx() {
		return ecommusercardidx;
	}

	public void setEcommusercardidx(final Integer ecommusercardidx) {
		this.ecommusercardidx = ecommusercardidx;
	}

	public Integer getParentidx() {
		return parentidx;
	}

	public void setParentidx(final Integer parentidx) {
		this.parentidx = parentidx;
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
