/* Spring WebMVC: 요청 http method 구분하기
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/control/controller06/") 
public class Controller06 {

  @RequestMapping(path="ok", method=RequestMethod.GET) // value 넣어도 되고  path라 넣어도된다.
  public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("get!");
  }
  
  @RequestMapping (path="ok", method=RequestMethod.POST)
  public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    out.println("post!");
  }
}


















