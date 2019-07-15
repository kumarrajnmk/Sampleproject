package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class ProductVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	*/
	private Integer idx;
	/**
	*/
	private String name;
	/**
	*/
	private String displayName;
	/**
	*/
	private String overview;
	/**
	*/
	private String description;
	/**
	*/
	private String description1;
	/**
	*/
	private String author;
	/**
	*/
	private String image;
	/**
	*/
	private int availableQuantity;
	/**
	*/
	private double price;
	/**
	*/
	private double salePrice;
	/**
	*/
	private String upcCode;
	/**
	*/
	private int status;
	/**
	*/
	private String createdBy;
	/**
	*/
	private Date createDate;
	/**
	*/
	private String modifiedBy;
	/**
	*/
	private Date modifiedDate;
	/**
	*/
	private int productCateIdx;
	/**
	*/
	private int companyIdx;

	public ProductVO() {
	}

	public ProductVO(final String name, final String displayName, final String overview, final String description,
			final String image, final int availableQuantity, final double price, final double salePrice,
			final String upcCode, final int status, final String createdBy, final Date createDate,
			final int productCateIdx, final int companyIdx) {
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
		this.productCateIdx = productCateIdx;
		this.companyIdx = companyIdx;
	}

	public ProductVO(final String name, final String displayName, final String overview, final String description,
			final String description1, final String author, final String image, final int availableQuantity,
			final double price, final double salePrice, final String upcCode, final int status, final String createdBy,
			final Date createDate, final String modifiedBy, final Date modifiedDate, final int productCateIdx,
			final int companyIdx) {
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
		this.productCateIdx = productCateIdx;
		this.companyIdx = companyIdx;
	}

	public Integer getIdx() {
		return this.idx;
	}

	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public String getOverview() {
		return this.overview;
	}

	public void setOverview(final String overview) {
		this.overview = overview;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getDescription1() {
		return this.description1;
	}

	public void setDescription1(final String description1) {
		this.description1 = description1;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(final String image) {
		this.image = image;
	}

	public int getAvailableQuantity() {
		return this.availableQuantity;
	}

	public void setAvailableQuantity(final int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}

	public double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(final double salePrice) {
		this.salePrice = salePrice;
	}

	public String getUpcCode() {
		return this.upcCode;
	}

	public void setUpcCode(final String upcCode) {
		this.upcCode = upcCode;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(final int status) {
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

	public int getProductCateIdx() {
		return this.productCateIdx;
	}

	public void setProductCateIdx(final int productCateIdx) {
		this.productCateIdx = productCateIdx;
	}

	public int getCompanyIdx() {
		return this.companyIdx;
	}

	public void setCompanyIdx(final int companyIdx) {
		this.companyIdx = companyIdx;
	}

}
