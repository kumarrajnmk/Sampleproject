package com.nmk.ecomm.service.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@Entity
@Table(name = "ecomm_user_card")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommUserCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@NotBlank
	@Size(message = "name should be unique and have atleast 2 characters")
	private String name;

	private String description;

	@NotBlank(message = "card can't empty!")
	private String card;

	@Column(name = "exp_date")
	@NotBlank
	private String expdate;

	@Column(name = "cvv")
	@NotBlank
	private String cvv;

	@Column(name = "first_name")
	@NotBlank(message = "First Name should At least 2 Characters")
	private String firstname;

	@Column(name = "last_name")
	@NotBlank(message = "last Name should At least 2 Characters")
	private String lastname;
	@NotBlank(message = "Address should At least 2 Characters")
	private String address1;

	private String address2;

	private String city;

	private String state;

	@Column(name = "zip_code")
	@NotBlank(message = "Zip Code should At least 2 Characters")
	private String zipcode;

	@Column(name = "user_uid")
	private Integer useruid;

	@Column(name = "card_type_idx")
	private Integer cardtypeidx;

	@NotBlank
	@Size(min = 2, message = "createdBy can't empty! should have atleast 2 characters")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

	@Size(min = 2, message = "modifiedBy can't empty! should have atleast 2 characters")
	private String modifiedBy;

	/*
	 * @Column(nullable = false)
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @LastModifiedDate
	 */
	private Date modifiedDate;

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
