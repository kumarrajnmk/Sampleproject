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
@Table(name = "ecomm_location")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;

	@Column(name = "address1", length = 16777215, columnDefinition = "mediumtext")
	private String address1;

	@Column(name = "address2", length = 16777215, columnDefinition = "mediumtext")
	private String address2;

	@NotBlank(message = "city can't empty!")

	@Column(name = "city", length = 16777215, columnDefinition = "mediumtext")
	private String city;

	@NotBlank(message = "state can't empty!")

	@Column(name = "state", length = 16777215, columnDefinition = "mediumtext")
	private String state;

	@NotBlank(message = "zipcode can't empty!")

	@Column(name = "zipcode", length = 16777215, columnDefinition = "mediumtext")
	private String zipcode;

	@NotBlank(message = "country can't empty!")

	@Column(name = "country", length = 16777215, columnDefinition = "mediumtext")
	private String country;
	@NotBlank(message = "phone can't empty!")

	@Column(name = "phone", length = 16777215, columnDefinition = "mediumtext")
	private String phone;
	@NotBlank(message = "fax can't empty!")

	@Column(name = "fax", length = 16777215, columnDefinition = "mediumtext")
	private String fax;
	@NotBlank(message = "createdby field can't empty!")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

	@NotBlank(message = "modifiedBy can't empty!")
	private String modifiedBy;

	/*
	 * @Column(nullable = false)
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @LastModifiedDate
	 */
	private Date modifiedDate;

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
