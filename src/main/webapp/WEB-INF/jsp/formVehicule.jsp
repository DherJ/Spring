<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%-- 		<link href="/resources/css/form.css" rel="stylesheet" type="text/css"/>

		<form:form method="post" action="${pageContext.request.contextPath}/vehicules/${linkSubmit}" modelAttribute="vehicule">
			<h2>Vehicule form</h2>
			<table class="center">
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
		</form:form> --%>
		
		<div class="portlet box green">
                                            <div class="portlet-title">
                                                <div class="caption">
                                                    <i class="fa fa-gift"></i>Vehicule Form </div>
                                                <div class="tools">
                                                    <a title="" data-original-title="" href="javascript:;" class="collapse"> </a>
                                                    <a title="" data-original-title="" href="#portlet-config" data-toggle="modal" class="config"> </a>
                                                    <a title="" data-original-title="" href="javascript:;" class="reload"> </a>
                                                    <a title="" data-original-title="" href="javascript:;" class="remove"> </a>
                                                </div>
                                            </div>
                                            <div class="portlet-body form">
                                                <!-- BEGIN FORM-->
                                                <form:form class="form-horizontal" name="form" method="post" id="id-form-vehicule" modelAttribute="vehicule">
                                                    <div class="form-body">
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="type">Type</form:label>
                                                            <div class="col-md-4">
                                                                <form:input class="form-control input-circle" placeholder="Enter the type" type="text" path="type"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="constructor">Constructor</form:label>
                                                            <div class="col-md-4">
                                                                <form:input class="form-control input-circle" id="constructor" placeholder="Enter the constructor" type="text" path="constructor"/>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <form:label class="col-md-3 control-label" path="name">Name</form:label>
                                                            <div class="col-md-4">
                                                                <form:input class="form-control input-circle" placeholder="Enter the name of the car" type="text" path="name"/>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-actions">
                                                        <div class="row">
                                                            <div class="col-md-offset-3 col-md-9">
                                                                <button id="btnAddVehicule" type="submit" class="btn btn-circle green">Submit</button>
                                                                <button type="button" class="btn btn-circle grey-salsa btn-outline">Cancel</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form:form>
                                                <!-- END FORM-->
                                            </div>
                                        </div>
                                        <script>ajaxInitFormVehicule();</script>