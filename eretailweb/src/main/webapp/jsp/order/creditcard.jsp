<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Credit card</title>
</head>
<body>
	<form:form method="POST" action="/eretail/processcreditcard" modelAttribute="creditCardVO">
		<table cellpadding="0" cellspacing="1" width="40%">
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="card">Card Number</form:label></td>
				<td><form:input path="card" maxlength="50"/></td>
			</tr>
			<tr>
				
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="1">Expiry Date</td>
				<td>
					<select name="month" id="month">
					<option value=1>01</option>
					<option value=2>02</option>
					<option value=3>03</option>
					<option value=4>04</option>
					<option value=5>05</option>
					<option value=6>06</option>
					<option value=7>07</option>
					<option value=8>08</option>
					<option value=9>09</option>
					<option value=10>10</option>
					<option value=11>11</option>
					<option value=12>12</option>
					</select>

					<select name="year" id="year">
						<option value=2017>2017</option>
						<option value=2018>2018</option>
						<option value=2019>2019</option>
						<option value=2020>2020</option>
						<option value=2021>2021</option>
						<option value=2022>2022</option>
						<option value=2023>2023</option>
						<option value=2024>2024</option>
						<option value=2025>2025</option>
						<option value=2026>2026</option>
						<option value=2027>2027</option>
						<option value=2028>2028</option>
					</select>
				</td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">CVV</td>
				<td><input type="text" name="cvv" maxlength="10" value="" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="2"><b>Billing Address</b></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">First Name</td>
				<td><input type="text" name="firstName" maxlength="10" value="" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Last name</td>
				<td><input type="text" name="Last Name" maxlength="10" value="" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Address</td>
				<td><input type="text" name="address" maxlength="10" value="" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">City</td>
				<td><input type="text" name="city" maxlength="10" value="" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">State</td>
				<td>
					<select>
						<option value="AL">Alabama</option>
						<option value="AK">Alaska</option>
						<option value="AZ">Arizona</option>
						<option value="AR">Arkansas</option>
						<option value="CA">California</option>
						<option value="CO">Colorado</option>
						<option value="CT">Connecticut</option>
						<option value="DE">Delaware</option>
						<option value="DC">District Of Columbia</option>
						<option value="FL">Florida</option>
						<option value="GA">Georgia</option>
						<option value="HI">Hawaii</option>
						<option value="ID">Idaho</option>
						<option value="IL">Illinois</option>
						<option value="IN">Indiana</option>
						<option value="IA">Iowa</option>
						<option value="KS">Kansas</option>
						<option value="KY">Kentucky</option>
						<option value="LA">Louisiana</option>
						<option value="ME">Maine</option>
						<option value="MD">Maryland</option>
						<option value="MA">Massachusetts</option>
						<option value="MI">Michigan</option>
						<option value="MN">Minnesota</option>
						<option value="MS">Mississippi</option>
						<option value="MO">Missouri</option>
						<option value="MT">Montana</option>
						<option value="NE">Nebraska</option>
						<option value="NV">Nevada</option>
						<option value="NH">New Hampshire</option>
						<option value="NJ">New Jersey</option>
						<option value="NM">New Mexico</option>
						<option value="NY">New York</option>
						<option value="NC">North Carolina</option>
						<option value="ND">North Dakota</option>
						<option value="OH">Ohio</option>
						<option value="OK">Oklahoma</option>
						<option value="OR">Oregon</option>
						<option value="PA">Pennsylvania</option>
						<option value="RI">Rhode Island</option>
						<option value="SC">South Carolina</option>
						<option value="SD">South Dakota</option>
						<option value="TN">Tennessee</option>
						<option value="TX">Texas</option>
						<option value="UT">Utah</option>
						<option value="VT">Vermont</option>
						<option value="VA">Virginia</option>
						<option value="WA">Washington</option>
						<option value="WV">West Virginia</option>
						<option value="WI">Wisconsin</option>
						<option value="WY">Wyoming</option>
					</select>
				</td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Zip Code</td>
				<td><input type="text" name="zipCode" maxlength="12" value="" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center" width="40%"><br>
					<table width="40%">
						<tr>
							<td width="201"><input type="submit" name="back" value="Back" />&nbsp;</td>
							<td width="201"><input type="reset" name="Clear" value="Clear" />&nbsp;</td>
							<td><input type="submit" name="save" value="Continue" /></td>

						</tr>
					</table></td>
			</tr>
		</table>
	</form:form>
</body>
</html>