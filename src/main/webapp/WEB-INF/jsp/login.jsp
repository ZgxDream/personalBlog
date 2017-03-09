<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">


<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="assets/css/style.css" rel="stylesheet">
<link href="assets/css/style-responsive.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	<div id="login-page">
		<div class="container">

			<form class="form-login" action="./toLogin.do" method="post">
				<c:if test="${mag !=null}">
					<div class="errorHandler alert alert-danger">
						<i class="fa fa-remove-sign"></i> 你输入的数据出错，请重新输入
					</div>
				</c:if>
				<h2 class="form-login-heading">登录博客</h2>
				<div class="login-wrap">
					<input type="text" class="form-control" placeholder="用户名" autofocus
						name="u"> <br> <input type="password"
						class="form-control" placeholder="密码" name="p"> <label
						class="checkbox"> <span class="pull-right"> <a
							data-toggle="modal" href="login.html#myModal"> Forgot
								Password?</a>

					</span>
					</label>
					<button class="btn btn-theme btn-block" href="index.html"
						type="submit">
						<i class="fa fa-lock"></i>登录
					</button>
				</div>

				<!-- Modal -->
				<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog"
					tabindex="-1" id="myModal" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">忘记密码?</h4>
							</div>
							<div class="modal-body">
								<p>输入你的邮箱，你将会接收的密码信息。</p>
								<input type="text" name="email" placeholder="Email"
									autocomplete="off" class="form-control placeholder-no-fix">

							</div>
							<div class="modal-footer">
								<button data-dismiss="modal" class="btn btn-default"
									type="button">取消</button>
								<button class="btn btn-theme" type="button">确认</button>
							</div>
						</div>
					</div>
				</div>
				<!-- modal -->

			</form>

		</div>
	</div>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>

	<!--BACKSTRETCH-->
	<!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
	<script type="text/javascript"
		src="assets/js/jquery.backstretch.min.js"></script>
	<script>
		$.backstretch("assets/img/login-bg.jpg", {
			speed : 500
		});
	</script>


</body>
</html>
