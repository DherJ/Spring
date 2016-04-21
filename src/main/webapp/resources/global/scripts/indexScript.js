/**
 * script js pour index.jsp
 */

function ajaxInit() {
	// Afficher listes
	$('#btnListUsersStatique').off();
	$('#btnListUsersStatique').on("click", ajaxAfficherUsers);
	$('#btnListUsersDynamique').off();
	$('#btnListUsersDynamique').on("click", ajaxAfficherUsers);
	$('#btnListVehiculesStatique').off();
	$('#btnListVehiculesStatique').on("click", ajaxAfficherVehicules);
	$('#btnListVehiculesDynamique').off();
	$('#btnListVehiculesDynamique').on("click", ajaxAfficherVehicules);
	
	// Afficher form User
	$('#btnFormAddUser').off();
	$('#btnFormAddUser').on("click", ajaxAfficherFormUser);
	// Afficher form Vehicule
	$('#btnFormAddVehicule').off();
	$('#btnFormAddVehicule').on("click", ajaxAfficherFormVehicule);
}

function ajaxInitEditDelete() {
	// Edit
	$('.editUser').off();
	$('.editUser').on("click", ajaxEditFormUser);
	$('.editVehicule').off();
	$('.editVehicule').on("click", ajaxEditFormUser);
	
	// Delete
	$('.deleteUser').off();
	$('.deleteUser').on("click", ajaxDeleteUser);
	$('.deleteVehicule').off();
	$('.deleteVehicule').on("click", ajaxDeleteUser);
}

function ajaxInitFormUser() {
	$('#btnAddUser').off();
	$('#btnAddUser').on("click", ajaxAddUser);
}

function ajaxInitFormVehicule() {
	$('#btnAddVehicule').off();
	$('#btnAddVehicule').on("click", ajaxAddVehicule);
}

function ajaxAfficherUsers() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/users/list",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxAfficherVehicules() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/vehicules/list",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxAfficherFormUser() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/users/form",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxAfficherFormVehicule() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/vehicules/form",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxAddUser() {
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/users/addUser",
		data : $("#id-form-user").serialize(),
		success : function(result) {
			ajaxAfficherUsers();
		}
	});
}

function ajaxAddVehicule() {
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/vehicules/addVehicule",
		data : $("#id-form-vehicule").serialize(),
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxEditFormUser() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/users/updateUser",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxEditFormVehicule() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/vehicules/updateVehicule",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxEditUser() {
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/users/updateUser",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxEditVehicule() {
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/vehicules/updateVehicule",
		success : function(result) {
			$('#body').html(result);
		}
	});
}

function ajaxDeleteUser() {
	var idUser = $(this).data('id');
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/users/deleteUser/" + idUser,
		success : function() {
			var ligne = $('#ligne'+ idUser) 
			$(ligne).fadeOut(500, function() {
				$(ligne).remove();
			});
		}
	});
}

function ajaxDeleteVehicule() {
	var idVehicule = $(this).data('id');
	$.ajax({
		type :"POST",
		url : "http://localhost:8080/vehicules/deleteVehicule/" + idVehicule,
		success : function() {
			var ligne = $('#ligne'+ idVehicule) 
			$(ligne).fadeOut(500, function() { // supprime la ligne d'id : "#ligne+idVehicule" de la table 
				$(ligne).remove();
			});
		}
	});
}