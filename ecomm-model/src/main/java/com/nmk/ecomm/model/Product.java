package com.nmk.ecomm.model;

import java.util.Date;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author NMK OPT 1
 *
 */
@XmlRootElement(name = "product")
@XmlAccessorOrder
public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idx;
	/*
	 * @Size(min = 2,max=10)
	 * 
	 * @Pattern(regexp="[a-zA-Z]+")
	 * 
	 * @NotEmpty
	 */
	private String name;
	/* @NotEmpty */
	private String displayName;
	/* @NotEmpty */
	private String overview;
	@Size(min = 2, max = 10)
	/* @NotEmpty */
	private String description;
	private String description1;
	private String author;
	private String image;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private int availableQuantity;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private double price;
	/*
	 * @Min(value=1, message="Must be equal or greater than 1")
	 * 
	 * @Max(value=500, message="Must be equal or less than 500")
	 */
	private double salePrice;
	/* @NotEmpty */
	private String upcCode;
	private int status;
	private String createdBy;
	private Date createDate;
	private String modifiedBy;
	private Date modifiedDate;
	private int productCategoryIdx;
	private int companyIdx;

	public Product() {
	}

	public Product(String name, String displayName, String overview, String description, String image,
			int availableQuantity, double price, double salePrice, String upcCode, int status, String createdBy,
			Date createDate, int productCategoryIdx, int companyIdx) {
		this.name = name;
		this.displayName = displayName;
		this.overview = overview;
		this.description = description;
		this.image = image;
		this.availableQuantity = availableQuantity;
		this.price = price;
		this.salePrice = salePrice;
		this.upcCode = upcCode;
		this.status = status;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.productCategoryIdx = productCategoryIdx;
		this.companyIdx = companyIdx;
	}

	public Product(String name, String displayName, String overview, String description, String description1,
			String author, String image, int availableQuantity, double price, double salePrice, String upcCode,
			int status, String createdBy, Date createDate, String modifiedBy, Date modifiedDate, int productCategoryIdx,
			int companyIdx) {
		this.name = name;
		this.displayName = displayName;
		this.overview = overview;
		this.description = description;
		this.description1 = description1;
		this.author = author;
		this.image = image;
		this.availableQuantity = availableQuantity;
		this.price = price;
		this.salePrice = salePrice;
		this.upcCode = upcCode;
		this.status = status;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.productCategoryIdx = productCategoryIdx;
		this.companyIdx = companyIdx;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(Integer idx) {
		this.idx = idx;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getOverview() {
		return this.overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription1() {
		return this.description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getAvailableQuantity() {
		return this.availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public String getUpcCode() {
		return this.upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getProductCategoryIdx() {
		return this.productCategoryIdx;
	}

	public void setProductCategoryIdx(int productCategoryIdx) {
		this.productCategoryIdx = productCategoryIdx;
	}

	public int getCompanyIdx() {
		return this.companyIdx;
	}

	public void setCompanyIdx(int companyIdx) {
		this.companyIdx = companyIdx;
	}

}
