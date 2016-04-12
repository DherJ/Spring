<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saisie User</title>
		<link href="/resources/css/form.css" rel="stylesheet" type="text/css"/>
	</head>
	
	<body>
		<form:form method="post" action="${pageContext.request.contextPath}/${linkSubmit}" modelAttribute="User">
			<h2>User informations</h2>
			<table align="center">
				<tr>
					<td> <form:hidden path="id" /> </td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input id="name" type="text" path="name" placeholder="insert name..." /></td>
				</tr>
				<tr>
					<td><form:label path="firstName">FirstName</form:label></td>
					<td><form:input id="firstName" type="text" path="firstName" placeholder="insert firstName..." /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input id="email" type="text" path="email" placeholder="insert email..." /></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input id="age" type="text" path="age" placeholder="insert nage..." /></td>
				</tr>
			</table>
			<button type="reset" value="Reset">Reset</button>
			<button type="submit" value="${linkSubmit}">Submit</button>
		</form:form>
	</body>
</html>