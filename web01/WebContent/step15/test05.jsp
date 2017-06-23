<%-- JSP 구성 요소 : 지시어 엘리먼트 -include
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
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1>지시엘리먼트 -page</h1>
<hr>
<% String name ="홍길동"; %>
<%@ include file="a.jsp" %>
<hr>
<%-- 
<jsp:include page="a.jsp"/>
--%>
</body>
</html>