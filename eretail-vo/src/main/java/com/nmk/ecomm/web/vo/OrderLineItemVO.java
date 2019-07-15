package com.nmk.ecomm.web.vo;

/**
 * @author NMK OPT 1
 *
 */
public class OrderLineItemVO {
	/**
	*/
	private ProductVO productVO;
	/**
	*/
	private int quantity;
	/**
	*/
	private double price;

	/**
	*/
	public OrderLineItemVO() {
		super();
	}

	public OrderLineItemVO(final ProductVO productVO, final int quantity, final double price) {
		super();
		this.productVO = productVO;
		this.quantity = quantity;
		this.price = price;
	}

	public ProductVO getProductVO() {
		return productVO;
	}

	public void setProductVO(final ProductVO productVO) {
		this.productVO = productVO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}
}
