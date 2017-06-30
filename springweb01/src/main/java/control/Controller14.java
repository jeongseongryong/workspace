/* Spring WebMVC: Request Handler(요청을 처리하는 메서드)의 파라미터들 II - 커스텀 프로퍼티 에디터
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller14/") 
public class Controller14 {
  
  @RequestMapping ("ok1")
  public void ok1(
      String name,
      java.util.Date date,
      boolean working,
      HttpServletResponse response) throws Exception {
  response.setContentType("text/plain;charset=UTF-8");    
  PrintWriter out = response.getWriter();
    out.println("ok1()");
    out.println(name);
    out.println(date);

  }

}

















