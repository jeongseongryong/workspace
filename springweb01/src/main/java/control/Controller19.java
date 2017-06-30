/* Spring WebMVC: 클라이언트로 부터 JSP를 감추기 (WEB-INF 의 숨긴다)
 */
package control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/control/controller19/") 
public class Controller19 {

  @RequestMapping ("ok1")
    public String ok1(Model model) throws Exception {
      return "controller19_ok1";
  }
  
  @RequestMapping ("ok2")
  public String ok2(String name,HttpSession session) throws Exception {
    Member member = new Member();
    member.setName(name);
    session.setAttribute("member", member);
    return "controller19_ok2";
}
  
  @RequestMapping ("ok3")
  public String ok3(int age, HttpSession session) throws Exception {
    Member member = (Member)session.getAttribute("member");
    member.setAge(age);
    
    return "controller19_ok3";
  }
  
  @RequestMapping ("ok4")
  public String ok4(boolean working, HttpSession session) throws Exception {
    Member member = (Member)session.getAttribute("member");
    member.setWorking(working);
    
    return "controller19_ok4";
  }
  
  @RequestMapping ("reset")
  @ResponseBody
  public String reset(HttpSession session, SessionStatus status) throws Exception {
    //status.setComplete();
    
    session.invalidate();
    
    // session.removeAttribute("member2");
    
    return "Completed the Httpsession";
  }
  
}

















