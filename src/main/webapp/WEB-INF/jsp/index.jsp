<html>
	<head>
		<meta charset="utf-8"/>
		<title>Mon application !</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta content="" name="description"/>
		<meta content="" name="author"/>
		<!-- BEGIN GLOBAL MANDATORY STYLES -->
		<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all" rel="stylesheet" type="text/css"/>
		<link href="resources/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
		<link href="resources/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
		<link href="resources/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<link href="resources/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
		<link href="resources/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
		<!-- END GLOBAL MANDATORY STYLES -->
		<!-- BEGIN THEME STYLES -->
		<link href="resources/global/css/components.css" id="style_components" rel="stylesheet" type="text/css"/>
		<link href="resources/global/css/plugins.css" rel="stylesheet" type="text/css"/>
		<link href="resources/admin/css/layout.css" rel="stylesheet" type="text/css"/>
		<link id="style_color" href="resources/admin/css/themes/darkblue.css" rel="stylesheet" type="text/css"/>
		<link href="resources/admin/css/custom.css" rel="stylesheet" type="text/css"/>
		<!-- END THEME STYLES -->
		<link rel="shortcut icon" href="resources/global/img/favicon/voiture.ico"/>
				
		<!-- BEGIN PAGE LEVEL STYLES -->
		<link rel="stylesheet" type="text/css" href="resources/global/plugins/select2/select2.css"/>
		<link rel="stylesheet" type="text/css" href="resources/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css"/>
		<!-- END PAGE LEVEL STYLES -->
		<!-- BEGIN THEME STYLES -->
		
	</head>
	<!-- BEGIN HEADER -->
	<body class="page-header-fixed page-quick-sidebar-over-content "> <!-- icone dans l'onglet du navigateur -->
	<div class="page-header navbar navbar-fixed-top">
	</div>
	<!-- END HEADER -->
		<div class="clearfix">
		</div>
		<!-- BEGIN CONTAINER -->
		<div class="page-container">
			<div class="page-sidebar-wrapper">
                <!-- BEGIN SIDEBAR -->
                <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                <!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                <div class="page-sidebar navbar-collapse collapse">
                    <!-- BEGIN SIDEBAR MENU -->
                    <!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
                    <!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
                    <!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
                    <!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
                    <!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
                    <!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
                    <ul class="page-sidebar-menu  page-header-fixed " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200" style="padding-top: 20px">
                        <!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
                        <li class="sidebar-toggler-wrapper hide">
                            <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                            <div class="sidebar-toggler"> </div>
                            <!-- END SIDEBAR TOGGLER BUTTON -->
                        </li>
                        <!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
                        <li class="sidebar-search-wrapper">
                            <!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
                            <!-- DOC: Apply "sidebar-search-bordered" class the below search form to have bordered search box -->
                            <!-- DOC: Apply "sidebar-search-bordered sidebar-search-solid" class the below search form to have bordered & solid search box -->
                            <form class="sidebar-search  " action="page_general_search_3.html" method="POST">
                                <a href="javascript:;" class="remove">
                                    <i class="icon-close"></i>
                                </a>
                                <div class="input-group">
                                    <input class="form-control" placeholder="Search..." type="text">
                                    <span class="input-group-btn">
                                        <a href="javascript:;" class="btn submit">
                                            <i class="icon-magnifier"></i>
                                        </a>
                                    </span>
                                </div>
                            </form>
                            <!-- END RESPONSIVE QUICK SEARCH FORM -->
                        </li>
                        <li class="heading">
                            <h3 class="uppercase">Database</h3>
                        </li>
                        <li class="nav-item  active">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-briefcase"></i>
                                <span class="title">Tables</span>
                                <span class="selected"></span>
                                <span class="arrow"></span>
                            </a>
                            <ul style="display: none;" class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link nav-toggle" id="btnListUsersDynamique">
                                        <span class="title">Users Table</span>
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link nav-toggle" id="btnListVehiculesDynamique">
                                        <span class="title">Vehicules Table</span>
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <li class="heading">
                            <h3 class="uppercase">Users</h3>
                        </li>
                        <!-- Section Users -->
                        <li class="nav-item">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="icon-user"></i>
                                <span class="title">User</span>
                                <span class="arrow"></span>
                            </a>
                            <ul style="display: none;" class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnListUsersStatique">
                                        <i class="icon-user"></i>
                                        <span class="title">List Users</span>
                                         <span class="arrow"></span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnFormAddUser">
                                        <i class="icon-user"></i>
                                        <span class="title">Add User</span>
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnSearchUsers">
                                        <i class="icon-user"></i>
                                        <span class="title">Search Users</span>
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        <!-- Section Vehicules -->
                        <li class="nav-item">
                            <a href="javascript:;" class="nav-link nav-toggle">
                                <i class="fa fa-car"></i>
                                <span class="title">Vehicule</span>
                                <span class="arrow"></span>
                            </a>
                            <ul style="display: none;" class="sub-menu">
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnListVehiculesStatique">
                                        <i class="fa fa-car"></i>
                                        <span class="title">List Vehicules</span>
                                         <span class="arrow"></span>
                                    </a>
                                </li>
                                <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnFormAddVehicule">
                                        <i class="fa fa-car"></i>
                                        <span class="title">Add Vehicule</span>
                                         <span class="arrow"></span>
                                    </a>
                                </li>
                                 <li class="nav-item  ">
                                    <a href="javascript:;" class="nav-link " id="btnSearchVehicules">
                                        <i class="fa fa-car"></i>
                                        <span class="title">Search Vehicules</span>
                                         <span class="arrow"></span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- END SIDEBAR MENU -->
                </div>
                <!-- END SIDEBAR -->
            </div>
			
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
				<div class="page-content" id="body">
					<span class="caption-subject font-green-sharp bold uppercase text-center"><h1>Welcome to the Spring App</h1></span> <!-- Content zone -->
				</div>
			</div>
			<!-- END CONTENT -->
			</div>
			<!-- BEGIN FOOTER -->
			<div class="page-footer">
				<div class="page-footer-inner">
					 2014 &copy; Spring boot web app.
				</div>
				<div class="scroll-to-top">
					<i class="icon-arrow-up"></i>
				</div>
			</div>
			<!-- END FOOTER -->
		
		
		<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
		<!-- BEGIN CORE PLUGINS -->
		<!--[if lt IE 9]>
		<script src="resources/global/plugins/respond.min.js"></script>
		<script src="resources/global/plugins/excanvas.min.js"></script> 
		<![endif]-->
		<script src="resources/global/plugins/jquery.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
		<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
		<script src="resources/global/plugins/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/jquery.cokie.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
		<script src="resources/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
		<!-- END CORE PLUGINS -->
		<!-- BEGIN PAGE LEVEL SCRIPTS -->
		<script src="resources/global/scripts/metronic.js" type="text/javascript"></script>
		<script src="resources/admin/scripts/layout.js" type="text/javascript"></script>
		<script src="resources/admin/scripts/quick-sidebar.js" type="text/javascript"></script>
		<script src="resources/admin/scripts/demo.js" type="text/javascript"></script>
		<script src="resources/global/scripts/indexScript.js" type="text/javascript"></script>
		
		<!-- IMPORTANT! Load jquery-ui.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
		<!-- END CORE PLUGINS -->
		<!-- BEGIN PAGE LEVEL PLUGINS -->
		<script type="text/javascript" src="resources/global/plugins/select2/select2.min.js"></script>
		<script type="text/javascript" src="resources/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="resources/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
		<!-- END PAGE LEVEL PLUGINS -->
		<!-- BEGIN PAGE LEVEL SCRIPTS -->
		<script src="resources/admin/pages/scripts/table-editable.js"></script>
		<script>
		ajaxInit();
		
		jQuery(document).ready(function() {       
			Metronic.init(); // init metronic core components
			Layout.init(); // init current layout
			QuickSidebar.init(); // init quick sidebar
			Demo.init(); // init demo features
			TableEditable.init();
		});
		</script>
	</body>
</html>