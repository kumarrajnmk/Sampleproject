   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@include file="/jsp/common/header-contact.jsp"%>
<%@include file="/jsp/common/menu.jsp"%>
<!-- Home -->
<div class="home">
	<div class="home_container">
		<div class="home_background"
			style="background-image: url(/eretailweb/static/images/contact.jpg)"></div>
		<div class="home_content_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="home_content">
							<div class="breadcrumbs">
								<ul>
									<li><a href="index.html">Home</a></li>
									<li>My Cards</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<head>
<script>
	function hello() {

		document.getElementById("myTable").deleteRow(1);
	}
</script>
</head>
<body>

	<div class="cart_info">
		<div class="container">
		<br> <br> 
		<table style="margin-left: 12 0px;"
			class="table"
			id="myTable" >
			
			<thead  >
				<label class="" >
				<tr style="color:black;">
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">Idx</th>
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">Name On Card</th>
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">Card Number</th>
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">Expiry Month&Year</th>
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">Card Type</th>
					<th style="color:#737373;font-size: 15px;" class="cart_item_name">CVV</th>
					<th  style="color:#666666;font-size: 16px;" class="cart_item_name">Country</th>
					<th  style="color:#737373;font-size: 16px;" class="cart_item_name">Edit/Delete</th>

				</tr></label>
			</thead>
			<tbody>
				  <c:forEach var="list" items="${card}"> 
				<tr>
					<td>${list.idx}</td>
					<td>${list.name}</td>
					<td>${list.description}</td>
					<td>${list.createdBy}</td>
					<td>American Express</td>
					<td>${list.modifiedBy}</td>
					<td>CHE</td>
 						<td>
 						
 						
 						 <div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;" ><a href="/eretailweb/getcardtype2.do?cardtypeId=${list.idx}">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;"><a href="/eretailweb/deletecardtype.do?cardtypeId=${list.idx}">Delete</a></div></label>
						</div> 
						<%-- <label>
<button
onclick="window.location.href = '/eretailweb/getcardtype.do?cardtypeId=${list.idx}';"
class="btn btn-default btn-sm">
<span class="glyphicon glyphicon-pencil"></span>Edit
</button>
<button
onclick="window.location.href = '/eretail-admin-web/deletecardtype.do?cardtypeId=${list.idx}';"
class="btn btn-default btn-sm">
<span class="glyphicon glyphicon-trash"></span>Delete
</button>

</label>
 --%>						</td>
				</tr>
				</c:forEach>
				
				
				<!-- <tr>
					<td>Kumar</td>
					
					<td>5404000000000001</td>
					<td>2/21</td>
					<td>142</td>
					<td>Mastercard</td>
					<td>RUS</td>
					<td><div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;"><a href="/eretailweb/jsp/pages/makepayment.jsp">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;" onclick="hello()"><a href="#">Delete</a></div></label>
						</div>
						</td>
					button class="button contact_button" style="width: 140px">
					<span><a href="/eretailweb/jsp/pages/makepayment.jsp"">Deliver</a></span>
				</button>
				<button class="button contact_button" style="width: 80px" onclick="document.getElementById('demo').style.display='block'">
					<span><a href="#">Edit</a></span>
				</button>
				</tr>
				<tr>
					<td>Karthik</td>
					<td>4900000000000086</td>
					<td>2/20</td>
					<td>136</td>
					<td>Mastercard</td>
					<td>USA</td>
					<td><div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;"><a href="/eretailweb/jsp/pages/makepayment.jsp">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;" onclick="hello()"><a href="#">Delete</a></div></label>
						</div>
						</td> 
				</tr>
				<tr>
					<td>John</td>
					<td>4003600000000006</td>
					<td>3/30</td>
					<td>158</td>
					<td>Visa</td>
					<td>CHE</td>
					<td><div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;"><a href="/eretailweb/jsp/pages/makepayment.jsp">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;" onclick="hello()"><a href="#">Delete</a></div></label>
						</div>
						</td> 
				</tr>
				<tr>
					<td>Victor</td>
					<td>4242424242424242</td>
					<td>2/25</td>
					<td>147</td>
					<td>Rupay</td>
					<td>GBR</td>
					<td><div class="product_quantity_container">	
							<label><div class="button cart_button" style="width: 80px;height: 50px;"><a href="/eretailweb/jsp/pages/makepayment.jsp">Edit</a></div></label>
							<label><div class="button cart_button" style="width: 80px;height: 50px;" onclick="hello()"><a href="#">Delete</a></div></label>
						</div>
						</td> 
				</tr> -->
			</tbody>
		</table>
	<!-- <a href="/eretailweb/jsp/pages/newpayment.jsp">
	<button style="width: 130px; height: 40px;margin-left: 1000px;background-color: white;"
			onclick="hello()" class="button contact_button" type="button">Add New Card</button></a> -->
			<div class="button cart_button" style="margin-left: 1000px;" onclick="hello()">
			<a href="/eretailweb/jsp/pages/newpayment.jsp">Add New Card</a></div>
</div>
</div>
</body>
<%@include file="/jsp/common/footer.jsp"%>

