<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" scope="page" class="jspbook.ch03.MemberInfo" />
<jsp:setProperty name="member" property="*"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloWorld</title>
</head>
<body>
	<center>
	<h3>Hello World</h3>
	<hr>
	현재 시간: <%=new java.util.Date() %>
</body>
</html>