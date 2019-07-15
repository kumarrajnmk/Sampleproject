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
								Guitar<span>.</span>
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
						<img src="/eretailweb/static/images/guitar.jpg" alt="">
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
					<div class="details_name">Juarez Acoustic Guitar, 38 Inch
						Cutaway, 038C With Bag, Strings, Pick And Strap, Black</div>
					<div class="details_discount">$1,890.00</div>
					<div class="details_price">$5,100.00</div>

					<!-- In Stock -->
					<div class="in_stock_container">
						<div class="availability">Availability:</div>
						<span>In Stock</span>
					</div>
					<div class="details_text">
						<p>Black Glossy Finish, Number of Frets: 18, Acoustic Guitar
							with strap, Bag, Strings and 2 Picks</p>
						<p>Great looks with an innovative design to produce good
							quality sound</p>
						<p>Finger board: Linden Wood, Fretboard - Ebony Wood, Size: 38
							inches, Cutaway</p>
						<p>Included components: Acoustic Guitar with strap, Bag,
							Strings and 2 Picks</p>
						<div class="details_share">
							<p class="details_name">Special offers and product promotions</p>
							<P>
							<li>2 weeks Replacement Warranty on Manufacturing defects</li>
							</P>
							<p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/jsp/common/footer.jsp"%>
