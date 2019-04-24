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
<title>Update Student Data</title>
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
			<form:form method="post" action="SaveStudentData"
				modelAttribute="studentsData">
				<div align="center">
					<h2>Student Data : ${studentsData.subId}</h2>
				</div>
				<table>
					<tr>
						<th>USN</th>
						<th>Quiz1 Marks</th>
						<th>Quiz2 Marks</th>
						<th>Quiz3 Marks</th>
						<th>Requiz Marks</th>
						<th>Assignment Marks</th>
						<th>Test1 Marks</th>
						<th>Test2 Marks</th>
						<th>Test3 Marks</th>
						<th>Retest Marks</th>
						<th>avgTestMarks</th>
						<th>Test1 Attendance</th>
						<th>Test2 Attendance</th>
						<th>Test3 Attendance</th>
						<th>Total Attendance</th>
						<th>Lab Internal Marks</th>
						<th>Subject Id</th>
					</tr>
					<c:forEach var="studentSubData" items="${studentsData.datas}"
						varStatus="status">
						<tr>
							<td><form:input path="datas[${status.index}].USN"
									value="${studentSubData.USN}" /></td>
							<td><form:input path="datas[${status.index}].quiz1Marks"
									value="${studentSubData.quiz1Marks}" /></td>
							<td><form:input path="datas[${status.index}].quiz2Marks"
									value="${studentSubData.quiz2Marks}" /></td>
							<td><form:input path="datas[${status.index}].quiz3Marks"
									value="${studentSubData.quiz3Marks}" /></td>
							<td><form:input path="datas[${status.index}].requizMarks"
									value="${studentSubData.requizMarks}" /></td>
							<td><form:input
									path="datas[${status.index}].assignmentMarks"
									value="${studentSubData.assignmentMarks}" /></td>
							<td><form:input path="datas[${status.index}].test1Marks"
									value="${studentSubData.test1Marks}" /></td>
							<td><form:input path="datas[${status.index}].test2Marks"
									value="${studentSubData.test2Marks}" /></td>
							<td><form:input path="datas[${status.index}].test3Marks"
									value="${studentSubData.test3Marks}" /></td>
							<td><form:input path="datas[${status.index}].retestMarks"
									value="${studentSubData.retestMarks}" /></td>
							<td><form:input path="datas[${status.index}].avgTestMarks"
									value="${studentSubData.avgTestMarks}" /></td>
							<td><form:input
									path="datas[${status.index}].test1Attendance"
									value="${studentSubData.test1Attendance}" /></td>
							<td><form:input
									path="datas[${status.index}].test2Attendance"
									value="${studentSubData.test2Attendance}" /></td>
							<td><form:input
									path="datas[${status.index}].test3Attendance"
									value="${studentSubData.test3Attendance}" /></td>
							<td><form:input
									path="datas[${status.index}].totalAttendance"
									value="${studentSubData.totalAttendance}" /></td>
							<td><form:input
									path="datas[${status.index}].labInternalMarks"
									value="${studentSubData.labInternalMarks}" /></td>
							<td><form:input path="datas[${status.index}].subID"
									readonly="true" value="${studentSubData.subID}" /></td>
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