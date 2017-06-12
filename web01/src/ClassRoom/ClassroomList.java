/* 회원 관리 만들기 : 회원 목록 출력하기 II
 * => 회원 목록을 HTML로 만들어 출력한다.
 */
package ClassRoom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/ClassRoom/list")
public class ClassroomList  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
    out.println("  <title>강의실 관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의실 목록</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionpool conPool = new DBConnectionpool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      ClassroomDao classroomDao = new ClassroomDao(conPool);
      
      List<Classroom> list = classroomDao.selectList(pageNo, pageSize);
      
      out.println("<a href='form.html'>새 강의실</a>");
      
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("  <tr><th>번호</th><th>강의실</th></tr>");
      out.println("</thead>");
      out.println("<tbody>");
      
      for (Classroom c : list) {
        out.println("<tr>");
        out.printf("  <td>%d</td>\n", c.getNo());
        out.printf("  <td><a href='Servlet04?no=%d'>%s</a></td>\n", c.getNo(), c.getName());
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









