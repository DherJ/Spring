<<<<<<< HEAD
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="shortcut icon" href="resources/global/img/favicon/voiture.ico"/>
        <style>
			* {
			box-sizing: border-box;
			}
			
			*:focus {
				outline: none;
			}
			body {
			font-family: Arial;
			background-color: #3498DB;
			padding: 50px;
			}
			.login {
			margin: 20px auto;
			width: 300px;
			}
			.login-screen {
			background-color: #FFF;
			padding: 20px;
			border-radius: 5px
			}
			
			.app-title {
			text-align: center;
			color: #777;
			}
			
			.login-form {
			text-align: center;
			}
			.control-group {
			margin-bottom: 10px;
			}
			
			input {
			text-align: center;
			background-color: #ECF0F1;
			border: 2px solid transparent;
			border-radius: 3px;
			font-size: 16px;
			font-weight: 200;
			padding: 10px 0;
			width: 250px;
			transition: border .5s;
			}
			
			input:focus {
			border: 2px solid #3498DB;
			box-shadow: none;
			}
			
			.btn {
			  border: 2px solid transparent;
			  background: #3498DB;
			  color: #ffffff;
			  font-size: 16px;
			  line-height: 25px;
			  padding: 10px 0;
			  text-decoration: none;
			  text-shadow: none;
			  border-radius: 3px;
			  box-shadow: none;
			  transition: 0.25s;
			  display: block;
			  width: 250px;
			  margin: 0 auto;
			}
			
			.btn:hover {
			  background-color: #2980B9;
			}
			
			.login-link {
			  font-size: 12px;
			  color: #444;
			  display: block;
				margin-top: 12px;
			}
        </style>
    </head>

    <body>
		<div class="login">
			<div class="login-screen">
				<div class="app-title">
					<h1>Login</h1>
				</div>
	
				<div class="login-form">
				<form action="login" method="post">
							<div class="control-group">
								<input type="text" class="login-field"  value="" path="name" placeholder="name" id="name" for="name" id="username" name="username"/>
								<label class="login-field-icon fui-user" path="name"/>
							</div>
				
							<div class="control-group">
								<input type="password" class="login-field" path="pass" value="" placeholder="password" id="password" name="password"/>
								<label class="login-field-icon fui-lock" path="pass" for="password"/>
							</div>
							<input type="submit" class="btn btn-primary btn-large btn-block"></input>
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						</form>
				</div>
			</div>
		</div>
=======
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
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
	</body>
</html>