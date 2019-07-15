<%@include file="/jsp/common/header-checkout.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
	<!-- Home -->

	<div class="home">
		<div class="home_container">
			<div class="home_background" style="background-image:url(/eretailweb/static/images/cart.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="breadcrumbs">
									<ul>
										<li><a href="index.html">Home</a></li>
										<li><a href="cart.html">Shopping Cart</a></li>
										<li><a href="card.html"></a>Checkout</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Checkout -->
	<div class="checkout">
		<div class="container">
			<div class="row">

				<!-- Billing Info -->
				<div class="col-lg-6">
					<div class="billing checkout_section">
						<div class="section_title">Billing Address</div>
						<div class="section_subtitle">Enter your address info</div>
						<div class="checkout_form_container">
							<form action="/eretailweb/addnewaddress.do" id="checkout_form" class="checkout_form">
								<div class="row">
									<div class="col-xl-6">
										<!-- Name -->
										<label for="name">Full Name*</label>
										<input type="text" id="name" class="checkout_input" required="required">
									</div>
									<div class="col-xl-6 last_name_col">
										<!-- Last Name -->
										<label for="streetAddress1">Street Address1</label>
										<input type="text" id="streetAddress1" class="checkout_input" required="required">
									</div>
									<div class="col-xl-6">
										<!-- Name -->
										<label for="streetAddress2">Street Address2</label>
										<input type="text" id="streetAddress2" class="checkout_input" required="required">
									</div>
									<div class="col-xl-6 last_name_col">
										<!-- Last Name -->
										<label for="city">City</label>
										<input type="text" id="city" class="checkout_input" required="required">
									</div>
								</div>
								<div>
									<!-- Company -->
									<label for="state">State</label>
									<input type="text" id="state" class="checkout_input">
								</div>
								
								<div>
									<!-- Address -->
									<label for="zipCode">Zipcode*</label>
									<input type="text" id="zipCode" class="checkout_input" required="required">
								</div>
								<div>
									<!-- Zipcode -->
									<label for="country">Country*</label>
									<input type="text" id="country" class="checkout_input" required="required">
								</div>
								
								<div>
									<!-- Phone no -->
									<label for="createdBy">Created By</label>
									<input type="phone" id="createdBy" class="checkout_input" required="required">
								</div>
								<div>
									<!-- Email -->
									<label for="modifiedBy">Modified By</label>
									<input type="phone" id="modifiedBy" class="checkout_input" required="required">
								</div>
								<div>
									<!-- Email -->
									<label for="userUid">User Uid</label>
									<input type="phone" id="userUid" class="checkout_input" required="required">
								</div>
								
								<div class="checkout_extra">
									<div>
										<input type="checkbox" id="checkbox_terms" name="regular_checkbox" class="regular_checkbox" checked="checked">
										<label for="checkbox_terms"><img src="/eretailweb/static/images/check.png" alt=""></label>
										<span class="checkbox_title">Terms and conditions</span>
									</div>
									<div>
										<input type="checkbox" id="checkbox_account" name="regular_checkbox" class="regular_checkbox">
										<label for="checkbox_account"><img src="/eretailweb/static/images/check.png" alt=""></label>
										<span class="checkbox_title">Create an account</span>
									</div>
									<div>
										<input type="checkbox" id="checkbox_newsletter" name="regular_checkbox" class="regular_checkbox">
										<label for="checkbox_newsletter"><img src="/eretailweb/static/images/check.png" alt=""></label>
										<span class="checkbox_title">Subscribe to our newsletter</span>
									</div>
								</div>
						
						</div>
					</div>
				</div>

				<!-- Order Info -->

				<div class="col-lg-6">
					<div class="order checkout_section">
						<div class="section_title">Your order</div>
						<div class="section_subtitle">Order details</div>

						<!-- Order details -->
						<div class="order_list_container">
							<div class="order_list_bar d-flex flex-row align-items-center justify-content-start">
								<div class="order_list_title">Product</div>
								<div class="order_list_value ml-auto">Total</div>
							</div>
							<ul class="order_list">
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div class="order_list_title">Smart Phone</div>
									<div class="order_list_value ml-auto">${command.salePrice}</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div class="order_list_title">Subtotal</div>
									<div class="order_list_value ml-auto">${command.salePrice}</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div class="order_list_title">Shipping</div>
									<div class="order_list_value ml-auto">Free</div>
								</li>
								<li class="d-flex flex-row align-items-center justify-content-start">
									<div class="order_list_title">Total</div>
									<div class="order_list_value ml-auto">${command.salePrice}</div>
								</li>
							</ul>
						</div>

						<!-- Payment Options -->
						<div class="payment">
							<div class="payment_options">
								<label class="payment_option clearfix">Paypal
									<input type="radio" name="radio">
									<span class="checkmark"></span>
								</label>
								<label class="payment_option clearfix">Cach on delivery
									<input type="radio" name="radio">
									<span class="checkmark"></span>
								</label>
								<label class="payment_option clearfix">Credit card
									<input type="radio" name="radio">
									<span class="checkmark"></span>
								</label>
								<label class="payment_option clearfix">Direct bank transfer
									<input type="radio" checked="checked" name="radio">
									<span class="checkmark"></span>
								</label>
							</div>
						</div>

						<!-- Order Text -->
						<div class="order_text">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra temp or so dales. Phasellus sagittis auctor gravida. Integ er bibendum sodales arcu id te mpus. Ut consectetur lacus.</div>
						<div class="button order_button"><a href="/eretailweb/address.do">Place Order</a></div>
							
					</div>
					
				</div>
				</form>
			</div>
		</div>
	</div>
<%@include file="/jsp/common/footer.jsp"%>
