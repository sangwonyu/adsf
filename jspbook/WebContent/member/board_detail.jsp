<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ page import="member.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>게시판</h2><br>
	<hr>
	<table border="1" style="border-collapse:collapse;">
		<tr bgcolor="pink"><th></th><th>Detail</th></tr>
	<c:set var="board" value="${requestScope.board}"/>
		<tr><td><strong>MEMBERID</strong> : &nbsp;</td><td>${board.memberId}</td></tr>
		<tr><td><strong>TITLE:</strong> &nbsp;</td><td>${board.title}</td></tr>
		<tr><td><strong>DATE :</strong> &nbsp;</td><td>${board.date}</td></tr>
		<tr><td><strong>CONTENT :</strong> &nbsp;</td><td>${board.content}</td></tr>
	</table> 
	<br>
		<button onclick="location.href='BoardProcServlet?action=update&id=${board.id}'">수정</button>&nbsp;
		<button onclick="location.href='BoardProcServlet?action=delete&id=${board.id}">삭제</button>
	
</body>
</html>