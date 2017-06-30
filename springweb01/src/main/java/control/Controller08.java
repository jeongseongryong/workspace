/* Spring WebMVC: 요청 프로토콜의 헤더 이름을 요청 조건으로 지정
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller08/") 
public class Controller08 {

  @RequestMapping(path="ok", headers="aaaa") //지정된 헤더가있을경우
  public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("aaaa 있어요!");
  }
  
  @RequestMapping (path="ok", headers={"bbbb", "cccc"})
  public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("bbbb와 cccc 있어요!");
  }
}


















