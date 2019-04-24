<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ page import="member.*" %>
<%
	BoardDAO bDao = new BoardDAO();
	List<BoardDTO> list = bDao.selectJoin();
	bDao.close();
%>
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
	<br>
	<table border="1" style="border-collapse:collapse;">
	<tr bgcolor="pink"><th>글번호</th><th>제목</th><th>글쓴이</th><th>최종수정일</th><th>액션</th></tr>
	<%
	for (BoardDTO board: list) {
	%>
		<tr><td><%=board.getId()%></td>
		<td><a href="BoardProcServlet?action=detail&id=<%=board.getId()%>"><%=board.getTitle()%></a></td>
		<td><%=board.getName()%></td>
		<td><%=board.getDate()%></td>
	<%
		String updateUri = "BoardProcServlet?action=update&id=" + board.getId();
		String deleteUri = "BoardProcServlet?action=delete&id=" + board.getId();
		
	%>
		<td>&nbsp;<button onclick="location.href='<%=updateUri%>'">수정</button>&nbsp;
		&nbsp;<button onclick="location.href='<%=deleteUri%>'">삭제</button>&nbsp;</td></tr>
	<%
	}
	%>
	</table>
	<br>
	<button onclick="location.href='NewBoard.jsp'" >게시물 작성</button>
</body>
</html>