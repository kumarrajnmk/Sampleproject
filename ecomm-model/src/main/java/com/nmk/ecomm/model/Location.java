package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "ecommLocation")
@XmlAccessorOrder

public class Location implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Size(min = 2,max=10)
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 * 
	 * @NotEmpty
	 */
	private String name;
	private String address1;
	private String address2;
	private String city;
	/*
	 * @Pattern(regexp="[a-zA-Z]+")
	 * 
	 * @NotEmpty
	 */
	private String state;
	/*
	 * @NotEmpty(message="Zip Code is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{5})")
	 */
	private String zipcode;
	/*
	 * @NotEmpty(message="Country is required")
	 */ private String country;
	/*
	 * @NotEmpty(message="Phone Number is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{10})")
	 */
	private String phone;
	/*
	 * @NotEmpty(message="Fax is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{10})")
	 */
	private String fax;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public Location() {
	}

	public Location(String createdBy, Date createDate) {
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	public Location(final String name, final String address1, final String address2, final String city,
			final String state, final String country, final String phone, final String fax, final String createdBy,
			final String zipcode, final Date createDate, final String modifiedBy, final Date modifiedDate) {
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.state = zipcode;
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

	public void setName(final String name) {
		this.name = name;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
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

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
