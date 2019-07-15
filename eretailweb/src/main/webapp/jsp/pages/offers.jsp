<%@include file="/jsp/common/header-categories.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
	<div class="home">
		<div class="home_container">
			<div class="home_background" style="background-image:url(/eretailweb/static/images/categories.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="home_title">Smart Phones<span>.</span></div>
								<div class="home_text"><h3>Today's deal</h3></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Products -->

	<div class="products">
		<div class="container">
			<div class="row">
				<div class="col">
					
					<!-- Product Sorting -->
					<div class="sorting_bar d-flex flex-md-row flex-column align-items-md-center justify-content-md-start">
						<div class="results">Showing <span>4</span> results</div>
						<div class="sorting_container ml-md-auto">
							<div class="sorting">
								<ul class="item_sorting">
									<li>
										<span class="sorting_text">Sort by</span>
										<i class="fa fa-chevron-down" aria-hidden="true"></i>
										<ul>
											<li class="product_sorting_btn" data-isotope-option='{ "sortBy": "original-order" }'><span>Default</span></li>
											<li class="product_sorting_btn" data-isotope-option='{ "sortBy": "price" }'><span>Price</span></li>
											<li class="product_sorting_btn" data-isotope-option='{ "sortBy": "stars" }'><span>Name</span></li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					
					<div class="product_grid">

						<!-- Product -->
					 <div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_1.jpg" alt=""></div>
							<div class="product_extra product_new"><a href="categories.html">New</a></div>
						 <div class="product_content">
							<div class="product_title"><a href="/eretailweb/jsp/pages/productdetails.jsp">Apple iPhone</a></div>
							<div class="product_price">$670</div>
						</div>
					</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_2.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Sale</a></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/electronics/speaker.jsp">Portable Speaker</a></div>
								<div class="product_price">$520</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_4.jpg" alt=""></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/electronics/laptop.jsp">Laptop</a></div>
								<div class="product_price">$330</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_12.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/electronics/camera.jsp">DSLR Camera</a></div>
								<div class="product_price">$580</div>
							</div>
						</div>
					</div>
					<div class="product_pagination">
						<ul>
							<li class="active"><a href="#">01.</a></li>
							<li><a href="#">02.</a></li>
							<li><a href="#">03.</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
<%@include file="/jsp/common/footer.jsp"%>
