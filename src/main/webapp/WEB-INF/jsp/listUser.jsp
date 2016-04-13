<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of users</title>
		<link href="/resources/css/table.css" rel="stylesheet" type="text/css"/>
	</head>
	
	<body>
	<h2>List of users</h2>
		<table class="center">
			<thead>
				<tr>
					<th>Id</th>
                    <th>Name</th>
                    <th>FirstName</th>
                    <th>Email</th>
                    <th>Age</th>
                    <th>Action</th>
                </tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty users}">
						<!-- if personData is empty, show "No data" -->
						<tr><td colspan="6" align="center">No Data in the database</td></tr>
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
				<tr> <td colspan="6" align="center">
					<!-- "pageContext.request.contextPath" returns path of current application (use this for relative links) -->
					<a href="${pageContext.request.contextPath}/form">Add new User</a>
				</td> </tr>
			</tbody>
		</table>
		<br/>
		<br/>
		<br/>
		<br/>
		<div style="text-align:center"><a href="http://localhost:8080/"> Home </a></div>
	</body>
</html>