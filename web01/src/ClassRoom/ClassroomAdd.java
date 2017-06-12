/* 회원관리 만들기: 회원 목록 출력하기 II
 * =>회원 목록을 HTML로 만들어 출력한다.
 */
package ClassRoom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/ClassRoom/add") //
public class ClassroomAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {		
		req.setCharacterEncoding("UTF-8");
		Classroom c = new Classroom();
		
		c.setName(req.getParameter("name"));
		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYEP html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title>강의실  관리</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>강의실 등록</h1>");
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    ClassroomDao classroomDao = new ClassroomDao(conPool);
    
  
    classroomDao.insert(c);
    out.println("<p>등록 성공입니다.</p>");
    
    } catch (Exception e) {
    	out.println("오류 발생");
    	out.println("<pre>");
    	e.printStackTrace(out);
    	out.println("</pre>");
    }
    out.println(" <a href='list'>목록</a>");
    
    out.println("</body>");
    out.println("</html>");
	}
}