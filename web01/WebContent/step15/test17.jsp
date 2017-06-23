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
<c:set var="name" value="임꺽정1"/>
<c:set var="name" value="임꺽정2" scope="page"/>
<c:set var="name" value="임꺽정3" scope="request"/>
<c:set var="name" value="임꺽정4" scope="session"/>
<c:set var="name" value="임꺽정5" scope="application"/>
기본:<c:out value="${pageScope.name}"/><br>
PageContext:<c:out value="${pageScope.name}"/><br>
ServletRequest:<c:out value="${requestScope.name}"/><br>
HttpSession:<c:out value="${sessionScope.name}"/><br>
ServletContext:<c:out value="${applicationScope.name}"/><br>

<c:set var="name2">유관순</c:set>
${pageScope.name2}<br>
</body>
</html>

