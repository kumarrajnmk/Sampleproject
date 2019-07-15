<%@include file="/jsp/common/header-product.jsp"%>
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
								<div class="home_text"><p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a ultricies metus. Sed nec molestie eros. Sed viverra velit venenatis fermentum luctus.</p></div>
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
						<div class="details_image_large"><img src="/eretailweb/static/images/product_1.jpg" alt="">
						<div class="product_extra product_new">
							<a href="categories.html">New</a>
						</div></div>
						<div class="product_quantity_container">
								<form action="#" method="post" modelAttribute="command">
								 <input type="hidden" name="cmd" value="_cart">
                                          <input type="hidden" name="add" value="1">
                                          <input type="hidden" name="electric_item" value="electronic">
							<div class="button cart_button"><a href="/eretailweb/addItemToCart.do?id=${1}">Add to cart</a></div>
							<div class="button cart_button"><a href="/eretailweb/addnewaddress.do">Buy Now</a></div>
							</form>
						</div>
					</div>
					</div>



				<!-- Product Content -->
				<div class="col-lg-6">
					<div class="details_content">
						<div class="details_name">Apple iPhone X (Space Grey, 3GB RAM, 64GB Storage, 12 MP Dual Camera, 458 PPI Display)</div>
						<div class="details_discount">$1500</div>
						<div class="details_price">$1200</div>

						<br>
				
					<td>Product Id:  ${command.idx}</td>
					<br>
					<td>${command.name}</td>
					<br>
					<td>${command.displayName}</td>
					<br>
					<td>Description:  ${command.description}</td>
					<br>
					<td>Available Quantity: ${command.availableQuantity}</td>
					<br>
					<td>Sales Price:  ${command.salePrice}</td>
					
 						<%-- <td><div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;" ><a href="/eretailweb/getcardtype.do/${list.idx}">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;" onclick="hello()"><a href="#">Delete</a></div></label>
						</div>
						</td> --%>
		
						<!-- In Stock -->
					 <div class="in_stock_container">
							<div class="availability">Availability:</div>
							<span>In Stock</span>
						</div>
						<div class="details_text">
							<p >Deal of the Day: $1200 FREE Delivery.Details</p>
							<p>Colour: Space Grey</p>
							<p>Size name: 64GB</p>
									<div class="details_share">
							
							<P>-> Camera: 12+12 MP Dual rear camera with Dual optical image stabilization, Portrait Mode, Digital zoom up to 10x, Quad-LED True tone flash and Slow sync, 4K Video recording at 24 fps or 30 fps or 60 fps and Slow-motion video recording in 1080p at 120 fps | 7 MP front TrueDepth camera with Retina Flash and Animoji feature.</P>
							<P>-> Display: 14.73 centimeters (5.8-inch) Full HD+ capacitive touchscreen display with 2436x1125 pixels</P>
							<P>-> Included in box: Ear pods with Lightning connector (wired), Lightning to 3.5mm Headphone jack adaptor, Lightning to USB Cable and USB Power adaptor</P>
							<P>-> Operating System and Processor: iOS v11.1.1 operating system with 1.3GHz Apple A11 Bionic hexa core processor</P>
							<P>-> Battery: 2716 mAH lithium ion battery providing talk-time of 21 hours</P>
						
						</div>
						</div> 
					

					</div>
				</div>
			</div>
		</div>
  </div>
   <script>
         toys.render();
         
         toys.cart.on('toys_checkout', function (evt) {
         	var items, len, i;
         
         	if (this.subtotal() > 0) {
         		items = this.items();
         
         		for (i = 0, len = items.length; i < len; i++) {}
         	}
         });
      </script>
<%@include file="/jsp/common/footer.jsp"%>
 
<%--  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <html>
 		<c:forEach var="list" items="${command}"> 
				<h1>data</h1>
 	<td>${list.idx}</td>
					<td>${list.name}</td>
					<td>${list.displayName}</td>
					<td>${list.description}</td>
					<td>${list.availableQuantity}</td>
					<td>${list.salePrice}</td>
					</c:forEach>
						<h1>${command.name}</h1>
		 </html> --%>
					
					
				