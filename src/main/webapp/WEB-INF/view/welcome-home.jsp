<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>${customizedTitle}</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<h3>Welcome Home ${param.user}</h3>
	<a href="${pageContext.request.contextPath}/">Go Back</a>
</body>
</html>