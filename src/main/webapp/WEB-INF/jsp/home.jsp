<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Home</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<link rel="shortcut icon" href="resources/global/img/favicon/voiture.ico"/>
		<style>
		
				body.security-app {
				    text-align: center;
				    overflow: hidden;
				    height: 100%;
				    width:100%;
				    background:#edecec;
				}
				
				.lc-block {
				    padding: 35px 55px 35px;
				    background: #fff;
				    box-shadow: 0 1px 11px rgba(0, 0, 0, 0.27);
				    border-radius: 2px;
				    width: 30%;
				    display: inline-block;
				    position: relative;
				    animation-name: fadeInUp;
				    animation-duration: 300ms;
				    animation-fill-mode: both;
				    z-index: 10;
				    margin-top:5%;
				    vertical-align:middle;
				}
				
				body.security-app:before {
				    height: 50%;
				    width: 100%;
				    position: absolute;
				    top: 0;
				    left: 0;
				    background: gray;
				    content: "";
				    z-index: 0;
				}
				
				body.security-app:after {
				    content: "";
				    vertical-align: middle;
				    display: inline-block;
				    width: 1px;
				    height: 100%;
				}
				
				h2 {
				    color: white;
				}
				
				h1{
					color:crimson;
				}
				
				.container {
				  width: 550px;
				  margin: 70px auto;
				  text-align: center;
				}
				
				.container > .button {
				  margin: 0 10px;
				}
				
				.button {
				  display: inline-block;
				  vertical-align: top;
				  position: relative;
				  overflow: hidden;
				  min-width: 96px;
				  line-height: 46px;
				  padding: 0 24px;
				  font-size: 14px;
				  color: blue;
				  text-align: center;
				  text-decoration: none;
				  text-shadow: 0 1px #154c86;
				  background-color: #247edd;
				  background-clip: padding-box;
				  border: 1px solid;
				  border-color: #1c65b2 #18589c #18589c;
				  border-radius: 4px;
				  -webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.4), 0 1px 2px rgba(0, 0, 0, 0.2);
				  box-shadow: inset 0 1px rgba(255, 255, 255, 0.4), 0 1px 2px rgba(0, 0, 0, 0.2);
				  background-image: -webkit-linear-gradient(top, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0) 50%, rgba(0, 0, 0, 0.12) 51%, rgba(0, 0, 0, 0.04));
				  background-image: -moz-linear-gradient(top, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0) 50%, rgba(0, 0, 0, 0.12) 51%, rgba(0, 0, 0, 0.04));
				  background-image: -o-linear-gradient(top, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0) 50%, rgba(0, 0, 0, 0.12) 51%, rgba(0, 0, 0, 0.04));
				  background-image: linear-gradient(to bottom, rgba(255, 255, 255, 0.3), rgba(255, 255, 255, 0) 50%, rgba(0, 0, 0, 0.12) 51%, rgba(0, 0, 0, 0.04));
				}
				
				.button:before {
				  content: '';
				  position: absolute;
				  top: -25%;
				  bottom: -25%;
				  left: -20%;
				  right: -20%;
				  border-radius: 50%;
				  background: transparent;
				  -webkit-box-shadow: inset 0 0 38px rgba(255, 255, 255, 0.5);
				  box-shadow: inset 0 0 38px rgba(255, 255, 255, 0.5);
				}
				
				.button:hover {
				  background-color: #1a74d3;
				}
				
				.button:active {
				  color: rgba(255, 255, 255, 0.9);
				  text-shadow: 0 -1px #154c86;
				  background: #1f71c8;
				  border-color: #113f70 #154c86 #1c65b2;
				  -webkit-box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.2), 0 1px rgba(255, 255, 255, 0.4);
				  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.2), 0 1px rgba(255, 255, 255, 0.4);
				  background-image: -webkit-linear-gradient(top, #1a5da5, #3a8be0);
				  background-image: -moz-linear-gradient(top, #1a5da5, #3a8be0);
				  background-image: -o-linear-gradient(top, #1a5da5, #3a8be0);
				  background-image: linear-gradient(to bottom, #1a5da5, #3a8be0);
				}
				
				.button:active:before {
				  top: -50%;
				  bottom: -125%;
				  left: -15%;
				  right: -15%;
				  -webkit-box-shadow: inset 0 0 96px rgba(0, 0, 0, 0.2);
				  box-shadow: inset 0 0 96px rgba(0, 0, 0, 0.2);
				}
				
				.button-green {
				  text-shadow: 0 1px #0d4d09;
				  background-color: #1ca913;
				  border-color: #147b0e #11640b #11640b;
				}
				
				.button-green:hover {
				  background-color: #159b0d;
				}
				
				.button-green:active {
				  text-shadow: 0 -1px #0d4d09;
				  background: #189210;
				  border-color: #093606 #0d4d09 #147b0e;
				  background-image: -webkit-linear-gradient(top, #126d0c, #20c016);
				  background-image: -moz-linear-gradient(top, #126d0c, #20c016);
				  background-image: -o-linear-gradient(top, #126d0c, #20c016);
				  background-image: linear-gradient(to bottom, #126d0c, #20c016);
				}
				
				.button-red {
				  text-shadow: 0 1px #72100d;
				  background-color: #cd1d18;
				  border-color: #9f1713 #891310 #891310;
				}
				
				.button-red:hover {
				  background-color: #c01511;
				}
				
				.button-red:active {
				  text-shadow: 0 -1px #72100d;
				  background: #b61a15;
				  border-color: #5b0d0b #72100d #9f1713;
				  background-image: -webkit-linear-gradient(top, #921511, #e4201b);
				  background-image: -moz-linear-gradient(top, #921511, #e4201b);
				  background-image: -o-linear-gradient(top, #921511, #e4201b);
				  background-image: linear-gradient(to bottom, #921511, #e4201b);
				}
		</style>
	</head>
	<body class="security-app">
		<div class="lc-block">
			<h1>Web App Spring</h1>
			<div class="container">
			    <a href="javascript:;" class="button" id="btnLogin">Login</a>
  			</div>
  			
  			<!-- form sign  -->
  			<div id="signBody">
  				
  			</div>
		</div>
		<script src="resources/global/scripts/homeScript.js" type="text/javascript"></script>
		<script>
			ajaxInit();
		</script>
	</body>
</html>