package bitcamp.java93.servlet;
/* 웹 애플리케이션 공통자원을 준비하는 서블릿
 * 
 * 
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/InitServlet", loadOnStartup=1) 
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	@Override
	public void init() throws ServletException {
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    MemberDao memberDao = new MemberDao(conPool);
    
    // 모든서블릿이 사용할 수 있도록 memberDao 객체를 ServletContext 보관
    ServletContext sc = this.getServletContext();
    sc.setAttribute("memberDao", memberDao);
    } catch (Exception e) {
    	e.printStackTrace();
      return;
    }
	
	}
}


// 객체는 누군가 주소를 가지고있으면 쓰레기가 아니다.(힙에 생성된 주소는)