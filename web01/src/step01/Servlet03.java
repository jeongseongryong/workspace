/* 웹 애플리케이션 컴포넌트 : 서블릿 만들기 III -HttpServlet 추상 클래스 상속 받기
 * => HttpServlet?
 * 	-GenericServlet 클래스는 GET,POST,HEAD,PUT,DELETE 등의 요청을 구분하지 않고
 * 	무조건 service()
 */
package step01;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step01/Servlet03") //
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet03.doGet()");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet03.doPost()");
	}

	
}
