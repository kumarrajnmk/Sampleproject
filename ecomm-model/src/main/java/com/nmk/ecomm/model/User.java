package com.nmk.ecomm.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "User")
@XmlAccessorOrder
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer uid;
	private String userId;
	private String pwd;
	private String firstName;
	private String lastName;
	private String middleName;
	private String emailAddress;
	private String homePhone;
	private String workPhone;
	private String mobilePhone;
	private String fax;
	private String status;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;

	public User() {
	}

	public User(final Integer uid, final String userId, final String pwd, final String firstName) {
		super();
		this.uid = uid;
		this.userId = userId;
		this.pwd = pwd;
		this.firstName = firstName;
	}

	public User(final String userId, final String pwd, final String firstName, final String lastName,
			final String emailAddress, final String mobilePhone, final String status, final String createdBy,
			final Date createDate) {
		this.userId = userId;
		this.pwd = pwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.mobilePhone = mobilePhone;
		this.status = status;
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	public User(final String userId, final String pwd, final String firstName, final String lastName,
			final String middleName, final String emailAddress, final String homePhone, final String workPhone,
			final String mobilePhone, final String fax, final String status, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate) {
		this.userId = userId;
		this.pwd = pwd;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.emailAddress = emailAddress;
		this.homePhone = homePhone;
		this.workPhone = workPhone;
		this.mobilePhone = mobilePhone;
		this.fax = fax;
		this.status = status;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(final Integer uid) {
		this.uid = uid;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(final String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(final String pwd) {
		this.pwd = pwd;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(final String homePhone) {
		this.homePhone = homePhone;
	}

	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(final String workPhone) {
		this.workPhone = workPhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(final String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(final String fax) {
		this.fax = fax;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(final String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(final Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
