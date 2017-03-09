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
		<!--引入富文本css-->
		<link rel="stylesheet" type="text/css" href="dist/css/wangEditor.min.css">

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
							<li>
								<a class="logout" href="./login.do">登录</a>
							</li>
						</c:if>
						<c:if test="${user ne null}">
							<li>
								<a class="logout" style="background:coral;" href="./logout.do">登出</a>
							</li>
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
					<h3><i class="fa fa-angle-right"></i> 新建博客</h3>
					<div class="row mt">
						<div class="col-lg-6 col-sm-12">
							<input id="title" type="text" class="form-control" placeholder="标题">
						</div>
						<div class="col-lg-6 col-sm-12">
							<select class="form-control" id="categary_id">
								<option value="1">java学习笔记</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</div>
						<div class="col-lg-12" style="margin-top: 10px;">
							<div id="div1" style="height: 400px;">
								<p>请输入内容...</p>
							</div>
						</div>
						<div class="col-lg-12" style="margin-top: 10px;">
							<div class="col-lg-11"></div>
							<div class="col-lg-1"> <button class="btn btn-info" id="btn1">提交</button></div>
						</div>
					</div>

				</section>
				<!--/wrapper -->
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

		<script>
			//custom select box

			$(function() {
				$('select.styled').customSelect();
			});
		</script>
		<!--引入jquery和wangEditor.js-->
		<!--注意：javascript必须放在body最后，否则可能会出现问题-->
		<script type="text/javascript" src="dist/js/lib/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="dist/js/wangEditor.min.js"></script>
		<!--这里引用jquery和wangEditor.js-->
		<script type="text/javascript">
			var editor = new wangEditor('div1');
			editor.create();

			$('#btn1').click(function() {
				// 获取编辑器区域完整html代码
				var html = editor.$txt.html();

				// 获取编辑器纯文本内容
				//var text = editor.$txt.text();

				// 获取格式化后的纯文本
				//var formatText = editor.$txt.formatText();
				var temp = document.createElement("form");
				temp.action ="./toAddBlog.do" ;
				temp.method = "post";
				temp.style.display = "none";
					var opt1 = document.createElement("textarea");
					opt1.name = "title";
					opt1.value = $("#title").val();
					temp.appendChild(opt1);
					var opt2 = document.createElement("textarea");
					opt2.name = "categary_id";
					opt2.value = $("#categary_id").val();
					temp.appendChild(opt2);
					var opt3 = document.createElement("textarea");
					opt3.name = "centent";
					opt3.value = html;
					temp.appendChild(opt3);
				document.body.appendChild(temp);
				temp.submit();
				return temp;

			});
		</script>

	</body>

</html>