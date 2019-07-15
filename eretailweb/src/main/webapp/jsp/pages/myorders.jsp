<%@include file="/jsp/common/header-checkout.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
<html>
<head>
<style type="text/css">
table, th, td {
  outline:black;
  text-align: center;

}
</style>
</head>
<div class="home">
	<div class="home_container">
		<div class="home_background"
			style="background-image: url(/eretailweb/static/images/cart.jpg)"></div>
		<div class="home_content_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content">
							<div class="breadcrumbs">
								<ul>
									<li><a href="index.html">Home</a></li>
									<li><a href="cart.html">My Account</a></li>
									<li>My Orders</li>
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
  <div class="cart_info">
	<div class="container">
		<br><br>	
			<center>
				<div >
				<p><h3>Your Orders</h3></p>
				<br><br>
					<table  style="outline: 1px solid;margin-bottom: 40px;height: 300px;" >
 						<tr style="background-color: #DCDCDC;">
   							<th style="width: 250px;">ORDER PLACED<br>
								20 December 2018</th>
   							<th>TOTAL<br>
							 849.00</th>
							 
 							<th style="width: 500px;text-align: center;">SHIP TO<br>
							vijay</th>
							<th>ORDER # 408-3021639-2138746<br>
							vijay</th>
						 </tr>
					 <tr>
   						<td><img  src="/eretailweb/static/images/icecream.jpg" style="width: 120px;height: 100px;float: left;margin-left: 10px;margin-bottom: 10px;margin-top: 10px;">
   						</p>
   						 </td>
	   					<td><p style="margin-bottom: 30px;">Delicious Homemade Ice-Creams</p>
   					    <p>Return window closed on 25-Oct-2018</p>
   					    <p>$60</p></td>
   					  <td></td>
   					   <td></td>
 					</tr>
 					<br>
 					<!--  <tr>
   						<td><p>&nbsp;&nbsp;&nbsp;&nbsp;Tima Baseball (Leather) Official Size (9 Inch)<img  src="/eretailweb/static/images/baseball.jpg" style="width: 100px;height: 100px;float: left;">
   						</p>
   						<br>
   					<button type="button" value="buy it again">Buy it again</button>
   						 </td>
   						
   					<td>$150</td>
   					  <td style="text-align: u;">Shiva</td>
   					   <td>ORDER # 408-3021639-2138746</td>
 					</tr> -->
			     <tr>
 			 </tr>
	    </table>
      </div>
  </center>
</div>
</div>
</body>
</html>

<%@include file="/jsp/common/footer.jsp"%>
