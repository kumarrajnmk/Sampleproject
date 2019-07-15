<html>
<head>
<title>User Dashboard</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<div align="center">
		<h2>View User</h2>
		<!--Body: Delete Category information-->
		<form method="post" action="/eretailweb/getuser1.do">
			<table cellpadding="0" cellspacing="0" width="50%"">
				<tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User Id</td>
					<td><input type="text" name="userId" maxlength="10" value="" /></td>
				</tr>
				<!-- <tr>
					<td bgcolor="#FAFAF9" style="padding-left: 10px;">User Id</td>
					<td><input type="text" name="pwd" maxlength="10" value="" /></td>
				</tr> -->
				<tr>
					<td colspan="2" align="right"><br>
						<table width="50%">
							<tr>
								<td><input type="submit" name="View" value="View" /></td>
								<td width="201"><input type="reset" name="clear"
									value="Clear" />&nbsp;</td>
							</tr>
						</table></td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>
</body>
