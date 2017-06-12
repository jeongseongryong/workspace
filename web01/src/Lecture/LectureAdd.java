/* 회원관리 만들기: 회원 목록 출력하기 II
 * =>회원 목록을 HTML로 만들어 출력한다.
 */
package Lecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/Lecture/Add") 
public class LectureAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		req.setCharacterEncoding("UTF-8");
		Lecture l = new Lecture();
		
		l.setTitl(req.getParameter("titl"));
		l.setDscp(req.getParameter("dscp"));
		l.setSdt(req.getParameter("sdt"));
		l.setEdt(req.getParameter("edt"));
		l.setPric(Integer.parseInt(req.getParameter("pric")));
		l.setQty(Integer.parseInt(req.getParameter("qty")));
		l.setThrs(Integer.parseInt(req.getParameter("thrs")));
		//l.setCrmno(Integer.parseInt(req.getParameter(crmno);
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    LectureDao lectureDao = new LectureDao(conPool);
    
  
    lectureDao.insert(l);
    res.sendRedirect("List");
    
    
    } catch (Exception e) {
    	res.setContentType("text/html;charset=UTF-8");		
    	PrintWriter out = res.getWriter();
    	
    	out.println("<!DOCTYEP html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<meta charset ='UTF-8'>");
    	out.println("<title>강의 관리</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<h1>강의 등록</h1>");
    	out.println("오류 발생");
    	out.println("<pre>");
    	e.printStackTrace(out);
    	out.println("</pre>");
    	out.println(" <a href='List'>목록</a>");
    	
    	out.println("</body>");
    	out.println("</html>");
    }
	}
}