/* 회원관리 만들기: 회원 목록 출력하기
 */
package ClassRoom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns="/ClassRoom/Servlet01") //
public class Servlet01 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {		
		int pageNo = 1;
		int pageSize = 5;
		
		try { //pageNo 파라미터 값이 있다면 그값으로 설정한다.
			pageNo = Integer.parseInt(req.getParameter("pageNo"));
			
		}catch (Exception e) {}
		
		try {// pageSize 파라미터 값이 있다면 그값으로 설정한다.
			pageSize = Integer.parseInt(req.getParameter("pageSize"));
		}catch (Exception e) {}
		
		res.setContentType("text/html;charset=UTF-8");		
		PrintWriter out = res.getWriter();		
		
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    ClassroomDao classroomDao = new ClassroomDao(conPool);
    
    List<Classroom> list = classroomDao.selectList(pageNo, pageSize);
    for (Classroom c : list) {
    	out.printf("%d, %s\n", c.getNo(), c.getName());
    	}	
    } catch (Exception e) {
    	out.println("오류 발생");
    	e.printStackTrace(out); // 오류가 발생했을때 어떤 오류인지 확인한다.
    }
	}
}