<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

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
	<c:url value="/resources/text.txt" var="url" />
	<spring:url value="/resources/text.txt" htmlEscape="true"
		var="springUrl" />
	Spring URL: ${springUrl} at ${time}
	<br> JSTL URL: ${url}
	<br> Message: ${message}
</body>

</html>
