<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="member" scope="page" class="jspbook.ch03.MemberInfo" />
<jsp:setProperty name="member" property="*"/>
<%member.action(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 입력</title>
</head>
<body>
<center>
	<h3>회원정보 입력</h3>
	<hr>
	<p>회원가입하시려면 아래 정보입력하세요</p>
	<form name="form1" method=post>
		이름: <input type="text" name="name" width="200" size="5">
		이메일: <input type="text" name="email" width="200" size="5">
		전화번호: <input type="text" name="phone" width="200" size="5">
		<input type="submit" value="제출" name="B1">
	</form>
	<hr>
	<br>
	회원의 아이디: <jsp:getProperty name="member" property="id" />
</body>
</html>