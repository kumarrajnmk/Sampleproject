package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class UserCardVO implements java.io.Serializable {

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
	private String expdate;

	/**
	*/
	private String cvv;

	/**
	*/
	private String firstname;

	/**
	*/
	private String lastname;

	/**
	*/
	private String address1;

	/**
	*/
	private String address2;

	/**
	*/
	private String city;

	/**
	*/
	private String state;

	/**
	*/
	private String zipcode;

	/**
	*/
	private Integer useruid;

	/**
	*/
	private Integer cardtypeidx;

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
	public UserCardVO() {

	}

	public UserCardVO(final String name, final String description, final String card, final String expdate,
			final String cvv, final String firstname, final String lastname, final String address1,
			final String address2, final String city, final String state, final String zipcode, final Integer useruid,
			final Integer cardtypeidx, final String createdBy, final Date createDate, final String modifiedBy,
			final Date modifiedDate) {
		super();
		this.name = name;
		this.description = description;
		this.card = card;
		this.expdate = expdate;
		this.cvv = cvv;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.useruid = useruid;
		this.cardtypeidx = cardtypeidx;
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

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getCard() {
		return card;
	}

	public void setCard(final String card) {
		this.card = card;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(final String expdate) {
		this.expdate = expdate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(final String cvv) {
		this.cvv = cvv;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(final String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(final String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(final String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getUseruid() {
		return useruid;
	}

	public void setUseruid(final Integer useruid) {
		this.useruid = useruid;
	}

	public Integer getCardtypeidx() {
		return cardtypeidx;
	}

	public void setCardtypeidx(final Integer cardtypeidx) {
		this.cardtypeidx = cardtypeidx;
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
