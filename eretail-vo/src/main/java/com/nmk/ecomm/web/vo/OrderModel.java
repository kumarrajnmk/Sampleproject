package com.nmk.ecomm.web.vo;

import java.util.Map;

/**
 * @author NMK OPT 1
 *
 */
public class OrderModel {
	/**
	*/
	private UserVO userVO;
	/**
	*/
	private String orderId;
	// private Map<Integer, OrderLineItemVO> orderLineIteMap = new HashMap<>();
	/**
	*/
	private String deliveryMethod;
	/**
	*/
	private String pickupLocation;
	/**
	*/
	private UserAddressVO shippingAddress;
	/**
	*/
	private CreditCardVO creditCardVO;
	/**
	*/
	private UserAddressVO billingAddress;
	/**
	*/
	private boolean savecardflag;
	/**
	*/
	private String instructions;

	public OrderModel() {
		super();
	}

	public OrderModel(final UserVO userVO, String orderId, Map<Integer, OrderLineItemVO> orderLineIteMap,
			String deliveryMethod, String pickupLocation, UserAddressVO shippingAddress, CreditCardVO creditCardVO,
			UserAddressVO billingAddress, boolean savecardflag, String instructions) {
		super();
		this.userVO = userVO;
		this.orderId = orderId;
		// this.orderLineIteMap = orderLineIteMap;
		this.deliveryMethod = deliveryMethod;
		this.pickupLocation = pickupLocation;
		this.shippingAddress = shippingAddress;
		this.creditCardVO = creditCardVO;
		this.billingAddress = billingAddress;
		this.savecardflag = savecardflag;
		this.instructions = instructions;
	}

	public UserVO getUserVO() {
		return userVO;
	}

	public void setUserVO(final UserVO userVO) {
		this.userVO = userVO;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(final String orderId) {
		this.orderId = orderId;
	}

	// public Map<Integer, OrderLineItemVO> getOrderLineItems() {
	// return orderLineIteMap;
	// }
	// public void setOrderLineItems(Map<Integer, OrderLineItemVO> orderLineIteMap)
	// {
	// this.orderLineIteMap = orderLineIteMap;
	// }
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(final String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(final String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public UserAddressVO getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(final UserAddressVO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public CreditCardVO getCreditCardVO() {
		return creditCardVO;
	}

	public void setCreditCardVO(final CreditCardVO creditCardVO) {
		this.creditCardVO = creditCardVO;
	}

	public UserAddressVO getbillingAddress() {
		return billingAddress;
	}

	public void setbillingAddress(final UserAddressVO billingAddress) {
		this.billingAddress = billingAddress;
	}

	public boolean isSavecardflag() {
		return savecardflag;
	}

	public void setSavecardflag(final boolean savecardflag) {
		this.savecardflag = savecardflag;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(final String instructions) {
		this.instructions = instructions;
	}
	/*
	 * public void addItemToCard(OrderLineItemVO orderLineItemVO) { if
	 * (orderLineIteMap.containsKey(orderLineItemVO.getProductVO().
	 * getProductCategoryIdx())){ OrderLineItemVO currentOrderLineItemVO =
	 * orderLineIteMap.get(orderLineItemVO.getProductVO().getProductCategoryIdx());
	 * currentOrderLineItemVO.setQuantity(currentOrderLineItemVO.getQuantity() +
	 * orderLineItemVO.getQuantity()); } else{
	 * orderLineIteMap.put(orderLineItemVO.getProductVO().getProductCategoryIdx(),
	 * orderLineItemVO); }
	 */
}
