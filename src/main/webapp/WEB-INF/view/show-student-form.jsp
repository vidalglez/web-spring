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
			<form:options items="${student.countryOptions}" />			
		</form:select>
		<div></div>
		<div> Choose your favorite programming language: 
		<form:radiobuttons path="favoriteLanguage" items="${student.languagesOptions}" />		
		</div>
		<div>
			Choose your favorite Operating System
			<form:checkboxes items="${student.osOptions}" path="operatingSystems"/>
		</div>
		<input type="submit" value="Send"/>
	</form:form>
	<hr />
	<a href="${pageContext.request.contextPath}">Go Home</a>
</body>
</html>