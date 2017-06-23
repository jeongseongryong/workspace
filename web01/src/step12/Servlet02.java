package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step12/Servlet02")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// => 쿠키의 이름은 'ISO-8859-1' 이어야 한다. 즉 한글인 안된다.
		// 쿠키의 값은 문자열 이어야 한다. 숫자는 ㄴㄴ
		// 한글을 저장하고 싶다면 URL 인코딩 하여 저장하라!
		Cookie cookie = new Cookie("c2", "bbbb");
		
		cookie.setPath(req.getContextPath()); // getContextPath() --> "/web01"
		resp.addCookie(cookie);
		
		resp.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("Servlet02:쿠기 보냄");
	}
}
