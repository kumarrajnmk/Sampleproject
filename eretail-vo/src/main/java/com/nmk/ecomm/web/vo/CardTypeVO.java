package com.nmk.ecomm.web.vo;

import java.util.Date;

/**
 * @author NMK OPT 1
 *
 */
public class CardTypeVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	/**
	*/
	private Integer idx;
	/**
	*/
	private String name;
	/**
	*/
	private String description;
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

	public CardTypeVO() {
	}

	/**
	 * @param name
	 * 
	 */
	public CardTypeVO(final String name, final String createdBy, final Date createDate) {
		this.name = name;
		this.createdBy = createdBy;
		this.createDate = createDate;
	}

	/**
	 * @param name
	 * @param descr
	 * @param createdBy
	 * @param createDate
	 */
	public CardTypeVO(final String name, final String description, final String createdBy, final Date createDate,
			final String modifiedBy, final Date modifiedDate) {
		this.name = name;
		this.description = description;
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return
	 */
	public Integer getIdx() {
		return this.idx;
	}

	/**
	 * @return
	 */
	public void setIdx(final Integer idx) {
		this.idx = idx;
	}

	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @return
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	/**
	 * @return
	 */
	public String getCreatedBy() {
		return this.createdBy;
	}

	/**
	 * @return
	 */
	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return
	 */
	public Date getCreateDate() {
		return this.createDate;
	}

	/**
	 * @return
	 */
	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return
	 */
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	/**
	 * @return
	 */
	public void setModifiedBy(final String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	/**
	 * @return
	 */
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * @return
	 */
	public void setModifiedDate(final Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
