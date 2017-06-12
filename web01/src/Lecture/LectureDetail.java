/* 회원 관리 만들기 : 회원 조회하기 
 * => MemberDao를 이용하여 클라이언트가 보낸 번호에 해당하는 회원 정보 찾아
 *    HTML로 만들어 출력한다. 
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

@WebServlet(urlPatterns="/Lecture/Detail")
public class LectureDetail  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>강의관리</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>강의 조회</h1>");
    
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    try {
      DBConnectionpool conPool = new DBConnectionpool(
          jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
      
      LectureDao lectureDao = new LectureDao(conPool);
      
      int no = Integer.parseInt(req.getParameter("no"));
      
      Lecture lecture = lectureDao.selectOne(no);
      if (lecture == null) {
        throw new Exception(no + "번 회원이 없습니다.");
      }
      
      out.printf("<form action='Update' method='POST'>\n");
      out.printf("번호:<input type='text' name='no' value='%d' readonly><br>\n", lecture.getNo());
      out.printf("제목:<input type='text' name='titl' value='%s'><br>\n", lecture.getTitl());
      out.printf("설명:<input type='text' name='dscp' value='%s'><br>\n", lecture.getDscp());
      out.printf("시작일:<input type='data' name='sdt' value='%s'><br>\n", lecture.getSdt());
      out.printf("종료일:<input type='date' name='edt' value='%s'><br>\n", lecture.getEdt());
      out.printf("수강가능인원:<input type='number' name='qty' value='%d'><br>\n", lecture.getQty());
      out.printf("수업료:<input type='number' name='pric' value='%d'><br>\n", lecture.getPric());
      out.printf("총시간:<input type='number' name='thrs' value='%d'><br>\n", lecture.getThrs());
    //  out.printf("<select type='text' name='crmno' value='%s'>"
      		//+ "<option value='0'>" + "' + getNo + '","'</option><br>\n", lecture.getCrmno());
      						
//      out.printf("<option type='number' name='Mrno' value='%s'><br>\n", lecture.getMrno());
      
      out.println("<button>변경</button>");
      out.println("<button type='button' onclick='doDelete()'>삭제</button>");
      out.println("<button type='button' onclick='doList()'>목록</button>");
      out.println("</form>");
      
      out.println("<script>");
      out.println("function doDelete() {");
      out.printf("location.href = 'Delete?no=%s'\n", req.getParameter("no"));
      out.println("}");
      out.println("function doList() {");
      out.println("location.href = 'List'\n");
      out.println("}");
      out.println("</script>");
      
    } catch (Exception e) {
    	RequestDispatcher	rd = req.getRequestDispatcher("/Lecture/Error");
      rd.forward(req, res);
      return;
    }
    
    
    
    out.println("</body>");
    out.println("</html>");
  }
}




//
//<select id="fi-classroom" class="form-control">
//<option value="0">강의실을 선택하세요!</option>


