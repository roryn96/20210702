<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원정보 페이지입니다. <br />
아이디 : ${list[0].memId }<br />
이름 : ${list[0].memName }<br />
생년월일 : ${list[0].memBirth }<br />
성별 : ${list[0].memGender }<br />
우편번호 : ${list[0].postNumber }<br />
주소 : ${list[0].memAddress }<br />
상세주소 : ${list[0].detailAdd }<br />
연락처 : ${list[0].memPhone }<br />
이메일 : ${list[0].memEmail }<br />
계좌번호 : ${list[0].memAccount }<br />
수신여부 : <c:if test="${lists[0].memEmailCk == 'Y' }" > 
			이메일 수신 함
		</c:if> 
		<c:if test="${lists[0].memEmailCk == 'N'}" > 
			이메일 수신 안함
		</c:if>
		<br />
<a href="../memMod/${lists.get(0).memId }">수정</a>
</body>
</html>