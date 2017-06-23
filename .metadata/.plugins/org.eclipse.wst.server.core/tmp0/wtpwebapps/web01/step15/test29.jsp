<%-- JSP 구성 요소 : JSPL - import
1)템플릿 데이터
2)스크립트릿(scriptlet) 엘리먼트
3)지시어(directive) 엘리먼트
4)표현식(expression) 엘리먼트
5)선언문 (declaration) 엘리먼트
6)JSP 액션 태그
7)JSP 확장 태그(JSTL)
8)EL(Expression Language)
9)JSP주석
--%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java"
 contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL</title>
</head>
<body>
<h1>JSTL - fmt:parseDate 태그 사용법</h1>
<jsp:useBean id ="date1" class="java.util.Date"/>

<fmt:parseDate value="${date1}" pattern="yyyy-MM-dd"/><br>
<fmt:parseDate value="${date1}" pattern="MM/dd/yyyy"/><br>
<fmt:parseDate value="${date1}" pattern="MM/dd/yy"/><br>
<fmt:parseDate value="${date1}" pattern="MM/dd/yyyy hh:mm"/><br>
<fmt:parseDate value="${date1}" pattern="MM/dd/yyyy hh:mm" var="str1"/>
<h2>${str1}</h2>

</body>
</html>


