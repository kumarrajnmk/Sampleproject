	<%@include file="header.html"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
<title>Useraddress Dashboard</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<div align="center">
		<h2>Create Useraddress</h2>
		<!--Body: Delete Category information-->
		<form method="post"
			action="/eretailweb-test-client/createUserAddress.do">
			<table cellpadding="0" cellspacing="0" width="50%"">
				<tr>
				    <td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress Name</td>
					<td><input type="text" name="name" maxlength="10" value="" /></td>
				</tr>
				<!-- <tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress Description</td>
					<td><input type="text" name="descr" maxlength="10" value="" /></td>
				</tr> -->
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress streetAddress1</td>
					<td><input type="text" name="streetAddress1" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress streetAddress2</td>
					<td><input type="text" name="streetAddress2" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress city</td>
					<td><input type="text" name="city" maxlength="10" value="" /></td>
				</tr>
						 <tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress state</td>
					<td><input type="text" name="state" maxlength="10" value="" /></td>
				</tr> 
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress zipCode</td>
					<td><input type="text" name="zipCode" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress country</td>
					<td><input type="text" name="country" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress createdby</td>
					<td><input type="text" name="country" maxlength="10" value="" /></td>
				</tr>
				
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress modifiedBy</td>
					<td><input type="text" name="modifiedBy" maxlength="10" value="" /></td>
				</tr> 
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">Useraddress userUid</td>
					<td><input type="text" name="userUid" maxlength="10" value="" /></td>
				</tr>
		
				
				
				<tr>
					<td colspan="2" align="right"><br>
						<table width="50%">
							<tr>
								<td><input type="submit" name="create" value="Create" /></td>
								<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
							</tr>
						</table></td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>

