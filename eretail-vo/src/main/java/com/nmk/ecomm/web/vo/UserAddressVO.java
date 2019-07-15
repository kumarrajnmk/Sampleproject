package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class UserAddressVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;

	/**
	*/
	private String name;

	/**
	*/
	private String streetAddress1;

	/**
	*/
	private String streetAddress2;

	/**
	*/
	private String city;

	/**
	*/
	private String state;

	/**
	*/
	private String zipCode;

	/**
	*/
	private String country;

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

	public UserAddressVO() {
	}

	public UserAddressVO(final Integer idx, final String name, final String streetAddress1, final String streetAddress2,
			final String city, final String state, final String zipCode, final String country, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate, final int userUid) {
		super();
		this.idx = idx;
		this.name = name;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.userUid = userUid;
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

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(final String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(final String streetAddress2) {
		this.streetAddress2 = streetAddress2;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
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

	public int getuserUid() {
		return userUid;
	}

	public void setuserUid(final int userUid) {
		this.userUid = userUid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	 * public UserAddressVO(String name, String streetAddress1, String city, String
	 * state, String zipCode, String country, String createdBy, Date createDate, int
	 * userUid) { this.name = name; this.streetAddress1 = streetAddress1; this.city
	 * = city; this.state = state; this.zipCode = zipCode; this.country = country;
	 * this.createdBy = createdBy; this.createDate = createDate; this.userUid =
	 * userUid; }
	 */

}
