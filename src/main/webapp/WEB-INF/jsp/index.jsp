<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body class="html front not-logged-in page-home">

	<div id="wrapperDiv">
		<div id="div1" style="display: inline-block">
			<a href="/" title="Home" rel="home" class="site-logo"><img
				src="https://rvce.edu.in/sites/default/files/logo_0.png" alt="Home"></a>
		</div>
		<div id="div2"  style="display: inline-block">

			<h3 class="rtecenter">
				<span style="font-size: 16px">Rashtreeya Sikshana Samithi
					Trust</span>
			</h3>
			<h1 class="rtecenter">
				<span style="font-size: 26px"><a href="/" title="Home">R
						V College of Engineering </a></span>
			</h1>
			<h6 class="rtecenter">
				<span style="font-size: 12px">Autonomous Institution
					affiliated to Visvesvaraya Technological University, Belagavi</span>
			</h6>
			<h6 class="rtecenter">
				<span style="font-size: 12px">Approved By AICTE, New Delhi,
					Accredited By NBA, New Delhi</span>
			</h6>
		</div>
		<div id="div3">

			<h1>Since 1963</h1>
			<img alt="" src="/img/anniversary-logo.jpg">
		</div>
	</div>

	<h3>Login Page</h3>
	${error }
	<form method="post" action="${pageContext.request.contextPath }/login">
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>