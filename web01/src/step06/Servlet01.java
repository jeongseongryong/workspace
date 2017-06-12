/* 서블릿끼리 값을 공유하는 방법
 * =>저장소를 이용하여 값을 공유 할 수 있다.
 * 1)ServletContext
 * 2)HttpSession
 * 3)ServletRequest
 * 4)PageContext
 */
package step06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step06/Servlet01")
public class Servlet01  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    req.setAttribute("v1","hello");

    	RequestDispatcher rd = req.getRequestDispatcher("/step06/Servlet02");
    	rd.forward(req, res);  
  }
}








