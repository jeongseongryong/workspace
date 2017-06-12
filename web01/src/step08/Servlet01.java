/* 웹 어플리케이션에서 사용할 자원을 준비하는 방법:서블릿 이용하기
 * 
 * 문제점
 * -init()메서드에서 자원을 준비한다.
 * -init()메서드는 서브릿 객체가 생성할 때 호출된다.
 * -객체는 클라이언트로 부터 최소의 요청을 들어왔을때 생성
 *  요청하지 않으면 생성되지 한음
 *  생성되지않으면 init() 호출 되지 않는다
 *  껐다 켰다 할때마다 반복해야되는 번거로움이있다
 */
package step08;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step08/Servlet01")
public class Servlet01  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() throws ServletException {
  	// Servlet 인터페이스의 init(ServletConfig) 메서드 대신에
  	// 이 메서드를 오버라이딩 하라고 GenericServlet 클래스에서 제공해준다.
  	// 개발자는 서블릿이 생성될 때 뭔가를 준비시키고 싶다면, 오리지널 init(ServletConfig) 대신 이 메서드를 오버라이딩 하여 코드를 작성하라
  	System.out.println("========> step08.Servlet01.init()");
  	ServletContext sc = this.getServletContext();
  	sc.setAttribute("v1", "hello");
  }
  
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
  	System.out.println("========> step08.Servlet01.service()");
  }
}









