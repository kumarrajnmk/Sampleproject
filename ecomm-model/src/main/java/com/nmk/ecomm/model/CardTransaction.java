package com.nmk.ecomm.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "cardtransaction")
@XmlAccessorOrder
public class CardTransaction implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Pattern(regexp="(^$|[0-9]+)")
	 * 
	 * @NotEmpty
	 */
	private String transactionid;
	/*
	 * @Size(min=5,max=10)
	 * 
	 * @NotEmpty
	 */
	private String transactiontype;
	private Date transactiondate;
	/*
	 * @NotNull(message="Must Not be Null")
	 */ private BigDecimal chargeamount;
	private String description;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private Integer ecommusercardidx;
	private Integer parentidx;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public CardTransaction(final String transactionid, final String transactiontype, final Date transactiondate,
			final BigDecimal chargeamount, final String description, final Integer ecommusercardidx,
			final Integer parentidx, final String createdBy, final Date createDate, final String modifiedBy,
			final Date modifiedDate) {
		super();
		this.transactionid = transactionid;
		this.transactiontype = transactiontype;
		this.transactiondate = transactiondate;
		this.chargeamount = chargeamount;
		this.description = description;
		this.ecommusercardidx = ecommusercardidx;
		this.parentidx = parentidx;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public CardTransaction() {
	}

	public CardTransaction(final int i, final String string, final String string2) {
		// TODO Auto-generated constructor stub
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

	public void setTransactiontype(final  String transactiontype) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
