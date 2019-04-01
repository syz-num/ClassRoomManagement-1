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
<link rel="stylesheet" href="/resources/demos/style.css">
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
	<div id="wrapperDiv" align="center">
		<div id="div1" style="display: inline-block; vertical-align: top;">
			<a href="/" title="Home" rel="home" class="site-logo"><img
				src="https://rvce.edu.in/sites/default/files/logo_0.png" alt="Home"></a>
		</div>
		<div id="div2" style="display: inline-block; vertical-align: top;">
			<h4>Rashtreeya Sikshana Samithi Trust</h4>
			<h2>
				<a>R V College of Engineering </a>
			</h2>
		</div>
		<div id="div1" style="display: inline-block; vertical-align: bottom;">
			<a href="/logout">logout</a>
		</div>
	</div>
	
	<h2>
		<spring:message code="lbl.page" text="Mark Attendance" />
	</h2>
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
				<td><form:select path="courseStage">
						<form:option value="${attendance.courseStage}"
							label="${attendance.courseStage}" />
						<form:option value="TEST1" label="TEST1" />
						<form:option value="TEST2" label="TEST2" />
						<form:option value="TEST3" label="TEST3" />
					</form:select></td>
			</tr>
		</table>
		<table border="1">
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
</body>
</html>