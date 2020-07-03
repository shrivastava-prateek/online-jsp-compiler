<%@page import="com.onlinejspcompiler.security.JSPSecurityManager"%>
<%JSPSecurityManager.configureSecurityManager(); %>


<html lang="en">

<head>

<title>Online JSP Compiler . Test your JSP code snippets instantly.</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="This online utility provides users to test their standalone JSP pages online with a single click. This is an open source utility, please feel free to provide suggestions.">
<meta name="author" content="Prateek Shrivastava">
<meta name="google-site-verification"
	content="rnvRHKJmtTnFyA8IztC5opcdrxOMa-lsaKvOh3e-Jj8" />
<meta name="image" property="og:image" content="https://cdn.jsdelivr.net/gh/shrivastava-prateek/online-jsp-compiler/src/main/resources/logo.png">
	
	
<!-- <style type="text/css">
.LI-view-profile {
	margin-right: 63px !important;
}
</style> -->

<link href="resources/css/application.css" rel="stylesheet">
<!-- Bootstrap Core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Theme CSS -->
<link href="resources/css/freelancer.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script>
	(function(i, s, o, g, r, a, m) {
		i['GoogleAnalyticsObject'] = r;
		i[r] = i[r] || function() {
			(i[r].q = i[r].q || []).push(arguments)
		}, i[r].l = 1 * new Date();
		a = s.createElement(o), m = s.getElementsByTagName(o)[0];
		a.async = 1;
		a.src = g;
		m.parentNode.insertBefore(a, m)
	})(window, document, 'script',
			'https://www.google-analytics.com/analytics.js', 'ga');

	ga('create', 'UA-98417308-1', 'auto');
	ga('send', 'pageview');
</script>


<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
	(adsbygoogle = window.adsbygoogle || []).push({
		google_ad_client : "ca-pub-6533903561100518",
		enable_page_level_ads : true
	});
</script>

<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>
	<!-- Place this tag in your head or just before your close body tag. -->
<!-- <script async defer src="https://buttons.github.io/buttons.js"></script> -->

</head>

<body id="page-top" class="index">
	<!-- Navigation -->
	<nav id="mainNav"
		class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
			<!-- 	<a class="navbar-brand" style="margin-left: 0px;"
					href="javascript:window.location.reload(true)">Online JSP
					Compiler</a>  -->
						<a class="navbar-brand" href="javascript:window.location.reload(true)">Online JSP Compiler</a> 
