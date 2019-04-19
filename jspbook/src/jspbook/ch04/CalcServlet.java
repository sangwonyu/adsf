package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(description = "계산기", urlPatterns = { "/ch04/CalcServlet" })
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num1,num2;
		int result;
		String op;
		
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		num1=Integer.parseInt(req.getParameter("num1"));
		num2=Integer.parseInt(req.getParameter("num2"));
		op= req.getParameter("operator");
		result=clac(num1,num2,op);
		
		out.println("<HTML>");
		out.println("<head><title>계산기</title></head>");
		out.println("<body><center>");
		
		out.println("<H2>계산결과</H2>");
		
		out.println("<HR>");
		out.println(num1+" " + op+num2+" ="+result);
		out.println("</body></HTML>");
		
	}
	

	public int clac(int num1,int num2,String op) {
		int result =0;
		if(op.equals("+")) {
			result=num1+num2;
		}
		else if(op.equals("-")) {
			result =num1-num2;
		}
		else if(op.equals("*")) {
			result =num1*num2;
		}
		else if(op.equals("/")) {
			result =num1/num2;
		}
		return result;
	}

}
