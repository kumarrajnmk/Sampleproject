<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>User Dashboard</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

	<div align="center">
		<h2>Display All User</h2>
		<table border="1" cellpadding="0" cellspacing="0" width="50%">
			<tr>
				<th>User Id</th>
				<th>User Name</th>
				<th>User Description</th>
			</tr>
			<c:forEach var="user" items="${list}">
			
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">${user.userId}</td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">${user.firstName}</td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">${user.lastName}</td>
			</tr>
			</c:forEach>
			
		</table>
	</div>
</body>

</html>
