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
<%
pageContext.setAttribute("m", new Member());
%>
<c:set target="${pageScope.m}" property="name" value="홍길동"/>
<c:set target="${pageScope.m}" property="age" value="20"/>
<c:set target="${pageScope.m}" property="working" value="true"/>
name:${pageScope.m.name}<br>
age:${pageScope.m.age}<br>
working:${pageScope.m.working}<br>
</body>
</html>

<%!
public static class Member {
	// 필드 선언
	String name2;
	int age;
	boolean working;
	// 프로 퍼티(property) 선언
	public void setName(String name) {this.name2 = name;}
	public void setAge(int age) {this.age=age;}
	public void setWorking(boolean working) {this.working = working;}
	public String getName() {return this.name2;}
	public int getAge() {return this.age;}
	public boolean isWorking() {return this.working;}
	
}
%>
