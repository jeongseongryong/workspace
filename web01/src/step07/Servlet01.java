/* 서블릿끼리 값을 공유하는 방법
 * =>저장소를 이용하여 값을 공유 할 수 있다.
 * 1)ServletContext
 * 2)HttpSession
 * 3)ServletRequest
 * 4)PageContext
 */
package step07;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step07/Servlet01")
public class Servlet01  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    req.setAttribute("v1","hello");
    
    //ServletContext sc = req.getServletContext(); // ServletRequest를 통해 얻을 수 있다.
    ServletContext sc = this.getServletContext(); // HttpServlet 클래스로부터 상속 받은 메서드 를 통해서얻을 수 있다.
    sc.setAttribute("v2", "hi");
    
  }
}









