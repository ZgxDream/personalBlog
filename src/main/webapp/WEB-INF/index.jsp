<!DOCTYPE html>
<html lang="en">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="Dashboard">
		<meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

		<title>DASHGUM - Bootstrap Admin Template</title>

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
                    <li><a class="logout" href="login.html">登录</a></li>
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
							<a href="javascript:;">
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
					<div class="row mt">
						<!--
                        	作者：songliuxin@outlook.com
                        	时间：2017-03-07
                        	描述：头部背景
                        -->
						<div style="height: 250px; margin-top: -25px; background:url(assets/img/instagram.jpg) ;background-size:100%;" class="col-lg-12">
							<div style="text-align:center; margin-top: 120px;">
								<h3><font color="white">我们的征途是星辰大海</font></h3></div>
						</div>
						<!--数据统计 -->
						<div class="col-lg-12">


							<div class="row mtbox">
								<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
									<div class="box1">
										<span class="li_heart"></span>
										<h3>933</h3>
									</div>
									<p>博客共收到933个喜欢</p>
								</div>
								<div class="col-md-2 col-sm-2 box0">
									<div class="box1">
										<span class="li_cloud"></span>
										<h3>48</h3>
									</div>
									<p>48个好友访问了此博客</p>
								</div>
								<div class="col-md-2 col-sm-2 box0">
									<div class="box1">
										<span class="li_stack"></span>
										<h3>23</h3>
									</div>
									<p>博主共建了23个文集</p>
								</div>
								<div class="col-md-2 col-sm-2 box0">
									<div class="box1">
										<span class="li_news"></span>
										<h3>110</h3>
									</div>
									<p>博主共发表了110篇博客</p>
								</div>
								<div class="col-md-2 col-sm-2 box0">
									<div class="box1">
										<span class="li_user"></span>
										<h3>Hello!</h3>
									</div>
									<p>欢迎访问我的个人博客</p>
								</div>

							</div>
							<!-- /row mt -->

						</div>
				        <!--数据统计end-->
				        <!--热门文章-->
				        <div class="col-lg-12">
				        <! -- Blog Panel1 -->
						<div class="col-lg-4 col-md-4 col-sm-4 mb">
							<div class="content-panel pn">
								<div id="blog-bg">
									<div class="badge badge-popular">Top1</div>
									<div class="blog-title">git分布式版本控制</div>
								</div>
								<div class="blog-text">
									<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <a href="#">Read More</a></p>
								</div>
							</div>
						</div>
						<! -- Blog Panel1end -->
						<! -- Blog Panel2 -->
						<div class="col-lg-4 col-md-4 col-sm-4 mb">
							<div class="content-panel pn">
								<div id="blog-bg">
									<div class="badge badge-popular">Top2</div>
									<div class="blog-title">分布式框架</div>
								</div>
								<div class="blog-text">
									<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <a href="#">Read More</a></p>
								</div>
							</div>
						</div>
						<! -- Blog Panel2end -->
						<! -- Blog Panel3 -->
						<div class="col-lg-4 col-md-4 col-sm-4 mb">
							<div class="content-panel pn">
								<div id="blog-bg">
									<div class="badge badge-popular">Top3</div>
									<div class="blog-title">Note.js</div>
								</div>
								<div class="blog-text">
									<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <a href="#">Read More</a></p>
								</div>
							</div>
						</div>
						<! -- Blog Panel3end -->
						
						
				        </div>
				        <!--热门文章end-->
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