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
<title>Student Registartion</title>
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
	<h2>
		<spring:message code="lbl.page" text="Mark Attendence" />
	</h2>
	<br />
	<form:form method="post" action="StudentOperation">
		<table border="1">
			<thead>
				<th>USN</th>
				<th>Name</th>
				<th>Is Absent?</th>
			</thead>
			<c:forEach var="student" items="${sudentList}">
				<tr>
					<td><spring:message code="lbl.USN" text="${student.USN}" /></td>
					<td><spring:message code="lbl.fName"
							text="${student.fName}&nbsp${student.mName}&nbsp${student.lName}" /></td>
					<td><input type="checkbox" name="NO"
						value="${student.isPresent}"></td>
				</tr>
			</c:forEach>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>