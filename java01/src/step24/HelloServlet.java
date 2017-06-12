/* 서블릿 만들기
 * servlet-api 검색 3.1.x 버전의 gradle 라이브러리 정복 복사
 * build.gradle 파일 dependencies {} 블록에추가
 * gradle eclipse
 * 프로젝트 새로고침
 */

package step24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet  implements Servlet {
		public HelloServlet() {
			System.out.println("HelloServlet()");
			
		}
		
	@Override // 안전함
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service()");
		
		res.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("Hello, world!");
		
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()");
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
		
	}

}
