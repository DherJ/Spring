/**
 * script js pour home.jsp
 */

function ajaxInit() {
	$('#btnLogin').off();
	$('#btnLogin').on("click", ajaxAfficherFormLogin);
}

function ajaxAfficherFormLogin() {
	$.ajax({
		type :"GET",
		url : "http://localhost:8080/login",
		success : function(result) {
			$('#signBody').html(result);
		}
	})
}