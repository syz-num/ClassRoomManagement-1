<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>

<title>Student Home Page</title>
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
	<h4>Welcome ${sessionScope.username },</h4>

	<table border="1">

		<tr>
			<th>Subject ID</th>
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
		</tr>

		<c:forEach var="studentSubData"
			items="${sessionScope.studentSubDatas}">
			<tr>
				<td>${studentSubData.subID}</td>
				<td>${studentSubData.quiz1Marks}</td>
				<td>${studentSubData.quiz2Marks}</td>
				<td>${studentSubData.quiz3Marks}</td>
				<td>${studentSubData.requizMarks}</td>
				<td>${studentSubData.assignmentMarks}</td>
				<td>${studentSubData.test1Marks}</td>
				<td>${studentSubData.test2Marks}</td>
				<td>${studentSubData.test3Marks}</td>
				<td>${studentSubData.retestMarks}</td>
				<td>${studentSubData.avgTestMarks}</td>
				<td>${studentSubData.test1Attendance}</td>
				<td>${studentSubData.test2Attendance}</td>
				<td>${studentSubData.test3Attendance}</td>
				<td>${studentSubData.totalAttendance}</td>
				<td>${studentSubData.labInternalMarks}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>