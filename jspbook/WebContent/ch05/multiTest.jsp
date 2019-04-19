<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>multi Test</title>
</head>
<body>
	<table border=1>
		<tr><th></th>
	<% 
		for(int i=3; i<=9; i+=2){
	%>	
		<th><%=i %></th>
	<%
		} 
	%>
		</tr>
	<% 
		for(int i=3; i<=9; i+=2){
	%>	
		<tr><td><%=i %></td>
	<%
			for(int z=3; z<=9; z+=2){
	%>		
		<td><%=i*z%></td>
	<% 	
			}
	%>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>