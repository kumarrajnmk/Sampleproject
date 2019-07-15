package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "ecommUsercard")
@XmlAccessorOrder
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class UserCard implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer idx;
	/*
	 * @NotEmpty
	 * 
	 * @Size(min=5,max=10)
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 */
	private String name;
	private String description;
	/*
	 * @NotEmpty(message="Card is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{5})",message="Enter Valid Card")
	 */
	private String card;
	/*
	 * @NotEmpty(message="Expiry Date is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{8})",message="Enter Valid Exp Date(Ex.05061996)")
	 */
	private String expdate;
	/*
	 * @NotEmpty(message="CVV is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{3})",message="Enter Valid CVV")
	 */
	private String cvv;
	/*
	 * @Size(min=5,max=10)
	 */ private String firstname;
	/*
	 * @Size(min=5,max=10)
	 */ private String lastname;
	/*
	 * @NotEmpty(message="Address is required")
	 */ private String address1;
	private String address2;
	private String city;
	private String state;
	/*
	 * @NotEmpty(message="Zip Code is required")
	 * 
	 * @Pattern(regexp="(^$|[0-9]{5})",message="Enter Valid Zip code" )
	 */
	private String zipcode;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private Integer useruid;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private Integer cardtypeidx;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public UserCard() {
	}

	public UserCard(String name, String description, String card, String expdate, String cvv, String firstname,
			String lastname, String address1, String address2, String city, String state, String zipcode,
			Integer useruid, Integer cardtypeidx, String createdBy, Date createDate, String modifiedBy,
			Date modifiedDate) {
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

	public void setIdx(Integer idx) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
