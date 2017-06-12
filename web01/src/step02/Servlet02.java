/* service() 파라미터 II : ServletRequest II - 파라미터 값 전달하고 받기
 * GET 예)http://localhost:8080/web01/Servlet02?파라미터명=값&파라미터명=값
 * POST -message-body 에붙인다.
 * 예) POST /step02/Servlet02 HTTP/1.1
 * 		Host:...
 * 		User-Agent:...
 * 
 * 		파라미터명=값&파라미터명=값
 * 
 *  -http://localhost:8080/web01/Servlet02.html
 */
package step02;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step02/Servlet02") //
public class Servlet02 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.printf("parameter(name): %s\n",req.getParameter("name"));//name 파라미터값
		System.out.printf("parameter(age): %s\n",req.getParameter("age")); // age 파라미터값
		
	}

	
}
