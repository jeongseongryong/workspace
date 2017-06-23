<%-- JSP 구성 요소 : JSPL - 관계연산자
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
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java"
 contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>JSTL</title>
</head>
<body>
<h1>EL - 관계연산자</h1>

\${10 < 20}: ${10 < 20}<br>
\${10 <= 20}: ${10 <= 20}<br>
\${10 > 20}: ${10 > 20}<br>
\${10 >= 20}: ${10 >= 20}<br>
\${10 == 20}: ${10 == 20}<br>
\${10 != 20}: ${10 != 20}<br>
<hr>
\${10 lt 20}: ${10 lt 20}<br>
\${10 le 20}: ${10 le 20}<br>
\${10 gt 20}: ${10 gt 20}<br>
\${10 ge 20}: ${10 ge 20}<br>
\${10 eq 20}: ${10 eq 20}<br>
\${10 ne 20}: ${10 ne 20}<br>


</body>
</html>