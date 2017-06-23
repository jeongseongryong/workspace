<%-- JSP 구성 요소 : JSP액션 태그 - jsp:include + jsp.param
1)템플릿 데이터
2)스크립트릿(scriptlet) 엘리먼트
3)지시어(directive) 엘리먼트
4)표현식(expression) 엘리먼트
5)선언문 (declaration) 엘리먼트
6)JSP 액션 태그
 => JSP에서 기본으로 제공하는태그
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
<h1>JSP액션 태그 - jsp:include + jsp:param III</h1>
<jsp:include page="c.jsp">
	<jsp:param name="name" value="홍길동"/>
	<jsp:param name="age" value="20"/>
</jsp:include>
</body>
</html>

