<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function Get(){
		var stu = document.stu;
		stu.action = "/student/2";
		stu.method = "get";
		stu.submit();
			
			}
	function Post(){
		var stu = document.stu;
		stu.action = "/student/2";
		stu.method = "Post";
		stu.submit();
			
			}
		
</script>
<body>
<form  name="stu">
Get : <br>
Studnet id : <input type="text" name="studentId"><br>
<input type="button" value="전송" onclick="Get()"><br>
Post : <br>
Studnet id : <input type="text" name="studentId"><br>
<input type="button" value="전송" onclick="Post()"><br>



</form>

</body>
</html>