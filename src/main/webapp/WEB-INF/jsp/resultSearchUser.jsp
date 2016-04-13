<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Result Search</title>
	</head>
	
	<body>
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
					<c:when test="${empty user}">
						<!-- if personData is empty, show "No data" -->
						<tr><td colspan="4" align="center">No Data</td></tr>
					</c:when>
					<c:otherwise>
							<tr>
								<td> ${user.id} </td>
								<td> ${user.name} </td>
								<td> ${user.firstName} </td>
								<td> ${user.email} </td>
								<td> ${user.age} </td>
							</tr>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</body>
</html>