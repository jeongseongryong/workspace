<%-- JSP 구성 요소 : JSPL확장태그
1)템플릿 데이터
2)스크립트릿(scriptlet) 엘리먼트
3)지시어(directive) 엘리먼트
4)표현식(expression) 엘리먼트
5)선언문 (declaration) 엘리먼트
6)JSP 액션 태그
7)JSP 확장 태그(JSTL) -
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
<h1>JSTL - c:if 태그 사용법</h1>
<c:set var="name" value="유관순"/>
<c:set var="age" value="20"/>
<c:set var="working" value="true"/>
${pageScope.name}<br>
${pageScope.age}<br>
${pageScope.working}<br>
<hr>
<c:if test="true"><p>true</p></c:if>
<c:if test="TRUE"><p>TRUE</p></c:if>
<c:if test="True"><p>True</p></c:if>
<c:if test="trUe"><p>trUe</p></c:if>

<c:if test="false"><p>false</p></c:if>
<c:if test="aaaa"><p>aaaa</p></c:if>

<c:if test="name=='유관순'"><p>유관순1111</p></c:if>

<c:if test="${name=='유관순'}">유관순2222<br></c:if>
<c:if test="${age==20}">슴살<br></c:if>
<c:if test="${working==true}">재직중<br></c:if>
<c:if test="${working}">재직중2<br></c:if> <%--"${working}"에 true가 놓여진다 --%>

<c:if test="${working}" var="result">재직중3<br></c:if> <%--조건 결과를 보관소의 저장 --%>
####${pageScope.result}####

</body>
</html>


