package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "userAddress")
@XmlAccessorOrder
public class UserAddress implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @NotEmpty
	 * 
	 * @Size(min = 2,max=10)
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 */
	private String name;
	/*
	 * @NotEmpty(message="Street Address is required")
	 */ private String streetAddress1;
	private String streetAddress2;
	/*
	 * @NotEmpty
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 */
	private String city;
	/*
	 * @NotEmpty(message="State is required")
	 */ private String state;
	/*
	 * @Pattern(regexp="(^$|[0-9]{5})",message="Enter Valid Zip Code")
	 * 
	 * @NotEmpty(message="Zip Code is required")
	 */
	private String zipCode;
	/*
	 * @NotEmpty(message="Country is required")
	 */ private String country;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;
	private int userUid;

	public UserAddress() {
	}

	public UserAddress(int i) {
		// TODO Auto-generated constructor stub

	}

	public UserAddress(String name, String streetAddress1, String city, String state, String zipCode, String country,
			String createdBy, Date createDate, int userUid) {
		this.name = name;
		this.streetAddress1 = streetAddress1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.userUid = userUid;
	}

	public UserAddress(String name, String streetAddress1, String streetAddress2, String city, String state,
			String zipCode, String country, String createdBy, Date createDate, String modifiedBy, Date modifiedDate,
			final int userUid) {
		super();
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

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress1() {
		return streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public int getUserUid() {
		return userUid;
	}

	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}

}
