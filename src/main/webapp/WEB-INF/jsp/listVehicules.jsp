<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of vehicules</title>
		<link href="/resources/css/table.css" rel="stylesheet" type="text/css"/>
		<link href="/resources/css/home.css" rel="stylesheet" type="text/css"/>
	</head>
	
	<body>
		<h2>List of vehicules</h2>
		<table class="center">
			<thead>
				<tr>
					<th>Id</th>
                    <th>Type</th>
                    <th>Constructor</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty vehicules}">
						<!-- if personData is empty, show "No data" -->
						<tr><td colspan="6" align="center">No Vehicules registered in the database</td></tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="vehicule" items="${vehicules}">
							<tr>
								<td> ${vehicule.id} </td>
								<td> ${vehicule.type} </td>
								<td> ${vehicule.constructor} </td>
								<td> ${vehicule.name} </td>
								<td>
									<a href="${pageContext.request.contextPath}/updateVehicule?id=${user.id}">Edit</a>
									&nbsp;|&nbsp;
									<a href="${pageContext.request.contextPath}/deleteVehicule/${user.id}">Delete</a>
									&nbsp;|&nbsp;
									<a href="${pageContext.request.contextPath}/location/${user.id}">Loue par?</a>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				<tr> <td colspan="6" align="center">
					<!-- "pageContext.request.contextPath" returns path of current application (use this for relative links) -->
					<a href="${pageContext.request.contextPath}/formVehicule">Add new Vehicule</a>
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