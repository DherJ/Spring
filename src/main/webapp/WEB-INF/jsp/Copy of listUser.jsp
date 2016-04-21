<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2>List of users</h2>

	<div class="portlet box green">
		<div class="portlet-title">
			<div class="caption">
				<i class="fa fa-comments"></i>Striped Table
			</div>
			<div class="tools">
				<a title="" data-original-title="" href="javascript:;"
					class="collapse"> </a> <a title="" data-original-title=""
					href="#portlet-config" data-toggle="modal" class="config"> </a> <a
					title="" data-original-title="" href="javascript:;" class="reload">
				</a> <a title="" data-original-title="" href="javascript:;"
					class="remove"> </a>
			</div>
		</div>
		<div class="portlet-body">
			<div class="table-scrollable">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>FirstName</th>
							<th>Email</th>
							<th>Age</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${empty users}">
								<!-- if personData is empty, show "No data" -->
								<tr>
									<td colspan="6" align="center">No Users registered in the
										database</td>
								</tr>
							</c:when>
							<c:otherwise>
								<c:forEach var="user" items="${users}">
									<tr>
										<td>${user.id}</td>
										<td>${user.name}</td>
										<td>${user.firstName}</td>
										<td>${user.email}</td>
										<td>${user.age}</td>
										<td><a
											href="${pageContext.request.contextPath}/updateUser?id=${user.id}">Edit</a>
											&nbsp;|&nbsp; <a
											href="${pageContext.request.contextPath}/deleteUser/${user.id}">Delete</a>
											&nbsp;|&nbsp; <a
											href="${pageContext.request.contextPath}/location/${user.id}">Vehicule
												loué</a></td>
									</tr>
								</c:forEach>
							</c:otherwise>
						</c:choose>
						<tr>
							<td colspan="6" align="center">
								<!-- "pageContext.request.contextPath" returns path of current application (use this for relative links) -->
								<a href="${pageContext.request.contextPath}/form">Add new
									User</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
<br />
<br />
<div style="text-align: center">
	<a href="http://localhost:8080/"> Home </a>
</div>