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
	&nbsp;&nbsp; ${memberName} 회원님 반갑습니다.<br>
	<a href="fileServlet?action=boardDown">다운로드</a>&nbsp;&nbsp;&nbsp;
	<a href="memberProcServlet?action=list&page=1">목록</a>
	<hr>
	<br>
	<table border="1" style="border-collapse:collapse;">
	<tr bgcolor="pink"><th>글번호</th><th>제목</th><th>글쓴이</th><th>최종수정일</th><th>액션</th></tr>
	
	<c:set var="bmList" value="${requestScope.bbsMemberList}"/>
	<c:forEach var='board' items="${bmList}">
		<tr height="25"><td>${board.id}</td>
		<td><a href="BoardProcServlet?action=detail&id=${board.id}">${board.title}</a></td>
		<td>${board.name}</td>
		<td>${board.date}</td>
		<td>&nbsp;<button onclick="location.href='BoardProcServlet?action=update&id=${board.id}'">수정</button>&nbsp;
		&nbsp;<button onclick="location.href='BoardProcServlet?action=delete&id=${board.id}'">삭제</button>&nbsp;</td></tr>
	</c:forEach>
	</table>
	<br>
	<c:set var="pageList" value="${requestScope.pageList}"/>
	<c:forEach var="pageNo" items="${pageList}">
		${pageNo}
	</c:forEach>
	<br><br>
	<button onclick="location.href='NewBoard.jsp'" >게시물 작성</button>
	</center>
	
</body>
</html>