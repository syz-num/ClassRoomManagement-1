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
		${student.message}
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
				<td><form:select path="sem">
						<form:option value="${student.sem}" label="${student.sem}" />
						<form:option value="1" label="1" />
						<form:option value="2" label="2" />
						<form:option value="3" label="3" />
						<form:option value="4" label="4" />
						<form:option value="5" label="5" />
						<form:option value="6" label="6" />
						<form:option value="7" label="7" />
						<form:option value="8" label="8" />
					</form:select></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mobileNo" text="Mobile Num" /></td>
				<td><form:input path="mobileNo" value="${student.mobileNo}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.gender" text="Gender" /></td>
				<td><form:select path="gender">
						<form:option value="${student.gender}" label="${student.gender}" />
						<form:option value="MALE" label="MALE" />
						<form:option value="FEMALE" label="FEMALE" />
					</form:select></td>
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
				<td><spring:message code="lbl.deptId" text="Department Id" /></td>
				<td><form:input path="deptId" value="${student.deptId}" /></td>
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