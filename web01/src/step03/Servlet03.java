/* 회원관리 만들기: 회원 목록 출력하기 II
 * =>회원 목록을 HTML로 만들어 출력한다.
 */
package step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




@WebServlet(urlPatterns="/step03/Servlet03") //
public class Servlet03 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {		
		req.setCharacterEncoding("UTF-8");
		Member m = new Member();
		
		m.setName(req.getParameter("name"));
		m.setTel(req.getParameter("tel"));
		m.setEmail(req.getParameter("email"));
		m.setPassword(req.getParameter("password"));
		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYEP html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title>회원 관리</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>회원 등록</h1>");
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    MemberDao memberDao = new MemberDao(conPool);
    
  
    memberDao.insert(m);
    out.println("<p>등록 성공입니다.</p>");
    
    } catch (Exception e) {
    	out.println("오류 발생");
    	out.println("<pre>");
    	e.printStackTrace(out);
    	out.println("</pre>");
    }
    out.println(" <a href='Servlet02'>목록</a>");
    
    out.println("</body>");
    out.println("</html>");
	}
}