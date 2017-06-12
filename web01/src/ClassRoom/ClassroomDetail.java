	/* 회원 관리 만들기 : 회원 조회하기 
 * => MemberDao를 이용하여 클라이언트가 보낸 번호에 해당하는 회원 정보 찾아
 *    HTML로 만들어 출력한다. 
 */
package ClassRoom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/ClassRoom/detail")
public class ClassroomDetail  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>강의실 관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의실 조회</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionpool conPool = new DBConnectionpool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      ClassroomDao classroomDao = new ClassroomDao(conPool);
      
      int no = Integer.parseInt(req.getParameter("no"));
      
      Classroom classroom = classroomDao.selectOne(no);
      if (classroom == null) {
        throw new Exception(no + "번 강의실이 없습니다.");
      }
      
      out.printf("<form action='Servlet05' method='POST'>\n");
      out.printf("번호:<input type='text' name='no' value='%d' readonly><br>\n", classroom.getNo());
      out.printf("강의실:<input type='text' name='name' value='%s'><br>\n", classroom.getName());
      out.println("<button>변경</button>");
      out.println("<button type='button' onclick='doDelete()'>삭제</button>");
      out.println("<button type='button' onclick='doList()'>목록</button>");
      out.println("</form>");
      
      
    } catch (Exception e) {
      out.println("오류 발생!");
      out.println("<pre>");
      e.printStackTrace(out);
      out.println("</pre>");
      out.println("<a href='Servlet02'>목록</a>");
    }
    
    out.println("<script>");
    out.println("function doDelete() {");
    out.printf("location.href = 'Servlet06?no=%s'\n", req.getParameter("no"));
    out.println("}");
    out.println("function doList() {");
    out.println("location.href = 'Servlet02'\n");
    out.println("}");
    out.println("</script>");
    
    out.println("</body>");
    out.println("</html>");
  }
}









