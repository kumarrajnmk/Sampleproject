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
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@Entity
@Table(name = "ecomm_user_address")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommUserAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@NotBlank(message = "Name should be unique and have atleast 2 characters")
	private String name;

	@NotBlank(message = "streetAddress1 can't empty!")
	private String streetAddress1;

	private String streetAddress2;

	@NotBlank(message = "city can't empty!")
	private String city;

	@NotBlank(message = "state can't empty!")
	private String state;

	@NotBlank(message = "zipCode can't empty!")
	private String zipCode;

	@NotBlank(message = "country can't empty!")
	private String country;

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

	private Integer userUid;

	@EnableTransactionManagement
	public class ConfigurationBean {
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

	public Integer getUserUid() {
		return userUid;
	}

	public void setUserUid(final Integer userUid) {
		this.userUid = userUid;
	}

}
