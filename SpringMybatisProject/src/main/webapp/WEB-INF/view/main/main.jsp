<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty authInfo }">
<!-- 로그인 안된 경우 -->
<form:form action="login" method="post" name="frm"
	modelAttribute = "logInCommand">
<table>
	<tr><td colspan="3">아이디 저장 <input type="checkbox" name="idStore"
	<c:if test ="${!empty isId }"> checked</c:if> />
	| 자동로그인<input type="checkbox" name="autoLogin" /></td></tr>
	<tr><td>아이디</td>
		<td><form:input path ="userId" value="$isId }"/>
			<form:errors path ="userId" /></td>
		<td rowspan="2">
		<input type="image" src="images/img1.jpg" width="100" alt="login"/>
		</td></tr>
	<tr><td>비밀번호</td>
		<td>
			<form:password path="userPw" />
			<form:errors path="userPw" />
		</td></tr>
	<tr><td colspan="3">
		아이디 / 비밀번호 찾기
		<a href="register/agree">회원 가입</a>
		</td></tr>
</table>
</form:form>
</c:if>

<c:if test="${!empty authInfo }">
	<!-- 로그인 되었을 때 -->
		<c:if test="${authInfo.grade == 1 }">
	<!-- 일반 사용자 -->
		<a href="edit/myPage">마이페이지</a>
	</c:if>
	<c:if test="${authInfo.grade != 1 }">
	<!-- 관리자 -->
	<a href="employee/mypage">마이페이지</a>
	<a href="member/memList">회원리스트</a>
	<a href="emp/empList">직원리스트</a>
	<a href="goods/goodsList">상품리스트</a>
	</c:if>
	<a href="login/logOut">logOut</a>
</c:if>
<table>
<tr>
<c:forEach items="${lists }" var="dto" varStatus="cnt">
	<td width="200" height="200">
		<c:if test ="${dto.prodImage !=null }">
		<img width="200" height="200" src="goods/upload/${dto.prodImage.split(',')[0] }" /><br />
		</c:if>
		<c:if test="${dto.prodImage == null }">
		</c:if>
		${dto.prodName }<br />
		<fmt:formatNumber value = "${dto.prodPrice }" type="currency" />
	</td>
	<c:if test="${cnt.count % 3 == 0}">
			</tr><tr>
		</c:if>
</c:forEach>
</tr>
</table>
</body>
</html>