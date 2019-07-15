<%@include file="/jsp/common/header-categories.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
<html>
	<div class="home">
		<div class="home_container">
			<div class="home_background" style="background-image:url(/eretailweb/static/images/categories.jpg)"></div>
			<div class="home_content_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_content">
								<div class="home_title">Computers<span>.</span></div>
								<div class="home_text"><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a ultricies metus. Sed nec molestie eros. Sed viverra velit venenatis fermentum luctus.</p></div>
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
						<div class="results">Showing <span>8</span> results</div>
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
							<div class="product_image"><img src="/eretailweb/static/images/pc.jpg" alt=""></div>
							<div class="product_extra product_new"><a href="categories.html">New</a></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer1.jsp">Desktop</a></div>
								<div class="product_price">$680</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/asus.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Sale</a></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer2.jsp">Asus laptop</a></div>
								<div class="product_price">$520</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/pc1.jpg" alt=""></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer3.jsp">Acer</a></div>
								<div class="product_price">$710</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/computer_4.jpg" alt=""></div>
							<div class="product_content">
							<br>
								<div class="product_title"><a href="/eretailweb/jsp/pages/productcomputers.jsp">Desktop LG</a></div>
								<div class="product_price">$330</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/lap.jpg" alt=""></div>
							<div class="product_content">
							<br>
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer4.jsp">Desktop Sony</a></div>
								<div class="product_price">$170</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/lap1.jpg" alt=""></div>
							<div class="product_extra product_hot"><a href="categories.html">Hot</a></div>
							<div class="product_content">
							<br>	
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer5.jsp">Hp</a></div>
								<div class="product_price">$240</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/lap3.jpg" alt=""></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer6.jsp">Dell</a></div>
								<div class="product_price">$80</div>
							</div>
						</div>

						<!-- Product -->
					<!-- 	<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/asusgen.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Asus</a></div>
								<div class="product_price">$495</div>
							</div>
						</div> -->

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/lap4.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="/eretailweb/jsp/computers/computer7.jsp">Lenovo</a></div>
								<div class="product_price">$399</div>
							</div>
						</div>

						<!-- Product -->
						<!-- <div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_34.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Sports Shoe</a></div>
								<div class="product_price">$400</div>
							</div>
						</div> -->

						<!-- Product -->
						<!-- <div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_35.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Sports Shoe</a></div>
								<div class="product_price">$185</div>
							</div>
						</div>
 -->
						<!-- Product -->
						<!-- <div class="product">
							<div class="product_image"><img src="/eretailweb/static/images/product_36.jpg" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Hot</a></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Sports Shorts</a></div>
								<div class="product_price">$480</div>
							</div>
						</div> -->

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
	</html>
<%@include file="/jsp/common/footer.jsp"%>
