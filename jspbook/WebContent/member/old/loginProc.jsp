    
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="member.*" %> 
<%
	request.setCharacterEncoding("UTF-8");
	int id = Integer.parseInt(request.getParameter("id"));
	String password = request.getParameter("password");
	MemberDAO mDao = new MemberDAO();
	int result = mDao.verifyIdPassword(id, password);
	String errorMessage = null;
	switch (result) {
	case MemberDAO.ID_PASSWORD_MATCH:
		break;
	case MemberDAO.ID_DOES_NOT_EXIST:
		errorMessage = "ID가 없음"; break;
	case MemberDAO.PASSWORD_IS_WRONG:
		errorMessage = "패스워드가 틀렸음"; break;
	case MemberDAO.DATABASE_ERROR:
		errorMessage = "DB 오류";
	}
	mDao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if (result == MemberDAO.ID_PASSWORD_MATCH) {
		response.sendRedirect("loginMain.jsp");
	} else {
%>
		<jsp:forward page="login.jsp">
			<jsp:param name="error" value="<%=errorMessage%>" />		
		</jsp:forward>
<%
	}
%>
</body>
</html>