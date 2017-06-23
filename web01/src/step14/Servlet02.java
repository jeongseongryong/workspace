/* 파일 업로드: POST 요청 데이터 형식 - multipart/form-data
 * =>multipart/form-data
 *   
 *------WebKitFormBoundaryWB8HgkotdvgSx7YX (식별자)
	Content-Disposition: form-data; name="name"
	(빈줄)
	홍길동
	------WebKitFormBoundaryWB8HgkotdvgSx7YX
	Content-Disposition: form-data; name="file1"; filename="oh.jpg"
	Content-Type: image/jpeg 
	
	데이터 .... (jpge가 어떤형식인지 나타낸다) 

	------WebKitFormBoundaryWB8HgkotdvgSx7YX
	Content-Disposition: form-data; name="file2"; filename="oh.jpg"
	Content-Type: image/jpeg
	
	데이터 .... (jpge가 어떤형식인지 나타낸다) 
	
	------WebKitFormBoundaryWB8HgkotdvgSx7YX--
 */
package step14;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step14/Servlet02")
@SuppressWarnings("serial")
public class Servlet02 extends HttpServlet {
		
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
