<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<h1>HttpSession에 보관된 member 객체 꺼내기</h1>
Name: ${member.name}<br>
Age: ${member.age}<br>
working: ${member.working}<br>

<h1>HttpSession에 보관된 member2 객체 꺼내기</h1>
Name: ${member2.name}<br>
Age: ${member2.age}<br>
working: ${member2.working}<br>
</body>
</html>