/* 회원 관리 만들기 : 회원 목록 출력하기 II
 * => 회원 목록을 HTML로 만들어 출력한다.
 */
package Lecture;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/Lecture/List")
public class LectureList  extends HttpServlet {
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
    out.println("  <title>강의 관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 목록</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionpool conPool = new DBConnectionpool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      LectureDao lectureDao = new LectureDao(conPool);
      
      List<Lecture> list = lectureDao.selectList(pageNo, pageSize);
      	   	
      
      out.println("<a href='form.html'>새 강의</a>");
      
      out.println("<table border='1'>");
      out.println("<thead>");
      out.println("  <tr><th>번호</th><th>강의목록</th><th>강의 설명</th><th>시작일"
      		+ "</th><th>종료일</th><th>인원</th><th>수업료</th><th>수업일</th><th>강의실</th><th>매니저</th></tr>");
      out.println("</thead>");
      out.println("<tbody>");
      
      for (Lecture l : list) {
        out.println("<tr>");
        out.printf("  <td>%d</td>\n", l.getNo());
        out.printf("  <td><a href='Detail?no=%d'>%s</a></td>\n", l.getNo(),l.getTitl());
        out.printf("  <td>%s</td>\n", l.getDscp());
        out.printf("  <td>%s</td>\n", l.getSdt());
        out.printf("  <td>%s</td>\n", l.getEdt());
        out.printf("  <td>%d</td>\n", l.getQty());
        out.printf("  <td>%d</td>\n", l.getPric());
        out.printf("  <td>%d</td>\n", l.getThrs());

        
        out.println("</tr>");
      }
      
      out.println("</tbody>");
      out.println("</table>");
      
    } catch (Exception e) {
    	RequestDispatcher	rd = req.getRequestDispatcher("/Lecture/Error");
    	rd.forward(req, res);
      return;
    }
    
    out.println("</body>");
    out.println("</html>");
  }
}








