/* 회원관리 만들기: 회원 목록 출력하기 II
 * =>회원 목록을 HTML로 만들어 출력한다.
 */
package Lecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/Lecture/Delete") //
public class LectureDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYEP html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title>강의 관리</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>강의 삭제</h1>");
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    
    LectureDao lectureDao = new LectureDao(conPool);
    
  
    int no = Integer.parseInt(req.getParameter("no"));
    int count = lectureDao.delete(no);
		if(count < 1) {
    	throw new Exception(no + "번 강의를 찾을 수 없습니다.");
   	
    }
    out.println("<p>삭제 성공입니다.</p>");
    res.setHeader("Refresh", "1;url=List");
    
    } catch (Exception e) {
    	RequestDispatcher rd = req.getRequestDispatcher("/Lecture/Error");
      rd.forward(req, res);
      return;
    }
    
    	
    
    
    
    out.println("</body>");
    out.println("</html>");
	}
}
