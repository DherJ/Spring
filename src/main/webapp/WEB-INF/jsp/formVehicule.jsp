<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Saisie User</title>
		<link href="/resources/css/form.css" rel="stylesheet" type="text/css"/>
		<style>
			.error {
			    color: #ff0000;
			    font-style: italic;
			    font-weight: bold;
			}
		</style>
	</head>
	
	<body>
		<form:form method="post" action="${pageContext.request.contextPath}/${linkSubmit}" modelAttribute="vehicule">
			<h2>Vehicule informations</h2>
			<table align="center">
				<tr>
					<td> <form:hidden path="id" /> </td>
				</tr>
				<tr>
					<td><form:label path="type">Type</form:label></td>
					<td><form:input id="type" type="text" path="type" placeholder="insert type..." /></td>
					<td><form:errors path="type" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="constructor">Constructor</form:label></td>
					<td><form:input id="constructor" type="text" path="constructor" placeholder="insert constructor..." /></td>
					<td><form:errors path="constructor" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input id="name" type="text" path="name" placeholder="insert name..." /></td>
					<td><form:errors path="name" cssClass="error"/></td>
				</tr>
			</table>
			<button type="reset" value="Reset">Reset</button>
			<button type="submit" value="${linkSubmit}">Submit</button>
		</form:form>
	</body>
</html>