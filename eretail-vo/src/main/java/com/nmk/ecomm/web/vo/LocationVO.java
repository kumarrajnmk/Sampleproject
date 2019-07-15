package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class LocationVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;
	/**
	*/
	private String name;
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
	private String country;
	/**
	*/
	private String phone;
	/**
	*/
	private String fax;
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

	public LocationVO() {
	}

	public LocationVO(String createdBy, Date createDate) {
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	public LocationVO(final String name, final String address1, final String address2, final String city,
			final String state, final String zipcode, final String country, final String phone, final String fax,
			final String createdBy, final Date createDate, final String modifiedBy, final Date modifiedDate) {
		super();
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(final String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(final String fax) {
		this.fax = fax;
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

	public void setModifiedBy(String modifiedBy) {
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
