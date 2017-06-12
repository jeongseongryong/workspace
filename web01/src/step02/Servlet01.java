/* service() 파라미터 I : ServletRequest I
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

@WebServlet(urlPatterns="/step02/Servlet01") //
public class Servlet01 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.printf("RemoteHost: %s\n", req.getRemoteHost());// 클라이언트 이름
		System.out.printf("RemoteAddr: %s\n", req.getRemoteAddr());// 클라이언트 주소(IP)
		System.out.printf("RemotePort: %s\n", req.getRemotePort());// 클라이언트 포트번호
		System.out.printf("Scheme: %s\n", req.getScheme()); // 프로토콜 명
		System.out.printf("parameter(name): %s\n",req.getParameter("name"));//name 파라미터값
		System.out.printf("parameter(age): %s\n",req.getParameter("age")); // age 파라미터값
		
	}

	
}
