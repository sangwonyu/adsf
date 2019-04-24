<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 수정</title>

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
<center>
<%
	//request.setCharacterEncoding("UTF-8");
	BoardDTO board = (BoardDTO) request.getAttribute("board");
%>
	<h3>게시판 수정</h3>
	<hr>
	<table>
		<form name="updateForm1" action="/jspbook/member/BoardProcServlet?action=execute" method=post>
			<tr><th><input type="hidden" id="id" name="id" value="<%=board.getMemberId()%>">
			<label><span>아이디:</span></th><th>
				<%=board.getMemberId()%></label><th></tr>
			<tr><td><label><span><strong>title:</strong></span></td><td>
				<input type="text" name="title" value="<%=board.getTitle()%>" size="10">
			</label></td></tr>
			<tr><td><label><span><strong>content:</strong></span></td><td>
			<textarea name="content" cols="40" rows="20" ><%=board.getContent()%></textarea>
			</label></td></tr>
			</table>
			<label><span></span><input type="submit" value="게시물 수정" name="B1">&nbsp;&nbsp;
				<input type="reset" value="재작성" name="B2"></label>
		</form>
	
</head>
<body>

</body>
</html>