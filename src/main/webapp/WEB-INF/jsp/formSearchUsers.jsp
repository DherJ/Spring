<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>${title}</title>
		<link href="/resources/css/table.css" rel="stylesheet" type="text/css"/>
		<link href="/resources/css/searchUsersForm.css" rel="stylesheet" type="text/css"/>
		<style>
			.error {
			    color: #ff0000;
			    font-style: italic;
			    font-weight: bold;
			}
		</style>
	</head>
	
	<body>
			<div id="cadre1">
				<div class="container">
				    <h1 class="title">Search User</h1>
				    <form:form id="form" class="form" action="/resultSearchUsers" method="post" modelAttribute="user">
				        <ul>
				            <li>
				                <form:label path="name">Name:</form:label>
				                <form:input type="text" placeholder="Your Name" id="name" path="name" tabindex="1"/>
				            </li>
				            <li>
				                <form:label path="firstName">Your Name:</form:label>
				                <form:input type="text" placeholder="FirstName" id="name" path="firstName" tabindex="1"/>
				            </li>
				            <li>
				                <form:label path="email">Email:</form:label>
				                <form:input type="email" placeholder="Email" id="email" path="email" tabindex="2"/>
				            </li>
				            <li>
				                <form:label path="age">Age:</form:label>
				                <form:input placeholder="Age" id="age" path="age" tabindex="1"/>
				            </li>
				        </ul>
				        <input type="submit" value="search" id="submit"/>
				    </form:form>
				</div>
			</div>
			<div id="cadre2">
				<!-- Results -->
				<c:choose>
					<c:when test="${empty users}"></c:when>
						<c:otherwise>
							<table>
							 	<caption class="title-result">Users found</caption>
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
									<c:forEach var="user" items="${users}">
										<tr>
											<td> ${user.id} </td>
											<td> ${user.name} </td>
											<td> ${user.firstName} </td>
											<td> ${user.email} </td>
											<td> ${user.age} </td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</c:otherwise>
				</c:choose>
			</div>
	</body>
</html>