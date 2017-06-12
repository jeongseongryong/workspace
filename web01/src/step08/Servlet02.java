/* 웹 어플리케이션에서 사용할 자원을 준비하는 방법:서블릿 이용하기
 * 
 * 
 */
package step08;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/step08/Servlet02", loadOnStartup=1)
public class Servlet02  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() throws ServletException {
  	// Servlet 인터페이스의 init(ServletConfig) 메서드 대신에
  	// 이 메서드를 오버라이딩 하라고 GenericServlet 클래스에서 제공해준다.
  	// 개발자는 서블릿이 생성될 때 뭔가를 준비시키고 싶다면, 오리지널 init(ServletConfig) 대신 이 메서드를 오버라이딩 하여 코드를 작성하라
  	System.out.println("========> step08.Servlet02.init()");
  	ServletContext sc = this.getServletContext();
  	sc.setAttribute("v2", "hi");
  }
}









