/* 화면 전환하기 : HTTP 응답의 status 코드를 사용하여 화면전환
 */
package step04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/step04/Servlet03")
public class Servlet03  extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
   
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();

    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("  <meta charset='UTF-8'>");
    out.println("  <title>리다이렉트</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>이 내용은 클라이언트로 보내지 않습니다.</h1>");
    // 일부러 버퍼를 초과하게 만들기 위해 버퍼 크기를 넘는 값을 출력
    for (int i = 0; i <1000; i++) {
    	out.println("1234567890");
    }
    out.println("</body>");
    out.println("</html>");
    // 버퍼에 저장된다 ,클라이언트에 보내진 상태가아님
    HttpServletResponse httpRes = (HttpServletResponse) res;
    if (req.getParameter("page") == null) {
    	httpRes.sendRedirect("Servlet01/a");
    } else if (req.getParameter("page").equals("b")) {
    	httpRes.sendRedirect("Servlet01/b");
    }
    
    
    /* sendRedirect()를 호출 하면 이전에 출력된 내용은취소된다
    	질문) 아니 이미 클라이언트로 출력했는데 어떻게 취소함?
    	답:
     	서블릿에서 응답하게 되면 그 모든 출력은 내부 버퍼에 임시 보관된다.
     	보통 버퍼의 크기는 8KB이다.
     	물론 서버 설정에서 이 크기를 바꿀수있다.
     	그래서 sendRedirect()를 호출할 떄 기존 에 버퍼로 출력된 것을 취소할 수 있는 것이다.
     	질문) 그렇다면 만약 위에서 버퍼크기를 넘치게 출력한다면?
     	버퍼 크기를 초과하면 자동으로 클라이언트 보낸다.
     	이렇게 일단 클라이언트로 출력하게 되면 sendRedirect()를 사용 할수 없다
     	즉 응답한 sendRedirect()를  후에 호출할수있다
     	
     	
    */ 
  }
}









