package com.nmk.ecomm.web.vo;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author NMK OPT 1
 *
 */
public class UserVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer uid;
	@NotEmpty
	@Size(min = 2, max = 10,message="Should have atleast two characters")
	private String userId;
	@NotEmpty
	@Size(min = 8, max = 20,message="Should have atleast 8 characters")
	private String pwd;
	@NotEmpty
	@Size(min = 2, max = 10,message="Need to have atleast two charcters")
	@Pattern(regexp = "[a-zA-Z]+")
	private String firstName;
	@NotEmpty
	@Size(min = 2, max = 10)
	@Pattern(regexp = "[a-zA-Z]+",message="Need to have atleast two charcters")
	private String lastName;
	private String middleName;
	@NotEmpty
	@Email(message="Enter valid Email Address ")
	private String emailAddress;
	private String homePhone;
	private String workPhone;
	@Pattern(regexp = "(^$|[0-9]{10})")
	@NotEmpty
	private String mobilePhone;
	private String fax;
	private String status;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;
	
	private String newpassword;

	public UserVO() {
	}

	public UserVO(final String userId, final String pwd, final String firstName, final String lastName,
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

	public UserVO(final String userId, final String pwd, final String firstName, final String lastName,
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
	
	

	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("UserVO Details/n").append("\tuid:" + this.uid).append("\tuserId:" + this.userId)
				.append("\tpwd:" + this.pwd).append("\tfirstName:" + this.firstName)
				.append("\tlastName:" + this.lastName).append("\tmiddleName:" + this.middleName)
				.append("\temailAddress:" + this.emailAddress).append("\thomePhone:" + this.homePhone)
				.append("\tworkPhone:" + this.workPhone).append("\tmobilePhone:" + this.mobilePhone)
				.append("\tfax:" + this.fax).append("\tstatus:" + this.status).append("\tcreatedBy:" + this.createdBy)
				.append("\tcreateDate:" + this.createDate).append("\tmodifiedBy:" + this.modifiedBy)
				.append("\tmodifiedDate:" + this.modifiedDate);
		return builder.toString();
	}

}
