<%-- JSP 구성 요소 :지시어
1)템플릿 데이터
2)스크립트릿(scriptlet) 엘리먼트
3)지시어(directive) 엘리먼트
	<%@ page %>
	<%@ include %>
	<%@ taglib %>
4)표현식(expression) 엘리먼트
5)선언문 (declaration) 엘리먼트
5)선언문 (declaration) 엘리먼트
6)JSP 액션 태그
7)JSP 확장 태그(JSTL)
8)EL(Expression Language)
9)JSP주석
--%>
<%@ page language="java"
 contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    import="java.util.ArrayList,java.net.Socket"%>
 <%@ page import="java.io.File" %>
 <%@ page import="java.io.Serializable" import="java.sql.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>JSP</title>
</head>
<body>
<!-- HTML 주석도 템플릿 데이터이다. -->
<h1>지시 엘리먼트</h1>
</body>
</html>