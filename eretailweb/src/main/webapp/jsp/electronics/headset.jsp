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
								HeadSet <span>.</span>
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
						<img src="/eretailweb/static/images/product_5.jpg" alt="">
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
					<div class="details_name">Redgear Cosmo 7.1 Gaming Headphones
						with RGB LED Effect, Mic and in-line Controller</div>
					<div class="details_discount">$900</div>
					<div class="details_price">$950</div>

					<!-- In Stock -->
					<div class="in_stock_container">
						<div class="availability">Availability:</div>
						<span>In Stock</span>
					</div>
					<div class="details_text">
						<p>7.1 surround sound</p>
						<p>Noise cancellation microphone</p>
						<p>LED effect on the earcups</p>
						<p>Customization driver</p>
						<div class="details_share">
							<P>
							<li>Passive noise cancellation feature enables users to
								enjoy listening to your music in a chaotic and noisy
								environment, it also enables users to receive calls on-the-go</li>
							</P>
							<P>
							<li>Crafted with care, the polished metal ensures its
								longevity</b>
							</li>
							</P>
							<P>
							<li>Has Giant 6000 mAH Rechargeable Battery. With 12 hours
								of Music Time. Can Also Work as Powerbank</li>
							</P>
							<P>
							<li>The tangle-free cable is lightweight and features
								user-friendly controls for easy functioning</li>
							</P>
							<p>
							<li>warranty : 1 Year</li>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/jsp/common/footer.jsp"%>
