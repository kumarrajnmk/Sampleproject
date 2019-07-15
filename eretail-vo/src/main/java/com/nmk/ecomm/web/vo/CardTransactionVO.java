package com.nmk.ecomm.web.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class CardTransactionVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
	*/
	private Integer idx;
	/**
	*/
	private String transactionid;
	/**
	*/
	private String transactiontype;
	/**
	*/
	private Date transactiondate;
	/**
	*/
	private BigDecimal chargeamount;
	/**
	*/
	private String description;
	/**
	*/
	private Integer ecommusercardidx;
	/**
	*/
	private Integer parentidx;
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
	 * @param name
	 * @param descr
	 * @param createdBy
	 * @param createDate
	 */
	public CardTransactionVO(final String transactionid, final String transactiontype, final Date transactiondate,
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

	/**
	 * @param name
	 * 
	 */
	public CardTransactionVO() {
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

	/**
	 * @return
	 */
	public String getTransactiontype() {
		return transactiontype;
	}

	/**
	 * @param transactiontype
	 */
	public void setTransactiontype(final String transactiontype) {
		this.transactiontype = transactiontype;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	/**
	 * @param transactiondate
	 */
	public void setTransactiondate(final Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public BigDecimal getChargeamount() {
		return chargeamount;
	}

	/**
	 * @param chargeamount
	 */
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
