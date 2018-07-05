<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h3>Student Confirmation Page</h3>
	<hr />
	<p>Your confirmation details are ${student.firstName} ${student.lastName}</p>
	<p>Your country option is: ${student.country}</p>
	<p>Your favorite programming language is: ${student.favoriteLanguage}</p>
	<hr />
	<a href="${pageContext.request.contextPath}/student/showForm">Go Student</a>
</body>
</html>