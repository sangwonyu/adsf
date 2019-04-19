package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberProc
 */
@WebServlet("/member/memberProcServlet")
public class MemberProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberProc() {
        super();
    }
    
   /* if(!request.getParameter("id").equals("")) {
    	id=Integer.parseInt((request.getParameter("id"));
    }*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO mDao=null;
	    RequestDispatcher rd=null;
		String action = request.getParameter("action");
		String strId = request.getParameter("id");
		int id= Integer.parseInt(strId);
		System.out.println(action + ", " + strId);
		
		switch(action) {
		case "update":  //수정 버튼 클릭 시
			mDao = new MemberDAO();
			MemberDTO member = mDao.searchById(Integer.parseInt(strId));
			mDao.close();
			request.setAttribute("member", member);
			rd = request.getRequestDispatcher("update.jsp");
	        rd.forward(request, response);
	        break;
	        
		case "delete": // 삭제 버튼 클릭시
		
			mDao = new MemberDAO();
			mDao.deleteMember(id);
			mDao.close();
			String message = "id = " +id + "가 삭제되었습니다.";
			String url ="loginMain.jsp";
			request.setAttribute("message", message);
			request.setAttribute("url", url);
			rd =request.getRequestDispatcher("alertMsg.jsp");
			rd.forward(request,response);
			break;
			//response.sendRedirect("loginMain.jsp");
		default:
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}