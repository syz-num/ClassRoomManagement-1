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
			<div class='content'>
				<h4>Welcome ${sessionScope.username },</h4>
			</div>
			<br>

			<table>

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
		</div>
	</div>
</body>
</html>