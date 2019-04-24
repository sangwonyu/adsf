<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ page import="member.*" %>
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
	<%
		BoardDTO board = (BoardDTO) request.getAttribute("board");
	%>
		<tr><td><strong>MEMBERID</strong> : &nbsp;</td><td><%=board.getMemberId() %></td></tr>
		<tr><td><strong>TITLE:</strong> &nbsp;</td><td><%=board.getTitle() %></td></tr>
		<tr><td><strong>DATE :</strong> &nbsp;</td><td><%=board.getDate() %></td></tr>
		<tr><td><strong>CONTENT :</strong> &nbsp;</td><td><%=board.getContent() %></td></tr>
	<%
		String updateUri = "BoardProcServlet?action=update&id=" + board.getId();
		String deleteUri = "BoardProcServlet?action=delete&id=" + board.getId();
			
	%>
	</table> 
	<br>
		<button onclick="location.href='<%=updateUri%>'">수정</button>&nbsp;
		<button onclick="location.href='<%=deleteUri%>'">삭제</button>
	
</body>
</html>