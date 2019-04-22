package member.old;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

/**
 * Servlet implementation class LoginProc
 */
@WebServlet("/member/loginProcServlet")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginProc() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int id = 0;
		String strId = request.getParameter("id");
		if (!strId.equals(""))
			id = Integer.parseInt(strId);
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
		
		if (result == MemberDAO.ID_PASSWORD_MATCH) {
			response.sendRedirect("loginMain.jsp");
		} else {
			// 방법 1 - 상대방이 getParameter("error")로 받을 때
			String uri = "login.jsp?error=" + URLEncoder.encode(errorMessage, "UTF-8");
					//org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(errorMessage), request.getCharacterEncoding());
			response.sendRedirect(uri); 
			// 방법 2 - 상대방이 getParameter("error")로 받을 때
			/*String uri = "login.jsp?error=" + errorMessage;
			RequestDispatcher dispatcher = request.getRequestDispatcher(uri); 
			dispatcher.forward(request, response);*/
			// 방법 3 - 상대방이 getAttribute("error")로 받을 때
			/*request.setAttribute("error", errorMessage);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	        rd.forward(request, response);*/
	        // pageContext.forward("login.jsp");
		}
	}
}