package com.nmk.ecomm.service.entity;
// Generated Oct 3, 2017 9:51:48 AM by Hibernate Tools 5.0.0.Alpha3

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
@Table(name = "ecomm_card_type")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommCardType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@NotBlank(message = "Name should be unique and have atleast 2 characters")
	private String name;

	@NotBlank(message = "description can't empty!")
	private String description;

	@Size(min = 2, message = "created_by can't empty! should have atleast 2 characters")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

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
