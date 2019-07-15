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
@Table(name = "ecomm_user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;

	@Size(min = 2, message = "user_id should have atleast 2 characters")
	private String userId;

	@Size(min = 8, message = "pwd should have atleast 8 characters")
	private String pwd;

	@Size(min = 2, message = "firstName should have atleast 2 characters")
	private String firstName;

	@Size(min = 2, message = "lastName should have atleast 2 characters")
	private String lastName;

	private String middleName;

	@Size(min = 2, message = "emailAddress should have atleast 2 characters")
	private String emailAddress;

	private String homePhone;

	private String workPhone;

	@Size(min = 2, message = "mobilePhone should have atleast 2 characters")
	private String mobilePhone;

	private String fax;

	@Size(min = 2, message = "user_id should have atleast 2 characters")
	private String status;

	@NotBlank(message = "createdby field can't empty!")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

	@NotBlank(message = "modifiername can't empty!")
	private String modifiedBy;

	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

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

	public Integer getUid() {
		return uid;
	}

	public void setUid(final Integer uid) {
		this.uid = uid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(final String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(final String pwd) {
		this.pwd = pwd;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(final String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(final String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(final String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(final String fax) {
		this.fax = fax;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
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
