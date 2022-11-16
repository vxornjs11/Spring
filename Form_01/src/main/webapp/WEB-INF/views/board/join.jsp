<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>join.jsp</h1>
<table border="1" align="center">
<tr>
<td> 이름 </td><td >${member.name } </td>
</tr>
<tr>
<td> 아이디 </td><td > ${member.id }</td>
</tr>
<tr>
<td> 비밀번호 </td><td> ${member.pw }</td>
</tr>
<tr>
<td> 이메일 </td><td > ${member.email } </td>
</tr>
<tr>
</tr>
</table>
</body>
</html>