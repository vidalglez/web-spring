<%-- response.sendRedirect("customer/list"); --%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>My Home Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h3>My Home Page</h3>
	<form method="GET" action="welcomeHome">
		<input type="text" name="user" placeholder="Introduce your name" />
		<input type="submit" value="Send" />
	</form>
	<hr />
	<a href="student/showForm">Student section</a>
	<div></div>
	<a href="customers/list">Customers list</a>
	<div></div>
	<a href="students/list">Student list</a>
</body>
</html>