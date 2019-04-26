package member;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
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
		int curPage = 1;
		HttpSession session = request.getSession();
		int memberId=(int)session.getAttribute("memberId"); // member_talbe의 id 값
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		List<String> pageList = new ArrayList<String>();
		switch(action) {
		 
		case "list":
			if (!request.getParameter("page").equals("")) {
				curPage = Integer.parseInt(request.getParameter("page"));
			}
			bDao = new BoardDAO();
			int count = bDao.getCount();
			if (count == 0)			// 데이터가 없을 때 대비
				count = 1;
			int pageNo = (int)Math.ceil(count/10.0);
			if (curPage > pageNo)	// 경계선에 걸렸을 때 대비
				curPage--;
			session.setAttribute("currentBbsPage", curPage);
			// 리스트 페이지의 하단 페이지 데이터 만들어 주기
			String page = null;
			page = "<a href=#>&laquo;</a>&nbsp;";
			pageList.add(page);
			for (int i=1; i<=pageNo; i++) {
				page = "&nbsp;<a href=BoardProcServlet?action=list&page=" + i + ">" + i + "</a>&nbsp;";
				pageList.add(page);
			}
			page = "&nbsp;<a href=#>&raquo;</a>";
			pageList.add(page);
			
			List<BbsMember> bmList = bDao.selectJoinAll(curPage);
			request.setAttribute("bbsMemberList", bmList);
			request.setAttribute("pageList", pageList);
			rd = request.getRequestDispatcher("board_list.jsp");
	        rd.forward(request, response);
			break;
		
		case "addBoard" :
			title = request.getParameter("title");
			content= request.getParameter("content");
			
			board = new BoardDTO(memberId, title,"", content);
			
			bDao = new BoardDAO();
			bDao.addBoard(board);
			bDao.close();
			
			response.sendRedirect("BoardProcServlet?action=list&page=1");
			break;
		
		case "detail":		// 상세페이지
			if (!request.getParameter("id").equals("")) {
				id = Integer.parseInt(request.getParameter("id"));
			}

			bDao = new BoardDAO();
			board = bDao.searchById(id);//id 글번호
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
				String url = "boardProcServlet?action=list&page=1";
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
				String url2 = "boardProcServlet?action=list&page=1";
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
			String url = "BoardProcServlet?action=list&page=1";
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
			curPage = (int)session.getAttribute("currentMemberPage");
			url = "BoardProcServlet?action=list&page=" + curPage;
			request.setAttribute("url", url);
			rd = request.getRequestDispatcher("alertMsg.jsp");
	        rd.forward(request, response);
			//response.sendRedirect("loginMain.jsp");
			break;
		}
	}
}