<%@include file="/jsp/common/header-product.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
<html>
<head>
<style>
.button {

  display: inline-block;
  
}
.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
}

.button5:hover {
  background-color: #555555;
  color: white;
}
</style>
</head>
<div class="home">
	<div class="home_container">
		<div class="home_background"
			style="background-image: url(/eretailweb/static/images/categories.jpg)"></div>
		<div class="home_content_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content">
							<div class="home_title">
								T-Shirt<span>.</span>
							</div>
							<div class="home_text">
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Nullam a ultricies metus. Sed nec molestie eros. Sed viverra
									velit venenatis fermentum luctus.</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<!-- Product Details -->

<div class="product_details">
	<div class="container">
		<div class="row details_row">

			<!-- Product Image -->
			<div class="col-lg-6">
				<div class="details_image">
					<div class="details_image_large">
						<img src="/eretailweb/static/images/shirts.jpg" alt="">
						<div class="product_extra product_new">
							<a href="categories.html">New</a>
						</div></div>
						<div class="product_quantity_container">
							<div class="button cart_button"><a href="/eretailweb/addItemToCart.do">Add to cart</a></div>
							<div class="button cart_button"><a href="/eretailweb/addnewaddress.do">Buy Now</a></div>
						</div>
					</div>
					</div>

			<!-- Product Content -->
			<div class="col-lg-6">
				<div class="details_content">
					<div class="details_name">DFH Men Multi Colour Half Sleeves
						T-Shirt.</div>
					<div class="details_discount">$999.00</div>
					<div class="details_price">$2,001.00</div>

					<!-- In Stock -->
					<div class="in_stock_container">
						<div class="availability">Availability:</div>
						<span>Only 5 ledt in Stock</span>
					</div>
					<div class="details_text">
						<p>A T-shirt (or t shirt, or tee) is a style of unisex fabric
							shirt named after the T shape of its body and sleeves.
							Traditionally it has short sleeves and a round neckline, known as
							a crew neck, which lacks a collar. T-shirts are generally made of
							a stretchy, light and inexpensive fabric and are easy to clean.</p>
						<div class="details_share">
						<p class="details_name">Special offers and product promotions</p>
							<P>
							<li>5 year Replacement Warranty on Manufacturing defects</li>
							</P>
							<P>
							<li>No cost EMI available on HDFC credit cards on orders
								above Rs.3000 and on HDFC debit cards on orders above Rs.10,000
								Here's how (terms and conditions apply)</li>
							</P>
							<P>
							<li>Get 5% cashback up to Rs.25 using BHIM UPI. Applicable
								only once per customer. Cashback will be credited as Amazon Pay
								balance within 10 days. Here's how (terms and conditions apply)
							</li>
							</P>
							<P>
							<li>Save up to Rs 2400 a year; Earn 2% cash back on every
								order with Amazon Pay balance. Sign up now! Here's how (terms
								and conditions apply)</li>
							</P>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- <div class="products">
	<div class="container">
		<div class="row">
			<div class="col text-center">
				<hr size="50">
				<div class="products_title">Related Products</div>
			</div>
		</div>
		<div class="row">
			<div class="col">

				<div class="product_grid">

					Product
					<div class="product">
						<div class="product_image">
							<img src="/eretailweb/static/images/carpet1.jpg" alt="">
						</div>
						<div class="product_extra product_new">
							<a href="categories.html">New</a>
						</div>
						<div class="product_content">
							<div class="product_title">
								<a href="product.html">Carpet</a>
							</div>
							<div class="product_price">$670</div>
						</div>
					</div>

					Product
					<div class="product">
						<div class="product_image">
							<img src="/eretailweb/static/images/carpet2.jpg" alt="">
						</div>
						<div class="product_extra product_sale">
							<a href="categories.html">Sale</a>
						</div>
						<div class="product_content">
							<br>
							<div class="product_title">
								<a href="product.html">Carpet</a>
							</div>
							<div class="product_price">$520</div>
						</div>
					</div>

					Product
					<div class="product">
						<div class="product_image">
							<img src="/eretailweb/static/images/carpet3.jpg" alt="">
						</div>
						<div class="product_content">
							<div class="product_title">
								<a href="product.html">Carpet</a>
							</div>
							<div class="product_price">$710</div>
						</div>
					</div>

					Product
					<div class="product">
						<div class="product_image">
							<img src="/eretailweb/static/images/carpet.jpg	" alt="">
						</div>
						<div class="product_content">
							<div class="product_title">
								<a href="product.html">Carpet</a>
							</div>
							<div class="product_price">$330</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>
 -->
</html>
<%@include file="/jsp/common/footer.jsp"%>
