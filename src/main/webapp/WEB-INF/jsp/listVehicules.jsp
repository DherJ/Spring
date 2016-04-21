<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">
                        <div class="col-md-12">
                            <!-- BEGIN EXAMPLE TABLE PORTLET-->
                            <div class="portlet light portlet-fit bordered">
                                <div class="portlet-title">
                                    <div class="caption">
                                        <i class="icon-settings font-red"></i>
                                        <span class="caption-subject font-red sbold uppercase">Editable Vehicules Table</span>
                                    </div>
                                </div>
                                <div class="portlet-body">
                                    <div class="table-toolbar">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <!-- <div class="btn-group">
                                                    <button id="sample_editable_1_new" class="btn green"> Add New User
                                                        <i class="fa fa-plus"></i>
                                                    </button>
                                                </div> -->
                                            </div>
                                        </div>
                                    </div>
                                    <div class="dataTables_wrapper no-footer" id="sample_editable_1_wrapper">
                                    <div class="row">
	                                    <div class="col-md-6 col-sm-6">
		                                    <div class="btn-group">
		                                            <button id="btnAddLigne" class="btn green"> Add New Vehicule
		                                                  <i class="fa fa-plus"></i>
		                                            </button>
		                                    </div>
	                                    </div>
	                                    <div class="col-md-6 col-sm-6">
	                                    	<div class="dataTables_filter" id="sample_editable_1_filter"><label>Search:<input aria-controls="sample_editable_1" placeholder="" class="form-control input-sm input-small input-inline" type="search"></label></div>
	                                    </div>
                                    </div>
                                    <div class="table-scrollable">
	                                    <table aria-describedby="sample_editable_1_info" role="grid" class="table table-striped table-hover table-bordered dataTable no-footer" id="tableau">
	                                        <thead>
	                                            <tr role="row">
													<th aria-sort="ascending" aria-label="
															 Id
														: activate to sort column ascending" style="width: 288px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting_asc">
															 Id
														</th>
													<th aria-sort="ascending" aria-label="
															 Type
														: activate to sort column ascending" style="width: 288px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting_asc">
															 Type
													</th>
													<th aria-label="
															 Constructor
														: activate to sort column ascending" style="width: 353px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting">
															 Constructor
													</th>
													<th aria-label="
															 Name
														: activate to sort column ascending" style="width: 201px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting">
															 Name
													</th>
													<th aria-label="
															 Edit
														: activate to sort column ascending" style="width: 147px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting">
															 Edit
													</th>
													<th aria-label="
															 Delete
														: activate to sort column ascending" style="width: 206px;" colspan="1" rowspan="1" aria-controls="sample_editable_1" tabindex="0" class="sorting">
															 Delete
													</th>
												</tr>
									 		</thead>
	                                    	<tbody>
		                                        <c:forEach var="vehicule" items="${vehicules}">
														<tr class="odd" role="row" id="ligne${vehicule.id}">
															<td class="sorting_1"> ${vehicule.id} </td>
															<td> ${vehicule.type} </td>
															<td> ${vehicule.constructor} </td>
															<td> ${vehicule.name} </td>
															<td class="editVehicule" data-id="${vehicule.id}">
															<a href="javascript:;" class="btn btn-outline btn-circle btn-sm purple">
		                                                            <i class="fa fa-edit"></i> Edit </a>
															</td>
															<td class="deleteVehicule" data-id="${vehicule.id}">
																<a href="javascript:;" class="btn btn-outline btn-circle btn-sm blue">
		                                                            <i class="fa fa-trash-o" id="btnDeleteVehicule"></i> Delete </a>
															</td>
														</tr>
												</c:forEach>
											</tbody>
	                                    </table>
                                    </div>
                                    <div class="row">
	                                    <div class="col-md-5 col-sm-5">
	                                    	<div aria-live="polite" role="status" id="sample_editable_1_info" class="dataTables_info">Showing 1 to 5 of 8 entries</div>
	                                    </div>
	                                    <div class="col-md-7 col-sm-7">
		                                    <div id="sample_editable_1_paginate" class="dataTables_paginate paging_bootstrap_number">
			                                    <ul style="visibility: visible;" class="pagination">
				                                    <li class="prev disabled"> <a href="#" title="Prev"> <i class="fa fa-angle-left"> </i> </a> </li>
				                                    <li class="active"><a href="#">1</a></li>
				                                    <li><a href="#">2</a></li>
				                                    <li class="next"><a href="#" title="Next"><i class="fa fa-angle-right"></i></a></li>
			                                    </ul>
		                                    </div>
	                                    </div>
                                    </div>
                                    </div>
                                </div>
                            </div>
                            <!-- END EXAMPLE TABLE PORTLET-->
                        </div>
</div>
<script>ajaxInitEditDelete();</script>
=======
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>List of vehicules</title>
		<link href="/resources/css/table.css" rel="stylesheet" type="text/css"/>
		<link href="/resources/css/home.css" rel="stylesheet" type="text/css"/>
	</head>
	
	<body>
		<h2>List of vehicules</h2>
		<table class="center">
			<thead>
				<tr>
					<th>Id</th>
                    <th>Type</th>
                    <th>Constructor</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty vehicules}">
						<!-- if personData is empty, show "No data" -->
						<tr><td colspan="6" align="center">No Vehicules registered in the database</td></tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="vehicule" items="${vehicules}">
							<tr>
								<td> ${vehicule.id} </td>
								<td> ${vehicule.type} </td>
								<td> ${vehicule.constructor} </td>
								<td> ${vehicule.name} </td>
								<td>
									<a href="${pageContext.request.contextPath}/updateVehicule?id=${user.id}">Edit</a>
									&nbsp;|&nbsp;
									<a href="${pageContext.request.contextPath}/deleteVehicule/${user.id}">Delete</a>
									&nbsp;|&nbsp;
									<a href="${pageContext.request.contextPath}/location/${user.id}">Loue par?</a>
								</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
				<tr> <td colspan="6" align="center">
					<!-- "pageContext.request.contextPath" returns path of current application (use this for relative links) -->
					<a href="${pageContext.request.contextPath}/formVehicule">Add new Vehicule</a>
				</td> </tr>
			</tbody>
		</table>
		<br/>
		<br/>
		<br/>
		<br/>
		<div style="text-align:center"><a href="http://localhost:8080/"> Home </a></div>
	</body>
</html>
>>>>>>> 50fb9fab214182f04fabbeb51ed94f34c9625d53
