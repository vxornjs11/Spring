<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 리스트</title>
</head>
<body>

	<h1>영화 검색</h1>
	
	
	<table border="1">
		<tr>
			<td>영화 이미지</td>
			<td>영화제목</td>
		</tr>
	<c:forEach items="${movielist }" var="dto">
		<tr>
			<td><img src="${dto.image }"></td>
			<td>${dto.title }</td>
		</tr>
	</c:forEach>
	
	</table>
		검색결과는 ${size } 입니다.

</body>
</html>