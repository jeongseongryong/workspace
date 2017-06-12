/* 작업을 나눠서 처리하기: 인클루딩
 * 인클루딩(including)
 * 	-잠시 실행을 위임한 후 작업이 끝나면 다시 돌아온다.
 *  -기존의 출력은 계속 유효하다
 */
package step05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step05/Servlet02/a")
// http://localhost:8080/web01/step05/Servlet01?a=10&b=20&op=%2b
public class Servlet02_A  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
    PrintWriter out = res.getWriter();   
    out.println("<h2>Servlet02_A에서 출력!---------------</h2>");
  }
}