<a href="https://github.com/shrivastava-prateek/online-jsp-compiler" class="github-corner" aria-label="View source on GitHub"><svg width="80" height="80" viewBox="0 0 250 250" style="fill:#151513; color:#fff; position: absolute; top: 0; border: 0; right: 0;" aria-hidden="true"><path d="M0,0 L115,115 L130,115 L142,142 L250,250 L250,0 Z"></path><path d="M128.3,109.0 C113.8,99.7 119.0,89.6 119.0,89.6 C122.0,82.7 120.5,78.6 120.5,78.6 C119.2,72.0 123.4,76.3 123.4,76.3 C127.3,80.9 125.5,87.3 125.5,87.3 C122.9,97.6 130.6,101.9 134.4,103.2" fill="currentColor" style="transform-origin: 130px 106px;" class="octo-arm"></path><path d="M115.0,115.0 C114.9,115.1 118.7,116.5 119.8,115.4 L133.7,101.6 C136.9,99.2 139.9,98.4 142.2,98.6 C133.8,88.0 127.5,74.4 143.8,58.0 C148.5,53.4 154.0,51.2 159.7,51.0 C160.3,49.4 163.2,43.6 171.4,40.1 C171.4,40.1 176.1,42.5 178.8,56.2 C183.1,58.6 187.2,61.8 190.9,65.4 C194.5,69.0 197.7,73.2 200.1,77.6 C213.8,80.2 216.3,84.9 216.3,84.9 C212.7,93.1 206.9,96.0 205.4,96.6 C205.1,102.4 203.0,107.8 198.3,112.5 C181.9,128.9 168.3,122.5 157.7,114.1 C157.9,116.9 156.7,120.9 152.7,124.9 L141.0,136.5 C139.8,137.7 141.6,141.9 141.8,141.8 Z" fill="currentColor" class="octo-body"></path></svg></a><style>.github-corner:hover .octo-arm{animation:octocat-wave 560ms ease-in-out}@keyframes octocat-wave{0%,100%{transform:rotate(0)}20%,60%{transform:rotate(-25deg)}40%,80%{transform:rotate(10deg)}}@media (max-width:500px){.github-corner:hover .octo-arm{animation:none}.github-corner .octo-arm{animation:octocat-wave 560ms ease-in-out}}</style>
			</div>
		</div>
		<!-- /.container-fluid -->
	</nav>





	<!-- Header -->
	<header>
		<div class="container" id="maincontent" tabindex="-1">
			<div class="row">
				<div class="col-lg-12">
					<!--  <img class="img-responsive" src="resources/img/profile.png" alt=""> -->
					<div class="col-md-6">
						<h3>
							<!-- <label class="jspBody" for="jspBody"
								style="color: #2C3E50; text-shadow: 2px 2px 8px;">JSP
								Code</label> -->
								<label class="jspBody" for="jspBody">JSP Code</label>
						</h3>
						<form name="JSPCode" method="POST" action="compileJSP">
							<%-- <textarea name="jspBody" id="jspBody" cols="50" rows="10"
								class="form-control" style="background-color: #feffc7;">${empty jspBody?"<html><body><% out.print(new java.util.Date()); %></body></html>":jspBody}</textarea> --%>
								<textarea name="jspBody" id="jspBody" cols="50" rows="10"
								class="form-control">${empty jspBody?"<html><body><% out.print(new java.util.Date()); %></body></html>":jspBody}</textarea>
								
							<br /> <!-- <input type="submit" id="button" value="Compile"
								class="btn btn-primary"
								style="color: #f3d6cb; background-color: #376a95; border-color: #4288cd; font-weight: 600;"> -->
								<input type="submit" id="button" value="Compile"
								class="btn btn-primary">
						</form>
					</div>
					<div class="col-md-1"></div>
					<div class="col-md-6">

						<h3>
							<!-- <label class ="response" for="response"
								style="color: #2C3E50; text-shadow: 2px 2px 8px;">Output</label> -->
								<label class="output" for="response">Output</label>
						</h3>
						<div>
							<%
								String value = (String)request.getAttribute("includeJSP");
								String path = (String)request.getAttribute("path");
								/* String value = (String)response.getHeader("includeJSP");
								String path = (String)response.getHeader("path"); */
								//String jspBody = (String)request.getAttribute("jspBody");
								//String error = (String)request.getAttribute("error");
								System.out.println(value +"--"+ path+"--");
								if (value != null && value.equalsIgnoreCase("true")) {
									//out.print(filePath);
									try {
										System.out.println(request.getRealPath(path));
										
							%>

							<jsp:include page="<%=path%>" flush="true" />

							<%-- <%@ include file="/test.jsp" %> --%>
							<%
							System.out.println("fetched values");
								} catch (Exception e) {
										if (e.getCause() != null) {
											e.printStackTrace();
											if (e.getCause().getClass().toString().equals(java.lang.SecurityException.class.toString()))
												out.println(e.getCause());
											else
											{e.printStackTrace();out.println(e.getMessage());}
										} else
											{e.printStackTrace();out.println(e.getMessage());}
									}
								}
							%>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>

	<footer>
		<div class="footer-above">
			<div class="container">
				<!-- <div class="col-lg-12" style="padding-bottom: 20px;"> -->
				<div class="col-lg-12">
					<div class="col-md-6">
						<div class="row">
							<!-- <h4 class="title-about" style="color: #e6ffb4;">About Online JSP Compiler</h4> -->
							<h4 class="title-about">About Online JSP Compiler</h4>
							<p>It is a free to use, open source project which helps user
								to test their standalone jsp snippets on the fly. Feel free to
								suggest any enhancements :)</p>
						<!-- 	<a class="resport-problem"
								style="font-size: 10px; text-transform: uppercase; color: #fff; border: 2px solid #e6ffb4; border-radius: 99px; padding: 7px 15px 7px; display: inline-block; float: left;"
								href="mailto:onlinejspcompiler@gmail.com" target="_blank">Report
								a problem</a> -->
									<a class="resport-problem" href="mailto:onlinejspcompiler@gmail.com" target="_blank">Report a problem</a>
						</div>
					</div>
					<div class="col-md-2"></div>
					<!-- <div class=" col-md-4" style="padding-left: 15px;"> -->
					<div class="col-md-4">
						<div class="row">
							<!-- <h4 class="about-me" style="color: #e6ffb4;">About me</h4> -->
							<h4 class="about-me">About me</h4>
							<div class="LI-profile-badge" data-version="v1"
								data-size="medium" data-locale="en_US" data-type="horizontal"
								data-theme="dark" data-vanity="shrivastava-prateek"
								data-rendered="true" data-uid="997423">
								<a class="LI-simple-link"
									href="https://in.linkedin.com/in/shrivastava-prateek?trk=profile-badge">Prateek
									Shrivastava</a>
								<div>
									<script
										src="https://static.licdn.com/sc/h/3qk7aqkysw7gz575y2ma1e5ky"
										type="text/javascript"></script>
									<code id="__pageContext__" style="display: none;"> </code>
									<script
										src="https://static.licdn.com/sc/p/com.linkedin.badger-frontend%3Abadger-frontend-static-content%2B0.1.117/f/%2Fbadger-frontend%2Fsc-hashes%2Fsc-hashes_en_US.js"></script>
									<script
										src="https://static.licdn.com/sc/h/19dd5wwuyhbk7uttxpuelttdg"></script>
									<link rel="stylesheet"
										href="https://static.licdn.com/sc/h/5qdq5h6xnumnzahdm6n8eud1f">
									<div dir="ltr"
										class="LI-badge-container-horizontal-dark LI-badge-container horizontal dark medium"
										style="display: none">
										<div class="LI-profile-badge-header LI-name-container LI-row">
											<div class="LI-col">
												<div class="LI-profile-pic-container">
													<img
														src="https://static.licdn.com/scds/common/u/images/themes/katy/ghosts/person/ghost_person_200x200_v1.png"
														class="LI-profile-pic" alt="Prateek Shrivastava"
														width="200" height="200">
												</div>
											</div>
											<div class="LI-col LI-header">
												<div class="LI-name">
													<a
														href="https://in.linkedin.com/in/shrivastava-prateek?trk=profile-badge-name">Prateek
														Shrivastava</a>
												</div>
												<div class="LI-title">Programmer Analyst II at FIS</div>
											</div>
										</div>
										<div class="LI-footer LI-row">
											<a
												href="https://in.linkedin.com/in/shrivastava-prateek?trk=profile-badge-cta"
												class="LI-view-profile">View profile</a><span
												class="LI-logo"><img
												src="https://static.licdn.com/scds/common/u/images/logos/linkedin/logo_linkedin_flat_white_93x21.png"
												alt="LinkedIn" class="LI-icon"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer-below text-center">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">Online JSP Compiler</div>
				</div>
			</div>
		</div>
	</footer>



	<!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
	<div
		class="scroll-top page-scroll hidden-sm hidden-xs hidden-lg hidden-md">
		<a class="btn btn-primary" href="#page-top"> <i
			class="fa fa-chevron-up"></i>
		</a>
	</div>

	<!-- jQuery -->
	<script src="resources/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

	<!-- Theme JavaScript -->
	<script src="resources/js/freelancer.min.js"></script>


</body>

</html>
