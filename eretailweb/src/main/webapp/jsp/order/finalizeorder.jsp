<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Finalize Order</title>
</head>
<body>
	<form method="post" action="/eretail/jsp/order/orderconfirmation.jsp">
		<table cellpadding="0" cellspacing="1">
			<tr>
				<td>
					<table>
						<tr>
							<td valign="top"><b><u>Shipping Information</u></b><br /> <br />
								John X Alex<br /> Main St,<br /> Fremont, CA, 94584<br /> Ph:
								510-678-9999<br /> <br /></td>
							<td><b><u>Billing Information</u></b><br /> <br /> <b>VISA</b>
								Last four digits: <br /> Exp Date: 11/12<br /> <br /> <b><i>Billing
										Address</i></b><br /> John X Alex<br /> Main St,<br /> Fremont, CA,
								94584<br /> Ph: 510-678-9999<br /> <br /></td>
						</tr>

						<tr>
							<td colspan="2"><b>Estimated Delivery Date: October 29,
									2017</b><br /> <br /></td>
						</tr>
						<tr>
							<td colspan="2"><b><u>Product summary</u></b> <br /> <br />
								<table cellpadding="0" cellspacing="1">
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
								</table></td>
						</tr>

					</table>
				</td>
				<td  valign="top">
					<table cellpadding="0" cellspacing="1">
						<tr>
							<td width="201" colspan="2">
								<input type="submit" name="back" value="Place Order" />&nbsp;
								<br/><br/>
							</td>
						</tr>
						<tr>
							<td colspan="2"><b><u>Order Summary</u></b><br/></td>
						<tr>
							<td>Items Total:</td>
							<td>$30.98</td>
						</tr>
						<tr>
							<td>Tax:</td>
							<td>$3.98</td>
						</tr>
						<tr>							
							<td>Shipping:</td>
							<td>$3.00</td>
						</tr>
						<tr>							
							<td colspan="2"><hr/></td>
						</tr>
						<tr>							
							<td><font color="blue"><b>Order Total</b></font></td>
							<td><font color="blue"><b>$37.96</b></font></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>