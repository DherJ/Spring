<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of users</title>
	</head>
	
	<body>
	<h1>Users</h1>
		<table border="2" align="center">
			<thead>
				<tr>
                    <th>Name</th>
                    <th>FirstName</th>
                    <th>Email</th>
                    <th>Age</th>
                </tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td> ${user.name} </td>
						<td> ${user.firstName} </td>
						<td> ${user.email} </td>
						<td> ${user.age} </td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="http://localhost:8080/"> Home </a>
	</body>
</html>