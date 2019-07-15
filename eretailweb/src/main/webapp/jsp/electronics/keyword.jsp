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
								KeyBoard <span>.</span>
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
						<img src="/eretailweb/static/images/product_8.jpg" alt="">
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
					<div class="details_name">Apple iPhone 6S (Space Grey, 2GB
						RAM, 32GB Storage)</div>
					<div class="details_discount">$2900</div>
					<div class="details_price">$2950</div>

					<!-- In Stock -->
					<div class="in_stock_container">
						<div class="availability">Availability:</div>
						<span>In Stock</span>
					</div>
					<div class="details_text">
						<p>Camera: 12 MP Rear camera with Auto focus, 4K Video
							recording and flash | 5 MP front camera</p>
						<p>Keyboard, Mouse, USB Receiver, 1 AAA (Keyboard) and 1 AA
							(Mouse) Batteries,1 User Manua</p>
						<p>2 Million Key Strokes</p>
						<p>2.4 GHz Wireless Technology, Hot Keys, Noiseless Keys,
							Reliable Wireless, Smooth, Responsive Cursor Control, Compact and
							Sleek Design</p>
						<p>Weight 560 g</p>
						<p>Other Dimensions Mouse: 98 x 60 x 32 mm</p>
						<div class="details_share">
							<p>Warranty Summary 1 Year Limited Brand Warranty</p>
							<p>Covered in Warranty Manufacturing Defects</p>
							<p>Not Covered in WarrantyPhysical Damages</p>
							<p>Warranty Service Type Carry In</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/jsp/common/footer.jsp"%>
