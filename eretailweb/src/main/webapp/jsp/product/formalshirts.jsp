<%@include file="/jsp/common/header-product.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
<html>
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
								Formal Shirts.<span>.</span>
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
						<img src="/eretailweb/static/images/formalshirts.jpg" alt="">
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
					<div class="details_name">Peter England Men's Solid Slim Fit
						Formal Shirt</div>
					<div class="details_discount">$999.00</div>
					<div class="details_price">$629.00</div>

					<!-- In Stock -->
					<div class="in_stock_container">
						<div class="availability">Availability:</div>
						<span>In Stock</span>
					</div>
					<div class="details_text">
						<p>Colour: Dark Blue with Red</p>
						<p>
						<li>50% Cotton and 50% tencel</li>
						</p>
						<p>
						<li>Long sleeve</li>
						</p>

						<p>
						<li>Cutaway collar</li>
						</p>
						<p>
						<li>Slim fit</li>
						</p>
						<p>
						<li>Machine wash</li>
						</p>
						<div class="details_share">
							<p class="details_name">Special offers and product promotions</p>
							<P>
							<li>15 days Warranty on Manufacturing defects</li>
							</P>
							<p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</html>
<%@include file="/jsp/common/footer.jsp"%>
