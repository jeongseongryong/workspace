/* Spring WebMVC: 요청 프로토콜의  Content-Type 헤더의 값에 따라 호출될 메서드 결정
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller10/") 
public class Controller10 {

  @RequestMapping(path="ok", consumes="text/plain") //지정된 헤더가있을경우
  public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("text/plain 데이터를 받아서 처리했음!");
  }
  
  @RequestMapping (path="ok", consumes="application/json")
  public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("application/json 데이터를 받아서 처리했음!");
  }
}


















