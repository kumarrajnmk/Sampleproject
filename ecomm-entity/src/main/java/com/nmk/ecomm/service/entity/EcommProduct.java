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
@Table(name = "ecomm_product")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "create_date", "modified_date" }, allowGetters = true)
public class EcommProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;

	@NotBlank(message = "Name should be unique and have atleast 2 characters")
	private String name;

	@NotBlank(message = "display_name can't empty!")
	private String displayName;

	@NotBlank(message = "overview can't empty!")
	private String overview;

	@NotBlank(message = "description can't empty!")
	private String description;

	private String description1;
	@NotBlank(message = "author can't empty!")

	private String author;
	@NotBlank(message = "image can't empty!")

	private String image;

	private Integer availableQuantity;

	private Double price;

	private Double salePrice;

	@NotBlank(message = "upc_code can't empty!")
	private String upcCode;

	private Integer status;

	private Integer productCategoryIdx;

	private Integer companyIdx;

	@Size(min = 2, message = "created_by can't empty! should have atleast 2 characters")
	private String createdBy;

	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;

	@Size(min = 2, message = "modified_by can't empty! should have atleast 2 characters")
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(final String overview) {
		this.overview = overview;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(final String description1) {
		this.description1 = description1;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(final String image) {
		this.image = image;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(final Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(final Double salePrice) {
		this.salePrice = salePrice;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(final String upcCode) {
		this.upcCode = upcCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(final Integer status) {
		this.status = status;
	}

	public Integer getProductCategoryIdx() {
		return productCategoryIdx;
	}

	public void setProductCategoryIdx(final Integer productCategoryIdx) {
		this.productCategoryIdx = productCategoryIdx;
	}

	public Integer getCompanyIdx() {
		return companyIdx;
	}

	public void setCompanyIdx(final Integer companyIdx) {
		this.companyIdx = companyIdx;
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
