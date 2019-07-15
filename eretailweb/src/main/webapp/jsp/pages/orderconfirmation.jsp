
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
										<li>OrderConfirmation</li>
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
	<body>
<br>
&nbsp;<center><font color="black">	<h3 >Thank you for your order.</h3></font></center>
	<div class="checkout" ><font color="black">
		<div class="container"  style="margin-left:400px;margin-bottom: 50px">	
			<div class="row">
				<font color=black size=3>
					<table width=500 border=4  style="width:550px; padding:50px; margin-bottom: 1px; " >
						<tr >
							<td valign="top"><b><u style="margin-left: 10px">Shipping Information</u></b><br><br>
								<p style="margin-left: 10px"><font color=black size=3>John X Alex<br> 
								Main St, <br>
								Fremont, CA, 94584<br>
								Ph:510-678-9999</font></p>
							</td>
							<td><b><u 	style="margin-left: 10px">Billing Information</u></b><br><br>
							<!-- <div class="cart_item_name_container">	
								<div class="cart_item_name"><a href="#">Smart Phone Deluxe Edition</a></div>
							</div> -->
								<p style="margin-left: 10px"><font color=black size=3><b>VISA</b>
								Last four digits: <br> 
								Exp Date: 11/12</font></p> <br> 
								<p style="margin-left: 10px"><font color=black size=3><b><u>Billing Address</u></b><br /> 
								John X Alex<br> 
								Main St,<br> 
								Fremont, CA,94584<br> 
								Ph: 510-678-9999</p><br>
							</td>
						</tr>
						<tr >
							<td colspan="2" ><b><font color=black size=3 style="margin-left: 10px">Estimated Delivery Date: January 29,2019</font></b><br /> <br /></td>
						</tr>
						<tr>
							<td colspan="2" width=400><b><u><font color=black size=3 style="margin-left: 10px">Product summary</font></u></b> <br /> <br />
								<table cellpadding="1" cellspacing="2" width=500 >
									<tr align="left">
										<th><font color=black size=3 style="margin-left: 10px">Product</font></th>
										<th>Description</th>
										<th>Price</th>
										<th>Quantity</th>
										<th>Total</th>
									</tr>
									<tr>
										<td><font color=black size=3 style="margin-left: 10px">Smart Phone</font></td>
										<td>IBM Mouse</td>
										<td>${command.salePrice}</td>
										<td>1</td>
										<td>${command.salePrice}</td>
									</tr>
									<tr>
										<td colspan="7">&nbsp;&nbsp;</td>
									</tr>

									<!-- <tr>
										<td>Key Board</td>
										<td>Microsoft Keyboard</td>
										<td>12.00</td>
										<td>1</td>
										<td>12.00</td>
									</tr> -->
								</table>
								</font>
								</td>
						</tr>
						<tr>
							<td colspan="2"><b><u><font color=black size=3 style="margin-left: 10px">Order Summary</font></u></b><br/></td>
						<tr>
							<td><font color=black size=3 style="margin-left: 10px">Items Total:</font></td>
							<td><font color=black size=3 style="margin-left: 10px">${command.salePrice}</font></td>
						</tr>
						<tr>
							<td><font color=black size=3 style="margin-left: 10px">Tax:</font></td>
							<td><font color=black size=3 style="margin-left: 10px">$3.98</font></td>
						</tr>
						<tr>							
							<td><font color=black size=3 style="margin-left: 10px">Shipping:</font></td>
							<td><font color=black size=3 style="margin-left: 10px">Free</font></td>
						</tr>
						<tr>							
							<td colspan="2"><hr/></td>
						</tr>
						<tr>							
							<td><font color=blue size=3 style="margin-left: 10px"><b>Total Orders =</b></font></td>
							<td><font color=blue size=3 style="margin-left: 10px"><b>${command.salePrice}</b></font></td>
						</tr>
					</table>
				</div>
			</div>
	</div>
	</body>
<%@include file="/jsp/common/footer.jsp"%>
