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
					<th>Id</th>
                    <th>Name</th>
                    <th>FirstName</th>
                    <th>Email</th>
                    <th>Age</th>
                </tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty users}">
						<!-- if personData is empty, show "No data" -->
						<tr><td colspan="4" align="center">No Data</td></tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="user" items="${users}">
							<tr>
								<td> ${user.id} </td>
								<td> ${user.name} </td>
								<td> ${user.firstName} </td>
								<td> ${user.email} </td>
								<td> ${user.age} </td>
								<td>
									<a href="${pageContext.request.contextPath}/updateUser?id=${user.id}">Edit</a>
									&nbsp;|&nbsp;
									<a href="${pageContext.request.contextPath}/deleteUser/${user.id}">Delete</a>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				<tr> <td colspan="4" align="center">
					<!-- "pageContext.request.contextPath" returns path of current application (use this for relative links) -->
					<a href="${pageContext.request.contextPath}/form">Add new User</a>
				</td> </tr>
			</tbody>
		</table>
		<a href="http://localhost:8080/"> Home </a>
	</body>
</html>