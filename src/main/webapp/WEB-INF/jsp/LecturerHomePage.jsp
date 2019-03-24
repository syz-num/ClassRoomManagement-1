<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Lecturer Home Page</title>
</head>

<body>
	<h4>Welcome ${sessionScope.username },</h4>
	<form method="post" action="MarkAttendance">
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
				<td><input type="submit" value="Mark Attendance"></td>
			</tr>
		</table>

	</form>
</body>
</html>