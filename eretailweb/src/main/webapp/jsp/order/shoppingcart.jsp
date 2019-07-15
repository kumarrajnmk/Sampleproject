<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
	<form method="post" action="/eretail/jsp/order/deliverymethod.jsp">
		<table cellpadding="0" cellspacing="1" width="40%">
			<tr>
				<td colspan="5" bgcolor="yellow" style="padding-left: 10px;"><b>Shopping cart</b></td>
			</tr>
			<tr align="left">
				<th>Product</th>
				<th>Description</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total</th>
			</tr>
			
			<tr>
				<td>Mouse</td>
				<td>IBM Mouse</td>
				<td>9.99</td>
				<td>2</td>
				<td>18.98</td>
			</tr>

			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
						
			<tr>
				<td>Key Board</td>
				<td>Microsoft Keyboard</td>
				<td>12.00</td>
				<td>1</td>
				<td>12.00</td>
			</tr>	
			<tr>
				<td colspan="5">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>$30.98</td>
			</tr>	
			<tr>
				<td><input type="submit" name="continueshopping" value="Continue Shopping" /></td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td><input type="submit" name="updatecart" value="Update Cart" /></td>
				<td><input type="submit" name="checkout" value="CheckOut" /></td>
			</tr>	

		</table>
	</form>
</body>
</html>