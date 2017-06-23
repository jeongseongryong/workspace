/* 파일 업로드: POST 요청 데이터 형식 - application/x-www-form-urlencoded
 * =>multipart/form-data
 *   웹브라우저 -> 웹 서버 바이너리 포함한 데이터를 보낼 때 사용하는 인코딩 방식
 *   보내는 요청 방식 POST
 *   일반적인 형식인 "변수=값&변수=값&..." 이 아닌,
 *   바이너리 데이터를 보내기 적합한 형식으로 보낸다.
 * => application/x-www-form-urlencoded
 * 		POST 요청할때 서버에 보내는 데이터를 이 형식으로 가공한다.
 * 		
 * 
 * 		숫자를 7비트 아스키 코드로 바꾸는것을 URL인코딩이라고한다.
 * 		
 */
package step14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step14/Servlet01")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet {
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String file1 = req.getParameter("file1");
		String file2 = req.getParameter("file2");
		
		resp.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.printf("name=%s\n", name);
		out.printf("file1=%s\n", file1);
		out.printf("file2=%s\n", file2);
		
	}
	
	
	
}
