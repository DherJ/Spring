<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <title>User Added</title>
	</head>
	<body>
	
		<h2>Submitted User Information</h2>
	    <table>
		    <tr>
		        <td>Name</td>
		        <td>${name}</td>
		    </tr>
		        <tr>
		        <td>FirstName</td>
		        <td>${firstName}</td>
		    </tr>
		    <tr>
		        <td>Email</td>
		        <td>${email}</td>
		    </tr>
		    <tr>
		        <td>Age</td>
		        <td>${age}</td>
		    </tr>
		</table>  
		<a href="http://localhost:8080/"> Home </a>
		<br>
		<a href="http://localhost:8080/users"> List of users </a>
	</body>
</html>