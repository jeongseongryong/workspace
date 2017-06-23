package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/CookieReader01")
public class CookieReader01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
	
		Cookie[] cookies = req.getCookies();
		
				
		if(cookies != null) {
		 for(Cookie cookie : cookies) {
			 out.printf("%s=%s\n", 
					 cookie.getName(), //이름
					 cookie.getValue());//값
					 
		  }
		} else {
			out.println("쿠키가 한 개도 없네요");
		}
	}
}
