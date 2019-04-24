<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mark Attendance</title>
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
			<form:form method="post" action="SaveAttendance"
				modelAttribute="attendance">
				<table>

					<tr>
						<td><form:input type="text" path="subID"
								value="${attendance.subID}" /></td>
						<td><fmt:formatDate value="${attendance.date}"
								pattern="MM/dd/yyyy" var="date" />
						<td><form:input type="text" id="datepicker2" path="date"
								value="${date}" /></td>
						<td><form:input type="text" path="unit" /></td>
						<td>Course Stage</td>
						<td><form:select path="courseStage">
								<form:option value="${attendance.courseStage}"
									label="${attendance.courseStage}" />
								<form:option value="TEST1" label="TEST1" />
								<form:option value="TEST2" label="TEST2" />
								<form:option value="TEST3" label="TEST3" />
							</form:select></td>
					</tr>
				</table>
				<br>
				<table>
					<caption>Mark Attendance</caption>
					<thead>
						<th>USN</th>
						<th>Name</th>
						<th>Is Present?</th>
					</thead>
					<c:forEach items="${attendance.students}" var="student"
						varStatus="status">
						<tr>
							<td><form:input path="students[${status.index}].USN"
									value="${student.USN}" readonly="true" /></td>
							<td><spring:message code="lbl.fName"
									text="${student.fName}&nbsp${student.mName}&nbsp${student.lName}" /></td>
							<td><form:select path="students[${status.index}].isPresent">
									<form:option value="YES" label="YES" />
									<form:option value="NO" label="NO" />
								</form:select></td>
						</tr>
					</c:forEach>

					<tr>
						<td><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>

</body>
</html>