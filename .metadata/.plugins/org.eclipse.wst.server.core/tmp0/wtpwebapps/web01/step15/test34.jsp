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

<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>JSTL</title>
</head>
<body>
<h1>EL - 배열에서</h1>
<%
ArrayList<String> list = new ArrayList<>();
list.add("홍길동");
list.add("임꺽정");
list.add("유관순");
list.add("안중근");
list.add("윤봉길");
pageContext.setAttribute("list", list);
%>

\${list[0]}: ${list[0]}<br>
\${list[1]}: ${list[1]}<br>
\${list[2]}: ${list[2]}<br>

</body>
</html>