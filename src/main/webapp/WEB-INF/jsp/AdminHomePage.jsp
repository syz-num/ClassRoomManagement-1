
<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin homepage</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker1").datepicker();
	});
	$(function() {
		$("#datepicker2").datepicker();
	});
</script>
<title>Student Registration</title>
</head>

<body>
	<div id="main">
		<div class="container">
			<div id="content">

				<h2>R V College of Engineering</h2>

			</div>
			<nav>
				<div class="nav-fostrap">
					<ul>
						<li><a href="/home">Home</a></li>
						<li><a href="/AddStudent">Student Registration</a></li>
						<li><a href="/AddLecturer">Lecturer Registration</a></li>
						<li><a href="/AddSubject">Subject Registration</a></li>
						<li><a href="/logout">Logout</a></li>
					</ul>
				</div>
				<div class="nav-bg-fostrap">
					<div class="navbar-fostrap">
						<span></span> <span></span> <span></span>
					</div>
					<a href="" class="title-mobile">Fostrap</a>
				</div>
			</nav>
		
		<br />
		
			<div>
				<h4>Welcome ${sessionScope.username },</h4>
			</div>
		
		</div>
	</div>
</body>
</html>
