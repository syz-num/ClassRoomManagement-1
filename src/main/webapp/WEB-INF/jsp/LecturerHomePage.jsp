<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Lecturer Home Page</title>
</head>

<body>
	<div id="main">
		<div class="container">
			<div id="content">

				<h2>R V College of Engineering</h2>

			</div>
			<nav>
				<div class="nav-fostrap">
					<ul align="right">
						<li><a href="#">Home</a></li>
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

			<h4>Welcome ${sessionScope.username },</h4>
			<form method="post">
				<table>
					<tr>
						<td>Please select subject Id to mark attendence :</td>
						<td><select id="subId" name="subId">
								<option value="">--Select--</option>
								<c:forEach var="subject" items="${sessionScope.subjectList}">
									<option value="${subject}">${subject}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<td><input type="submit"
							onclick="javascript: form.action='/MarkAttendance';"
							value="Mark Attendance"></td>
						<td><input type="submit"
							onclick="javascript: form.action='/UpdateStudentData';"
							value="Update Student Data"></td>
					</tr>
				</table>

			</form>
		</div>
	</div>
</body>
</html>