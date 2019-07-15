<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delivery method</title>
</head>
<body>
	<form method="post" action="/eretail/processdeliveryinfo">
		<table cellpadding="0" cellspacing="1" width="40%">
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Choose Delivery Method</td>
				<td>
				 
					<input type="radio" name="deliverymethod" value="pickup">Pick Up<br>
  					<input type="radio" name="deliverymethod" value="mail">Mail<br>
  				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="1">Select State</td>
				<td>
					<select name="state">
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
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="1">Select City</td>
				<td>
					<select name="city">
						<option value="fremont">Fremont</option>
						<option value="unioncity">Union City</option>
					</select>
				</td>
			</tr>	
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="1">Select Store</td>
				<td>
					<select name="city">
						<option value="FMT">Fremont Main Store</option>
						<option value="Inv">Irington Store</option>
					</select>
				</td>
			</tr>			

			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;" colspan="2"><b>Mailing Address</b></td>
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
	</form>
</body>
</html>