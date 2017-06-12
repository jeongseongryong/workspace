/* 회원관리 만들기: 회원 목록 출력하기 II
 * =>회원 목록을 HTML로 만들어 출력한다.
 */
package Manager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




@WebServlet(urlPatterns="/Manager/Servlet06") //
public class Servlet06 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYEP html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset ='UTF-8'>");
		out.println("<title>매니저 관리</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>매니저 삭제</h1>");
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    
    ManagerDao managerDao = new ManagerDao(conPool);
    
  
    int no = Integer.parseInt(req.getParameter("no"));
    int count = managerDao.delete(no);
		if(count < 1) {
    	throw new Exception(no + "번 매니저를 찾을 수 없습니다.");
   	
    }
    out.println("<p>삭제 성공입니다.</p>");
    
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