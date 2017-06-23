<%-- JSP 구성 요소 : JSPL확장태그
1)템플릿 데이터
2)스크립트릿(scriptlet) 엘리먼트
3)지시어(directive) 엘리먼트
4)표현식(expression) 엘리먼트
5)선언문 (declaration) 엘리먼트
6)JSP 액션 태그
7)JSP 확장 태그(JSTL)
		-jsp 에서 기본으로 제공하는 액션 태그만으로 프로그래밍할 때 
			부족하기 때문에 공식적으로 추가해서만든 확장태그
8)EL(Expression Language)
9)JSP주석
--%>
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
<h1>JSTL - c:set 태그 사용법</h1>
<c:set var="name1" value="홍길동"/>
<c:set var="name2" value="임꺽정"/>
<c:set var="name3" value="유관순"/>
${pageScope.name1}<br>
${pageScope.name2}<br>
${pageScope.name3}<br>
<hr>
<c:remove var="name1"/>
<c:remove var="name2" scope="page"/>
<c:remove var="name3" scope="request"/>
${pageScope.name1}<br>
${pageScope.name2}<br>
${pageScope.name3}<br>
</body>
</html>


