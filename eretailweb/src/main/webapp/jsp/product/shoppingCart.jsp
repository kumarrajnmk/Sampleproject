
<%@include file="header.html"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Product Dashboard</title>

<script>


var purchasedItemsList="";

function getpurchasedproducts()
{
	alert('hello');
	
	//alert(purchasedItemsList);
	
	//document.getElementById("myInput").value = " 1 13 15";
	
	document.getElementById("myInput").value=purchasedItemsList;

	var y=document.getElementById("myInput").value;
	
	alert(y);
	
	//alert(document.forms[0].name);
	
	//document.forms[0].action="/ecomm-eretail/getItemsFromCart.do";
	
	}
	
	function addItemToCart(param)
	{
		
	//	alert(param);
		
		purchasedItemsList=purchasedItemsList+" "+param;
		
		//alert(purchasedItemsList);
		
		
		
	}

</script>

</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<form name=purchaseform action=/ecomm-eretail/placeorder.do onsubmit=getpurchasedproducts()>
	
	<div align="center">
		<h2>Items In Cart</h2>
		
	<!-- 	<input type=submit value="PlaceOrder" onclick="getpurchasedproducts()"> -->
		
		<br><br>
		
		<table border="1" cellpadding="0" cellspacing="0" width="50%">
			<tr>
			    <th>Purchase</th>
				<th>Prdt Id</th>
				<th>Prdt name</th>
				<th>Prdt Overview</th>
				<th>Prdt desc</th>
				<th>Prdt desc1</th>
				<th>Prdt author</th>
				<th>Prdt image</th>
				<th>AvailQuat Prdt </th>
				<th>Prdt price</th>
				<th>Prdt salePrice</th>
				<th>Prdt upcCode</th>
				<th>Prdt status</th>
				<th>Prdt CategoryIdx</th>
				<th>Prdt companyIdx</th>
				<th>Prdt createdBy</th>
				<th>Prdt createDate</th>
				<th>Prdt modifiedBy</th>
		<!-- 		<th>Prdt modifiedDate</th>  -->
				
				
			</tr>
		    <c:forEach var="shoppingCart" items="${shoppingCart}">
			<tr>
<%-- 		<td bgcolor="#FAFAF9" style="padding-left: 10px;"><input type=checkbox name=purchase" value="${productList.idx}" --%>
<!-- 		onclick="addItemToCart(this.value)"/></td> -->
					<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.idx}"/></td>
				 	<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.name}"/></td>
				 	<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.displayName}"/></td>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.overview}"/></td>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.description}"/></td>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.description1}"/></td>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.author}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.image}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.availableQuantity}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.price}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.salePrice}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.upcCode}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.status}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.productCategoryIdx}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.companyIdx}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.createdBy}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.createDate}"/></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${shoppingCart.modifiedBy}"/></td>
<%--  				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><c:out value="${productList.modifiedDate}"/></td>
 --%>		</tr>
			</c:forEach> 
		</table>
		
		
	</form>
	
	<h1>The Total Cost Is :${TOTALCOST}</h1>
	<form action=/ecomm-eretail/jsp/user/login.jsp>
	<input type=submit value=Checkout>
		</form>
	</div>
	
</body>

</html>


