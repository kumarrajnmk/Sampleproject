package com.nmk.ecomm.web.vo;

import java.util.Date;

public class CreditCardVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;
	/**
	*/
	private String name;
	/**
	*/
	private String description;
	/**
	*/
	private String card;
	/**
	*/
	private String expDate;
	/**
	*/
	private String cvv;
	/**
	*/
	private String zipCode;
	/**
	*/
	/**
	*/
	private String firstName;
	/**
	*/
	private String lastName;
	/**
	*/
	private String address;
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
	private int userUid;
	/**
	*/
	private int cardTypeIdx;

	public CreditCardVO() {
	}

	public CreditCardVO(final String name, final String card, final String expDate, final String cvv,
			final String zipCode, final String firstName, final String lastName, final String address,
			final String createdBy, final Date createDate, final int userUid, final int cardTypeIdx) {
		this.name = name;
		this.card = card;
		this.expDate = expDate;
		this.cvv = cvv;
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.userUid = userUid;
		this.cardTypeIdx = cardTypeIdx;
	}

	public CreditCardVO(final String name, final String description, final String card, final String expDate,
			final String cvv, final String zipCode, final String firstName, final String lastName, final String address,
			final String createdBy, final Date createDate, final String modifiedBy, final Date modifiedDate,
			final int userUid, final int cardTypeIdx) {
		this.name = name;
		this.description = description;
		this.card = card;
		this.expDate = expDate;
		this.cvv = cvv;
		this.zipCode = zipCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.userUid = userUid;
		this.cardTypeIdx = cardTypeIdx;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getCard() {
		return this.card;
	}

	public void setCard(final String card) {
		this.card = card;
	}

	public String getExpDate() {
		return this.expDate;
	}

	public void setExpDate(final String expDate) {
		this.expDate = expDate;
	}

	public String getCvv() {
		return this.cvv;
	}

	public void setCvv(final String cvv) {
		this.cvv = cvv;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
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

	public int getUserUid() {
		return this.userUid;
	}

	public void setUserUid(final int userUid) {
		this.userUid = userUid;
	}

	public int getCardTypeIdx() {
		return this.cardTypeIdx;
	}

	public void setCardTypeIdx(final int cardTypeIdx) {
		this.cardTypeIdx = cardTypeIdx;
	}

}
