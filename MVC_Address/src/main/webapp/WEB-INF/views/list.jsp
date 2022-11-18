<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<div align="center" >

	<h1 >MVC 게시판</h1>
	
	<form action="listquery" >

 		<select name="query">
 			<option value="name"> 이름 </option>
 			<option value="tel"> 전화번호 </option>
 			<option value="address" selected = "selected" > 주소 </option>
 			<option value="connect"> 관계 </option>
 		
 		</select>&nbsp;&nbsp;&nbsp;
 		<input type="text", name="content". size="25" >
 		<input type="submit", value="검색">
총 검색 건수는 ${size}건 입니다.
</form>

	<table border="1" > 
		<tr>
			<th>번호</th><th>이름</th><th>전화번호</th><th>주소</th><th>전자우편</th><th>관계</th>
		</tr>
		<c:forEach items="${list }" var="dto">
			<tr>
				<td><a href="content_view?seq=${dto.seq}">${dto.seq }</a></td>
				<td>${dto.name }</td>
				<td>${dto.tel }</td>
				<td>${dto.address }</td>
				<td>${dto.email }</td>
				<td>${dto.connect }</td>
			</tr>
		
		</c:forEach>
		<tr>
			<td colspan="6"><a href="write_view">주소록 등록</a></td>
		
		</tr>
	</table>

</div>



</div>
</body>
</html>