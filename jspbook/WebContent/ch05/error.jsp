<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>처리중 문제 발생</h2>
		<hr>
		<table>
			<tr bgcolor="pink">
				<td>관리자 문의 <br> 빠른시일내 복구
					<hr> <%= exception%>
					<hr>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>