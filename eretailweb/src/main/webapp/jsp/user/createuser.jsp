<html>
<head>
<title> User Dashboard</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">
<a href="/eretailweb/getallusers.do">getall</a>
<a href="/eretailweb/loginuser.do">Get Login Details</a>
	<div align="center">
		<h2>Create User</h2>
		<!--Body: Delete Category information-->
		<form method="post"
			action="/eretailweb/userregister.do">
			
			<table cellpadding="0" cellspacing="0" width="50%"">
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User ID</td>
					<td><input type="text" name="userId" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User pwd</td>
					<td><input type="text" name="pwd" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User firstName</td>
					<td><input type="text" name="firstName" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User lastName</td>
					<td><input type="text" name="lastName" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User middleName</td>
					<td><input type="text" name="middleName" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User emailAddress</td>
					<td><input type="text" name="emailAddress" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User homePhone</td>
					<td><input type="text" name="homePhone" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User mobilePhone</td>
					<td><input type="text" name="mobilePhone" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User workPhone</td>
					<td><input type="text" name="workPhone" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User Fax</td>
					<td><input type="text" name="fax" maxlength="10" value="" /></td>
				</tr>
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User Status</td>
					<td><input type="text" name="status" maxlength="10" value="" /></td>
				</tr>
				
				<!-- <tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User CreateDate</td>
					<td><input type="text" name="createDate" maxlength="10" value="" /></td>
				</tr> -->
				
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User ModifiedBy</td>
					<td><input type="text" name="modifiedBy" maxlength="10" value="" /></td>
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
