<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center"></div>
	<h2>ch06 : application 테스트</h2>
	<hr>
	1. 서버정보 : <%=application.getServerInfo()%><br>
	2. 서블릿 API 버전 정보: <%= application.getMajorVersion() + "." + application.getMinorVersion() %><br>
	3. application.jsp 파일의 실제경로 : <%=application.getRealPath("application.jsp") %><br>
	
	<hr>
	setAttribute로 username 변수에 "홍길동" 설정<P>
<%
	application.setAttribute("username", "홍길동");
		application.log("username=홍길동");
		application.setAttribute("count",1);
%>

<a href="application_result.jsp">확인하기</a>
</body>
</html>