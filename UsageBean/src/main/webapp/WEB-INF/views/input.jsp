<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function Mul(){
	var input = document.Input;
	input.action = "/mulCalc";
	input.method = "get";
	input.submit();
}
function Add(){
	var input = document.Input;
	input.action = "/addCalc";
	input.method = "get";
	input.submit();
}

</script>
<body>
<form name="Input">
	<table border="1"> 
		<tr>
			<td>첫번째 숫자 :</td>
			<td><input type="text" name="num1" size="10"></td>
		</tr>
		<tr>
			<td>두번째 숫자 :</td>
			<td><input type="text" name="num2" size="10"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="덧셈" onclick="Add()"><input type="button" value="곱셈" onclick="Mul()"></td>
		</tr>
	</table>

</form>

</body>
</html>