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
	<form:form method="POST" action="/eretail/processregisteruser" modelAttribute="userVO">
		<table cellpadding="0" cellspacing="1" width="40%">
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="userId">User Id</form:label></td>
				<td><form:input path="userId" maxlength="50"/></td>
			</tr>
		
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="pwd">Password</form:label></td>
				<td><form:input path="pwd" maxlength="50"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="firstName">firstName</form:label></td>
				<td><form:input path="firstName" maxlength="50"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="lastName">lastName</form:label></td>
				<td><form:input path="lastName" maxlength="50"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="middleName">middleName</form:label></td>
				<td><form:input path="middleName" maxlength="50"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="emailAddress">emailAddress</form:label></td>
				<td><form:input path="emailAddress" maxlength="60"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="homePhone">homePhone</form:label></td>
				<td><form:input path="homePhone" maxlength="10"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="pwd">workPhone</form:label></td>
				<td><form:input path="workPhone" maxlength="10"/></td>
			</tr>
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="mobilePhone">mobilePhone</form:label></td>
				<td><form:input path="mobilePhone" maxlength="10"/></td>
			</tr>

			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><form:label path="fax">fax</form:label></td>
				<td><form:input path="fax" maxlength="10"/></td>
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