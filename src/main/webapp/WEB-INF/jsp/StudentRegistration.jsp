<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
		<spring:message code="lbl.page" text="Add New student" />
	</h2>
	<br />
	<form:form method="post" modelAttribute="student"
		action="StudentOperation">
		<table>
			<tr>
				<td><spring:message code="lbl.USN" text="USN" /></td>
				<td><form:input path="keyUSN" value="${student.keyUSN}" /></td>
				<td><form:input type="submit" path="operation"
						value="Search Student" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td><spring:message code="lbl.USN" text="USN" /></td>
				<td><form:input path="USN" value="${student.USN}" /></td>
			</tr>
			<tr>
				<td><spring:message text="First Name" /></td>
				<td><form:input path="fName" value="${student.fName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mName" text="Middle Name" /></td>
				<td><form:input path="mName" value="${student.mName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lName" text="Last Name" /></td>
				<td><form:input path="lName" value="${student.lName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.eMail" text="Email Id" /></td>
				<td><form:input path="eMail" value="${student.eMail}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.sem" text="Semister" /></td>
				<td><form:input path="sem" value="${student.sem}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mobileNo" text="Mobile Num" /></td>
				<td><form:input path="mobileNo" value="${student.mobileNo}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.gender" text="Gender" /></td>
				<td><form:input path="gender" value="${student.gender}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.DOB" text="Date of Birth" /></td>
				<fmt:formatDate value="${student.DOB}" pattern="MM/dd/yyyy"
					var="dob" />
				<td><form:input type="text" id="datepicker1" path="DOB"
						value="${dob}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.DOJ" text="Date of Joining" /></td>
				<fmt:formatDate value="${student.DOJ}" pattern="MM/dd/yyyy"
					var="doj" />
				<td><form:input type="text" id="datepicker2" path="DOJ"
						value="${doj}" /></td>
			</tr>
			<tr>
				<td border="0" colspan="2"><textarea readonly>${student.message}</textarea></td>
			</tr>
			<tr>
				<td><form:input type="submit" path="operation"
						value="Add Student" /></td>
				<td><form:input type="submit" path="operation"
						value="Update Student" /></td>
				<td><form:input type="submit" path="operation"
						value="Delete Student" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>