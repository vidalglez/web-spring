<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Student Home Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h3>Student Home Page</h3>
	<hr />
	<form:form action="processForm" modelAttribute="student" >
		First Name: <form:input path="firstName" />
		<div></div>
		Last Name: <form:input path="lastName" />
		<div></div>
		<form:select path="country">
			<form:option value="Germany">Germany</form:option>
			<form:option value="France"></form:option>
			<form:option value="Mexico"></form:option>
			<form:option value="Denmark"></form:option>
		</form:select>
		<input type="submit" value="Send"/>
	</form:form>
	<hr />
	<a href="${pageContext.request.contextPath}">Go Home</a>
</body>
</html>