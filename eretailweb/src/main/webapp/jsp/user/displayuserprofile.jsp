<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display User Profile</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Middle Name</td>
		</tr>

		<tr valign="top">
			<td><c:out value="${user.firstName}"/></td>
			<td><c:out value="${user.lastName}"/></td>
			<td><c:out value="${user.middleName}"/></td>
		</tr>
	</table>

</body>
</html>