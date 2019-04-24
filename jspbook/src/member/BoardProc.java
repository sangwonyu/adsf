package member;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/member/BoardProcServlet")
public class BoardProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BoardProc() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDao = null;
		BoardDTO board = null;
		RequestDispatcher rd = null;
		int id = 0;
		int memberid = 0;
		String title = null;
		String date = null;
		String content = null;
		String message = null;
		HttpSession session = request.getSession();
		int memberId=(int)session.getAttribute("memberId");
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		
		switch(action) {
		
		case "addBoard" :
			title = request.getParameter("title");
			content= request.getParameter("content");
			
			board = new BoardDTO(memberId, title, content);
			
			bDao = new BoardDAO();
			bDao.addBoard(board);
			bDao.close();
			
			
			response.sendRedirect("board_list.jsp");
			break;
		
		case "detail":		// 상세페이지
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
			}

			bDao = new BoardDAO();
			board = bDao.searchById(id);
			System.out.println();
			bDao.close();
			request.setAttribute("board", board);
			rd = request.getRequestDispatcher("board_detail.jsp");
	        rd.forward(request, response);
	        break;
		
			
			
		case "update":		// 수정 버튼 클릭 시

			
			System.out.println();
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
				bDao = new BoardDAO();
				board = bDao.searchById(id);
			}
			if(board.getMemberId()!=(Integer)session.getAttribute("memberId")) {
				
				message = "id = " + id + " 에 대한 수정 권한이 없습니다..";
				String url = "board_list.jsp";
				request.setAttribute("message", message);
				request.setAttribute("url", url);
				rd = request.getRequestDispatcher("alertMsg.jsp");
				rd.forward(request, response);
				break;
			}
			
			bDao.close();
			request.setAttribute("board", board);
			rd = request.getRequestDispatcher("updateBoard.jsp");
	        rd.forward(request, response);
	        break;
		
	        
		case "delete":		// 삭제 버튼 클릭 시
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
			}
			int num3=0;
			BoardDAO dao2 = new BoardDAO();
			num3=(dao2.searchById(Integer.parseInt(request.getParameter("id"))).getMemberId());
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
			}
			
			if(num3!=(Integer)session.getAttribute("memberId")) {
				
				message = "id = " + id + " 에 대한 수정 권한이 없습니다..";
				String url2 = "board_list.jsp";
				request.setAttribute("message", message);
				request.setAttribute("url", url2);
				rd = request.getRequestDispatcher("alertMsg.jsp");
				rd.forward(request, response);
				break;
			}
			
			bDao = new BoardDAO();
			bDao.deleteBoard(id);
			bDao.close();
			//response.sendRedirect("loginMain.jsp");
			message = "id = " + id + " 이/가 삭제되었습니다.";
			String url = "board_list.jsp";
			request.setAttribute("message", message);
			request.setAttribute("url", url);
			rd = request.getRequestDispatcher("alertMsg.jsp");
			rd.forward(request, response);
	        
		case "execute":
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
			}
			title = request.getParameter("title");
			content= request.getParameter("content");
			
			board = new BoardDTO(id, title, content);
			
			bDao = new BoardDAO();
			bDao.updateBoard(board);
			bDao.close();
			
			message = "다음과 같이 수정하였습니다.\\n" + board.toString();
			request.setAttribute("message", message);
			request.setAttribute("url", "board_list.jsp");
			rd = request.getRequestDispatcher("alertMsg.jsp");
	        rd.forward(request, response);
			//response.sendRedirect("loginMain.jsp");
			break;
		}
	}
}
