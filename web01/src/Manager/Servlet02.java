/* 회원 관리 만들기 : 회원 목록 출력하기 II
 * => 회원 목록을 HTML로 만들어 출력한다.
 */
package Manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet(urlPatterns="/Manager/Servlet02")
public class Servlet02  extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    /* 페이지 번호와 페이지당 출력 개수 파라미터 받기 */
    int pageNo = 1;
    int pageSize = 5;
    
    try { // pageNo 파라미터 값이 있다면 그 값으로 설정한다.
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try { // pageSize 파리미터 값이 있다면 그 값으로 설정한다.
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>매니저 관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>매니저 목록</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionpool conPool = new DBConnectionpool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      ManagerDao managerDao = new ManagerDao(conPool);
      
      List<Manager> list = managerDao.selectList(pageNo, pageSize);
      
      out.println("<a href='form.html'>새 매니저</a>");
      
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("  <tr><th>번호</th><th>이름</th><th>이메일</th><th>직급</th><th>팩스</th><th>사진경로</th></tr>");
      out.println("</thead>");
      out.println("<tbody>");
      
      for (Manager m : list) {
        out.println("<tr>");
        out.printf("  <td>%d</td>\n", m.getNo());
        out.printf("  <td><a href='Servlet04?no=%d'>%s</a></td>\n", m.getNo(), m.getPosi());
        out.printf("  <td>%s</td>\n", m.getFax());
        out.printf("  <td>%s</td>\n", m.getPath());
        out.println("</tr>");
      }
      
      out.println("</tbody>");
      out.println("</table>");
      
    } catch (Exception e) {
      out.println("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
    }
    
    out.println("</body>");
    out.println("</html>");
  }
}









