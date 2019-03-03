<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<title>Lecturer Home Page</title>
</head>

<body>
	
	<form:form method="post" modelAttribute="lecturer">
		<table>
			<tr>
				<td><spring:message code="lbl.ID" text="ID" /></td>
				<td><spring:message code="lbl.ID" text="${lecturer.ID}" /></td>
			</tr>
			<tr>
				<td><spring:message text="First Name" /></td>
				<td><spring:message code="lbl.fName" text="${lecturer.fName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.mName" text="Middle Name" /></td>
				<td><spring:message code="lbl.mName" text="${lecturer.mName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lName" text="Last Name" /></td>
				<td><spring:message code="lbl.lName" text="${lecturer.lName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.eMail" text="Email Id" /></td>
				<td><spring:message code="lbl.eMail" text="${lecturer.eMail}" /></td>
			</tr>
			
			
			
			<tr>
				<td colspan="2"><input type="submit" value="Add Lecturer" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>