<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saisie User</title>
	</head>
	
	<body>
		<form:form method="POST" action="/resultAdd" commandName="User">
			<table align="center">
				<tr>
					<td><form:label path="id">id</form:label></td>
					<td><form:input path="id"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="firstName">FirstName</form:label></td>
					<td><form:input path="firstName"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email"></form:input></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age"></form:input></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Submit"/></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>