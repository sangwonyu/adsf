<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>게시물 작성</title>
	<style>
		label {
			display : block; /* 새 라인에서 시작 */
			padding : 5px;
		}
		label span {
			display : inline-block;
			width : 90px;
			text-align : right;
			padding : 10px;
		}
	</style>
</head>
<body>
<%
	//request.setCharacterEncoding("UTF-8");
	BoardDTO board = (BoardDTO) request.getAttribute("board");
%>
	<h3>게시물 작성</h3>
	<hr>
	<form name="registerForm" action="/jspbook/member/boardProcServlet?action=write" method=post>
		<label><span>아이디:</span>
			<input type="text" name="id" size="10"></label>
		<label><span>memberId:</span>
			<input type="hidden" name="memberId" size="10" value="<%=board.getMemberId()%>"></label>
		<label><span>title:</span>
			<input type="text" name="title" size="10"></label>
		<label><span>content:</span>
			<input type="text" name="content" size="40"></label>	
			<br>
		<label><span></span><input type="submit" value="등록" name="B1">&nbsp;&nbsp;
			<input type="reset" value="재작성" name="B2"></label>
	</form>
</body>
</html>