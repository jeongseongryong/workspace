<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<h1>Page - 3</h1>
<form action="ok4.do" method="post">
Name: ${member2.name}<br>
Age: ${member2.age}<br>
working: <input type="radio" name= "working" value="true">In office
         <input type="radio" name= "working" value="false" checked>unemployment<br>
<button>다음</button>
</form>
</body>
</html>