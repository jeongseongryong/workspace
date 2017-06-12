package bitcamp.java93.servlet;
/* ServletContext 보관소에 저장된 MemberDao 이용하기
 */


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet(urlPatterns="/member/delete") //
public class MemberDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYEP html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title>회원 관리</title>");
		
		RequestDispatcher rd = req.getRequestDispatcher("/style/core");
    rd.include(req, res);
		
		
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>회원 삭제</h1>");
		
		
    try {
    MemberDao memberDao = (MemberDao)this.getServletContext().getAttribute("memberDao");
     
    int no = Integer.parseInt(req.getParameter("no"));
    int count = memberDao.delete(no);
		if(count < 1) {
    	throw new Exception(no + "번 회원을 찾을 수 없습니다.");
   	
    }
    out.println("<p>삭제 성공입니다.</p>");
    res.setHeader("Refresh", "1;url=list");
    
    } catch (Exception e) {
    	req.setAttribute("error", e);
    	rd = req.getRequestDispatcher("/error");
      rd.forward(req, res);
      return;
    }
    
    rd = req.getRequestDispatcher("/footer");
    rd.include(req, res);
     
    out.println("</body>");
    out.println("</html>");
	}
}