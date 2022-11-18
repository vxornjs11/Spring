<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
</head>

<body>

	<h2 align="center"> 글 입력 </h2>
	<form action="write" method="post" >
		<table border="0"  align="center">
				<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="30" > </td>

			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" size="30" > </td>

			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" size="30" > </td>

			</tr>
			<tr>
				<td>전자우편</td>
				<td><input type="text" name="email" size="30" > </td>

			</tr>
			<tr>
				<td>관계</td>
				<td><input type="text" name="connect" size="30" > </td>

			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="입력">&nbsp;&nbsp;&nbsp;<a href="list">목록보기</a> </td>
			</tr>
			
		
		</table>
	

	</form>

</body>
</html>