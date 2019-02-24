<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Student Registration</title>
</head>

<body>
	<h2>
		<spring:message code="lbl.page" text="Add New student" />
	</h2>
	<br />
	<form:form method="post" modelAttribute="student">
		<table>
			<tr>
				<td><spring:message  text="First Name" /></td>
				<td><form:input path="fName"  value="${student.fName}"/></td>
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
				<td colspan="2"><input type="submit" value="Add student" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>