<meta charset="UTF-8" />
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Subject Registration</title>
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
						<li><a href="/AddStudent">Student Registration</a></li>
						<li><a href="/AddLecturer">Lecturer Registration</a></li>
						<li><a href="/AddSubject">Subject Registration</a></li>
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
			<form:form method="post" modelAttribute="subject"
				action="SubjectOperation">
				<table>
					<caption>Subject Registration</caption>
					<tr>
						<td><spring:message code="lbl.USN" text="Subject ID" /></td>
						<td><form:input path="keyID" value="${student.keyID}" /></td>
						<td><form:input type="submit" path="operation"
								value="Search Subject" /></td>
					</tr>
				</table>
				<div align="center">
					<span>${subject.message}</span>
				</div>
				<br>
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
						<td><form:select path="sem">
								<form:option value="${subject.sem}" label="${subject.sem}" />
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
						<td>Is Elective Subject?</td>
						<td><form:select path="isElective">
								<form:option value="${subject.isElective}"
									label="${subject.isElective}" />
								<form:option value="NO" label="NO" />
								<form:option value="YES" label="YES" />
							</form:select></td>
						<%-- <td><form:input path="isElective" value="${subject.isElective}" /></td> --%>

					</tr>
					<tr>
						<td>Is Lab Subject?</td>
						<td><form:select path="isLab">
								<form:option value="${subject.isLab}" label="${subject.isLab}" />
								<form:option value="NO" label="NO" />
								<form:option value="YES" label="YES" />
							</form:select></td>
					</tr>


					<tr>
						<td><spring:message code="lbl.credit" text="credit" /></td>
						<td><form:input path="credit" value="${subject.credit}" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.totalMarks" text="totalMarks" /></td>
						<td><form:input path="totalMarks"
								value="${subject.totalMarks}" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.totalAttendance"
								text="totalAttendance" /></td>
						<td><form:input path="totalAttendance"
								value="${subject.totalAttendance}" readonly="true" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.test1Attendance"
								text="test1Attendance" /></td>
						<td><form:input path="test1Attendance"
								value="${subject.test1Attendance}" readonly="true" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.test2Attendance"
								text="test2Attendance" /></td>
						<td><form:input path="test2Attendance"
								value="${subject.test2Attendance}" readonly="true" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.test3Attendance"
								text="test3Attendance" /></td>
						<td><form:input path="test3Attendance"
								value="${subject.test3Attendance}" readonly="true" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.deptId" text="Department Id" /></td>
						<td><form:input path="deptId" value="${subject.deptId}" /></td>
					</tr>
					<tr>
						<td><spring:message code="lbl.academicYear"
								text="Academic Year" /></td>
						<td><form:input path="academicYear"
								value="${subject.academicYear}" /></td>
					</tr>


					<tr>
						<td><form:input type="submit" path="operation"
								value="Add Subject" /></td>
						<td><form:input type="submit" path="operation"
								value="Update Subject" /></td>
						<td><form:input type="submit" path="operation"
								value="Delete Subject" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>