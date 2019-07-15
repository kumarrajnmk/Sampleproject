package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "creditcard")
@XmlAccessorOrder
public class CreditCard implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	private String name;
	private String description;
	private String card;
	private String expDate;
	private String cvv;
	private String zipCode;
	private String firstName;
	private String lastName;
	private String address;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;
	private int userUid;
	private int cardTypeIdx;

	public CreditCard(String string, String string2, String string3, Date date, int i, int j, String string4,
			String string5, String string6, String string7, Date date2, String string8, Date date3, int k, int l) {
	}

	public CreditCard(final String name, final String description, final String card, final String expDate,
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

	public CreditCard() {
		// TODO Auto-generated constructor stub
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

	public int getUserUid() {
		return this.userUid;
	}

	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}

	public int getCardTypeIdx() {
		return this.cardTypeIdx;
	}

	public void setCardTypeIdx(int cardTypeIdx) {
		this.cardTypeIdx = cardTypeIdx;
	}

}
