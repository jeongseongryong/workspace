/* service() 파라미터 II : ServletRepose II - 한글 출력이 깨지는 현상
 * "서블릿 컨테이너"는 출력할 때 "2바이트 유니코드"를
 * 	"ISO-8859-1" 문자집합으로 인코딩하여 내보낸다.
 * 
 * 	서블릿 컨테이너에게 어떤 문자집합으로 인코딩해서 내보낼 것인지 알려줘라!
 * 	res.setContentType("text/plain;charset=UTF-8);
 * 	주의! 위의 메서드를 호출한 후에 출력 스트림을 꺼내야 한다. 호출전 꺼내면 소용 X
 */
package step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step02/Servlet05") //
public class Servlet05 extends GenericServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {		
		// 출력 스트림을 얻기 전에 호출해야 한다.
		res.setContentType("text/plain;charset=UTF-8");
		
		PrintWriter out = res.getWriter();		
		
		// 출력 스트림을 얻은 후에 호출해봐야 소용없다
		//res.setContentType("text/plain;charset=UTF-8");
		out.println("Hello, world");
		out.println("안녕하세요");
			
	}
}
