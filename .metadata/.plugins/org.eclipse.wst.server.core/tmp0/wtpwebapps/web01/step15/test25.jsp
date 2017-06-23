<%-- JSP 구성 요소 : JSPL확장태그
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
<h1>JSTL - c:url 태그 사용법</h1>
<%-- 문자열로 --%>
<%-- https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=kotlin --%>
<c:set var='url1' value="https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=kotlin"/>
${pageScope.url1}<br>

<c:url var='url2' value="https://search.naver.com/search.naver">
	<c:param name="where" value="nexearch"/>
	<c:param name="sm" value="top_hty"/>
	<c:param name="fbm" value="1"/>
	<c:param name="ie" value="utf8"/>
	<c:param name="query" value="kotlin"/>
</c:url>
${pageScope.url2}<br>
</body>
</html>


