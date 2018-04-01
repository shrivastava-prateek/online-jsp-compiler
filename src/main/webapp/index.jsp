<html lang="en">

<head>

<title>Online JSP Compiler . Test your JSP code snippets instantly.</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="This online utility provides users to test their standalone JSP pages online with a single click. This is an open source utility, please feel free to provide suggestions.">
<meta name="author" content="Prateek Shrivastava">
<meta name="google-site-verification" content="rnvRHKJmtTnFyA8IztC5opcdrxOMa-lsaKvOh3e-Jj8" />


<!-- Bootstrap Core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Theme CSS -->
<link href="resources/css/freelancer.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-98417308-1', 'auto');
  ga('send', 'pageview');

</script>


<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<script>
  (adsbygoogle = window.adsbygoogle || []).push({
    google_ad_client: "ca-pub-6533903561100518",
    enable_page_level_ads: true
  });
</script>

<script type="text/javascript" src="https://platform.linkedin.com/badges/js/profile.js" async defer></script>

</head>

<body id="page-top" class="index">
	<div id="skipnav">
		<a href="#maincontent">Skip to main content</a>
	</div>

	<!-- Navigation -->
	<nav id="mainNav"
		class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="javascript:window.location.reload(true)">Online JSP Compiler</a>
				<a href="https://github.com/shrivastava-prateek/online-jsp-compiler" class="pull-left"><img style="position: absolute; top: 0; left: 0; border: 0;" src="https://camo.githubusercontent.com/567c3a48d796e2fc06ea80409cc9dd82bf714434/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f6c6566745f6461726b626c75655f3132313632312e706e67" alt="Fork me on GitHub" data-canonical-src="https://s3.amazonaws.com/github/ribbons/forkme_left_darkblue_121621.png"></a>
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
					<div class="col-md-5">
						<label for="jspBody">JSP Code</label>
						<form name="JSPCode" method="post" action="JSPTestServlet">
							<textarea name="jspBody" id="jspBody" cols="50" rows="10"
								class="form-control">${jspBody}</textarea>
							<br /> <input type="submit" id="button" value="submit" class="btn btn-default" />
						</form>
					</div>
					<div class="col-md-1"></div>
					<div class="col-md-6">
						<label for="response">Output</label>
						<% 
String value = response.getHeader("includeJSP");
String path = response.getHeader("path");
String error = response.getHeader("error");
if(value != null && value.equalsIgnoreCase("true")){ 
//out.print(filePath);
try{
%>

						<jsp:include page="<%=path %>" flush="true" />

						<% }catch(Exception e){
							out.println(e.getMessage());
						}
}
%>
					</div>
				</div>
			</div>
		</div>
	</header>

	<footer class="text-center">
		<div class="footer-above">
			<div class="container">
				<div class="col-lg-12">
					<h3>About Online JSP Compiler</h3>
					<p>Online JSP Compiler is a free to use, open source project
						which helps user to test their standalone jsp pages</p>
						
						<div class="LI-profile-badge"  data-version="v1" data-size="medium" data-locale="en_US" data-type="horizontal" data-theme="dark" data-vanity="shrivastava-prateek"><a class="LI-simple-link" href='https://in.linkedin.com/in/shrivastava-prateek?trk=profile-badge'>Prateek Shrivastava</a></div>

				</div>
			</div>
		</div>
		<div class="footer-below">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">Online JSP
						Compiler</div>
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