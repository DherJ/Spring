<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
  <head>
    <title tiles:fragment="title">SignIn</title>
    <link href="/resources/css/login.css" rel="stylesheet" type="text/css"/>
  </head>
<body>
		<form:form method="post" action="${pageContext.request.contextPath}/${linkSubmit}" modelAttribute="loginBean">
			<h2>Login</h2>
			<table align="center">
				<tr>
					<td><form:label path="identifiant">Login</form:label></td>
					<td><form:input id="identifiant" type="text" path="identifiant" placeholder="insert login..." /></td>
					<td><form:errors path="identifiant" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="pass">Password</form:label></td>
					<td><form:input id="pass" type="password" path="pass" placeholder="insert password..." /></td>
					<td><form:errors path="pass" cssClass="error"/></td>
				</tr>
			</table>
			<button type="submit" value="${linkSubmit}">Submit</button>
		</form:form>
	</body>
</html>