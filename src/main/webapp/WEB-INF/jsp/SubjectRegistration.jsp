<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<title>Subject Registration</title>
</head>

<body>
	<h2>
		<spring:message code="lbl.page" text="Add New Subject" />
	</h2>
	<br />
	<form:form method="post" modelAttribute="subject">
		<table>
			<tr>
				<td><spring:message code="lbl.subID" text="Subject ID" /></td>
				<td><form:input path="subID" value="${subject.subID}" /></td>
			</tr>

			<tr>
				<td><spring:message code="lbl.subName" text="Subject Name" /></td>
				<td><form:input path="subName" value="${subject.subName}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lectureID" text="Lecturer ID" /></td>
				<td><form:input path="lectureID" value="${subject.lectureID}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.sem" text="Semister" /></td>
				<td><form:input path="sem" value="${subject.sem}" /></td>
			</tr>
			
			<tr>
				<td>Is Elective Subject?</td>
				<td> Yes <form:checkbox path="isElective" value="Yes" /></td>

			</tr>
			<tr>
				<td><spring:message code="lbl.departmentID" text="Department ID" /></td>
				<td><form:input path="departmentID"
						value="${subject.departmentID}" /></td>
			</tr>
			<tr>
				<td>Is Lab Subject?</td>
				<td> Yes<form:checkbox path="isLab" value="Yes" /></td>

			</tr>
			

			<tr>
				<td><spring:message code="lbl.credit" text="credit" /></td>
				<td><form:input path="credit" value="${subject.credit}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.totalMarks" text="totalMarks" /></td>
				<td><form:input path="totalMarks" value="${subject.totalMarks}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.totalAttendence"
						text="totalAttendence" /></td>
				<td><form:input path="totalAttendence"
						value="${subject.totalAttendence}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.test1Attendence"
						text="test1Attendence" /></td>
				<td><form:input path="test1Attendence"
						value="${subject.test1Attendence}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.test2Attendence"
						text="test2Attendence" /></td>
				<td><form:input path="test2Attendence"
						value="${subject.test2Attendence}" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.test3aAtendence"
						text="test3aAtendence" /></td>
				<td><form:input path="test3aAtendence"
						value="${subject.test3aAtendence}" /></td>
			</tr>


			<tr>
				<td colspan="2"><input type="submit" value="Add subject" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>