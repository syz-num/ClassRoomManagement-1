<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>jQuery UI Datepicker - Default functionality</title>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker1").datepicker();
	});
	
</script>
<title>Lecturer Registration</title>
</head>

<body>
	<h2>
		<spring:message code="lbl.page" text="Add New Lecturer" />
	</h2>
	<br />
	<form:form method="post" modelAttribute="lecturer">
		<table>
			<tr>
				<td><spring:message code="lbl.ID" text="ID" /></td>
				<td><form:input path="ID" value="${lecturer.ID}" /></td>
			</tr>
			<tr>
				<td><spring:message text="First Name" /></td>
				<td><form:input path="fName" value="${lecturer.fName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mName" text="Middle Name" /></td>
				<td><form:input path="mName" value="${lecturer.mName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lName" text="Last Name" /></td>
				<td><form:input path="lName" value="${lecturer.lName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.eMail" text="Email Id" /></td>
				<td><form:input path="eMail" value="${lecturer.eMail}" /></td>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.mobileNo" text="Mobile No." /></td>
				<td><form:input path="mobileNo" value="${lecturer.mobileNo}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.gender" text="Gender" /></td>
				<td><form:input path="gender" value="${lecturer.gender}" /></td>
			</tr>
			
			<tr>
				<td><spring:message code="lbl.DOJ" text="Date of Joining" /></td>
				<td><form:input type="text" id="datepicker1" path="DOJ"
						value="${lecturer.DOJ}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Lecturer" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>