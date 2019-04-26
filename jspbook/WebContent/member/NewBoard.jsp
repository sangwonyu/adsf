<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 작성</title>

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
	<h3>게시판 작성</h3>
	<hr>
	<table>
		<form name="updateForm1" action="/jspbook/member/BoardProcServlet?action=addBoard" method=post>
			<tr><td><label><span><strong>title:</strong></span></td><td>
				<input type="text" name="title"  size="10">
			</label></td></tr>
			<tr><td><label><span><strong>content:</strong></span></td><td>
			<textarea name="content" cols="40" rows="20" ></textarea>
			</label></td></tr>
			
			<label ><tr><td><p></p></td><td><input type="submit" value="게시물 작성" name="B1">
				 <input type="reset" value="재작성" name="B2">
			</form>
				 <button onclick="location.href='BoardProcServlet?action=list&page=1'">목록으로</button></td>
			</tr></label>
		
		
	</table>
</head>
<body>

</body>
</html>