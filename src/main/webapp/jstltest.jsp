<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL testing</h3>

	<h2>
		<c:out value="${'Welcome to jstl world'}" />
	</h2>

	<c:set var="name" value="ASH"></c:set>

	<c:out value="${name}" />

	<c:if test="${5>2}">
		<h3>this is true</h3>
	</c:if>

	<%-- <c:set var="name" value="ASH"></c:set> 
	<c:out value="${name}"/> --%>
</body>
</html>