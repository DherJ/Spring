<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%-- 		<link href="/resources/css/form.css" rel="stylesheet" type="text/css"/>
	
		<form:form method="post" action="${pageContext.request.contextPath}/users/${linkSubmit}" modelAttribute="User">
			<h2>User form</h2>
			<table class="center">
				<tr>
					<td> <form:hidden path="id" /> </td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input id="name" type="text" path="name" placeholder="insert name..." /></td>
					<td><form:errors path="name" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="firstName">FirstName</form:label></td>
					<td><form:input id="firstName" type="text" path="firstName" placeholder="insert firstName..." /></td>
					<td><form:errors path="firstName" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input id="email" type="text" path="email" placeholder="insert email..." /></td>
					<td><form:errors path="email" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input id="age" type="text" path="age" placeholder="insert nage..." /></td>
					<td><form:errors path="age" cssClass="error"/></td>
				</tr>
			</table>
			<button type="reset" value="Reset">Reset</button>
			<button type="submit" value="${linkSubmit}">Submit</button>
		</form:form> --%>
		
		<div class="portlet box green">
                                            <div class="portlet-title">
                                                <div class="caption">
                                                    <i class="fa fa-gift"></i>User Form </div>
                                                <div class="tools">
                                                    <a title="" data-original-title="" href="javascript:;" class="collapse"> </a>
                                                    <a title="" data-original-title="" href="#portlet-config" data-toggle="modal" class="config"> </a>
                                                    <a title="" data-original-title="" href="javascript:;" class="reload"> </a>
                                                    <a title="" data-original-title="" href="javascript:;" class="remove"> </a>
                                                </div>
                                            </div>
                                            <div class="portlet-body form">
                                                <!-- BEGIN FORM-->
                                                <form:form class="form-horizontal" method="post" id="id-form-user" modelAttribute="user">
                                                    <div class="form-body">
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="name">Name</form:label>
                                                            <div class="col-md-4">
                                                                <form:input class="form-control input-circle" placeholder="Enter your Name" type="text" path="name"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="firstName">First Name</form:label>
                                                            <div class="col-md-4">
                                                                <form:input class="form-control input-circle" id="firstName" placeholder="Enter first name" type="text" path="firstName"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="email">Email Address</form:label>
                                                            <div class="col-md-4">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon input-circle-left">
                                                                        <i class="fa fa-envelope"></i>
                                                                    </span>
                                                                    <form:input id="email" path="email" class="form-control input-circle-right" placeholder="Email Address" type="email"/> </div>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="age">Age</form:label>
                                                            <div class="col-md-4">
                                                                <div class="input-group">
                                                                    <span class="input-group-addon input-circle-left">
                                                                        <i class="fa fa-birthday"></i>
                                                                    </span>
                                                                    <form:input id="age" path="age" class="form-control input-circle-right" placeholder="Enter your age" type="text"/> </div>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="pass">Password</form:label>
                                                            <div class="col-md-4">
                                                                <div class="input-group">
                                                                    <form:input id="pass" path="pass" class="form-control input-circle-left" placeholder="Password" type="password"/>
                                                                    <span class="input-group-addon input-circle-right">
                                                                        <i class="fa fa-user"></i>
                                                                    </span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-actions">
                                                        <div class="row">
                                                            <div class="col-md-offset-3 col-md-9">
                                                                <button id="btnAddUser" type="submit" class="btn btn-circle green" >Submit</button>
                                                                <button type="button" class="btn btn-circle grey-salsa btn-outline">Cancel</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form:form>
                                                <!-- END FORM-->
                                            </div>
                                        </div>
                                        <script>ajaxInitFormUser();</script>
=======
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
		<form:form method="post" action="${pageContext.request.contextPath}/${linkSubmit}" modelAttribute="user">
			<h2>User informations</h2>
			<table align="center">
				<tr>
					<td> <form:hidden path="id" /> </td>
				</tr>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input id="name" type="text" path="name" placeholder="insert name..." /></td>
					<td><form:errors path="name" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="firstName">FirstName</form:label></td>
					<td><form:input id="firstName" type="text" path="firstName" placeholder="insert firstName..." /></td>
					<td><form:errors path="firstName" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input id="email" type="text" path="email" placeholder="insert email..." /></td>
					<td><form:errors path="email" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input id="age" type="text" path="age" placeholder="insert nage..." /></td>
					<td><form:errors path="age" cssClass="error"/></td>
				</tr>
			</table>
			<button type="reset" value="Reset">Reset</button>
			<button type="submit" value="${linkSubmit}">Submit</button>
		</form:form>
	</body>
</html>
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
