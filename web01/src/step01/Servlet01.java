/* 웹 애플리케이션 컴포넌트
 * =>웹 애플리케이션을 구성하고 있는 구성 요소를 말함
 * 1)서블릿
 			-클라이언트의 요청을 처리함
 * 2)필터
      -서블릿을 실행하기 전이나 후에 작업을 수행함
 * 3)리스너
 			-서블릿 컨테이너가 특정 상황에서 작업하는 객체
 			-그 객체를 "리스너(listener)"라 부른다.
 * 
 *	서블릿 만들기	
 */
package step01;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step01/Servlet01") //
public class Servlet01 implements Servlet {
	public Servlet01() { 
		System.out.println("Servlet01()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet01.init()");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Servlet01.getServletConfig()");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet01.service()");
		
	}

	@Override
	public String getServletInfo() {
		System.out.println("Servlet01.getServletInfo()");
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("Servlet01.destroy()");
		
	}
}