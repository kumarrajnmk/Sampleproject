<%@include file="/jsp/common/header-product.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->

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
								pizza<span>.</span>
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
<div class="product_details">
	<div class="container">
		<div class="row details_row">

			<!-- Product Image -->
			<div class="col-lg-6">
				<div class="details_image">
					<div class="details_image_large">
						<img src="/eretailweb/static/images/food_2.jpg" alt="">
						<div class="product_extra product_new">
							<a href="categories.html">New</a>
						</div></div>
						<div class="product_quantity_container">
							<div class="button cart_button"><a href="/eretailweb/addItemToCart.do">Add to cart</a></div>
							<div class="button cart_button"><a href="/eretailweb/addnewaddress.do">Buy Now</a></div>	
						</div>
					</div>
					</div>

<div class="col-lg-6">
	<div class="details_content">
		<div class="details_name">
Pizza and Pasta: Vegetarian Paperback</div>
		<div class="details_discount">$80</div>
		<div class="details_price">$20.00</div>

		<!-- In Stock -->
		<div class="in_stock_container">
			<div class="availability">Availability:</div>
			<span>Available</span>
		</div>
		<div class="details_text">
			<div class="details_share">
				<P>Pizza and Pasta for dinner tonight sounds great! </P>
				<P>We have a variety of pastas with different sauces-red, white and also the green pesto sauce. Baked pastas like cannelloni and lasagna are a delight too.</P>
			</div>
		</div>
	</div>
</div>
<%@include file="/jsp/common/footer.jsp"%>