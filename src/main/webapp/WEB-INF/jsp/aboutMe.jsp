<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="Dashboard">
		<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        <title>主页</title>

		<!-- Bootstrap core CSS -->
		<link href="assets/css/bootstrap.css" rel="stylesheet">
		<!--external css-->
		<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

		<!-- Custom styles for this template -->
		<link href="assets/css/style.css" rel="stylesheet">
		<link href="assets/css/style-responsive.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	</head>

	<body>

		<section id="container">
			<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
			<!--header start-->
			<header class="header black-bg">
				<div class="sidebar-toggle-box">
					<div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
				</div>
				<!--logo start-->
				<a href="index.html" class="logo"><b>菜单</b></a>
				<!--logo end-->
				<div class="nav notify-row" id="top_menu"></div>
			    <div class="top-menu">
            	<ul class="nav pull-right top-menu">
            	    <c:if test="${user eq null }">
                    <li><a class="logout" href="./login.do">登录</a></li>
                    </c:if>
                    <c:if test="${user ne null}">
                     <li><a class="logout" href="./logout.do">登出</a></li>
                    </c:if>
            	</ul>
            </div>
			</header>
			<!--header end-->

			<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
			<!--sidebar start-->
			<aside>
				<div id="sidebar" class="nav-collapse ">
					<!-- sidebar menu start-->
					<ul class="sidebar-menu" id="nav-accordion">

						<p class="centered">
							<a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a>
						</p>
						<h5 class="centered">博主姓名</h5>

						<li class="mt">
							<a href="javascript:;">
								<i class="fa fa-desktop"></i>
								<span>主页</span>
							</a>

						</li>

						<li class="sub-menu">
							<a class="active" href="javascript:;">
								<i class="fa fa-book"></i>
								<span>笔记</span>
							</a>
							<ul class="sub">
								<li class="active">
									<a href="blank.html">java学习笔记</a>
								</li>
								<li>
									<a href="login.html">nginx学习笔记</a>
								</li>
								<li>
									<a href="lock_screen.html">分布式学习笔记</a>
								</li>
							</ul>
						</li>

						<li class="mt">
							<a href="./aboutMe.do">
								<i class="fa fa-user"></i>
								<span>关于我</span>
							</a>

						</li>

					</ul>
					<!-- sidebar menu end-->
				</div>
			</aside>
			<!--sidebar end-->

			<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
			<!--main content start-->
			<section id="main-content">
				<section class="wrapper site-min-height">
					<h3><i class="fa fa-angle-right"></i> 关于我</h3>
					<div class="row mt">
						<div class="col-lg-12">
							   <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> 我的信息</h4>
                      <form class="form-horizontal style-form" method="get">
                        
                          <div class="form-group">
                              <label class="col-lg-2 col-sm-2 control-label">姓名</label>
                              <div class="col-lg-4">
                                  <p class="form-control-static">${identity.name }</p>
                              </div>
                               <label class="col-lg-2 col-sm-2 control-label">性别</label>
                              <div class="col-lg-4">
                                  <p class="form-control-static">
                                     <c:if test="${identity.sex eq 0 }">男</c:if>
                                       <c:if test="${identity.sex eq 1 }">女</c:if>
                                  </p>
                              </div>
                          </div>
                            <div class="form-group">
                              <label class="col-lg-2 col-sm-2 control-label">QQ</label>
                              <div class="col-lg-4">
                                  <p class="form-control-static">${identity.qq_num }</p>
                              </div>
                               <label class="col-lg-2 col-sm-2 control-label">手机号</label>
                              <div class="col-lg-4">
                                  <p class="form-control-static">${identity.phone }</p>
                              </div>
                          </div>
                            <div class="form-group">
                              <label class="col-lg-2 col-sm-2 control-label">E-mail</label>
                              <div class="col-lg-10">
                                  <p class="form-control-static">${identity.email }</p>
                              </div>
                          </div>
                          
                          
                           <div class="form-group">
                               <label class="col-lg-2 col-sm-2 control-label">个性签名</label>
                              <div class="col-lg-4">
                                  <p class="form-control-static">${identity.resume }</p>
                              </div>
                          </div>
                      </form>
                  
							   </div>
          	
							
						</div>
						
					</div>

				</section>
				<! --/wrapper -->
			</section>
			<!-- /MAIN CONTENT -->

			<!--main content end-->
			<!--footer start-->
			<footer class="site-footer">
				<div class="text-center">
					2017 - Alvarez.is
					<a href="blank.html#" class="go-top">
						<i class="fa fa-angle-up"></i>
					</a>
				</div>
			</footer>
			<!--footer end-->
		</section>

		<!-- js placed at the end of the document so the pages load faster -->
		<script src="assets/js/jquery.js"></script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>
		<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
		<script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
		<script src="assets/js/jquery.scrollTo.min.js"></script>
		<script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>

		<!--common script for all pages-->
		<script src="assets/js/common-scripts.js"></script>

		<!--script for this page-->

		<script>
			//custom select box

			$(function() {
				$('select.styled').customSelect();
			});
		</script>

	</body>

</html>