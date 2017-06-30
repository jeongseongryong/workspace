/* Spring WebMVC: 클라이언트로 부터 JSP를 감추기 (WEB-INF 의 숨긴다)
 */
package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/control/controller18/") 
public class Controller18 {

  @RequestMapping ("ok1")
    public String ok1(Model model) throws Exception {
      Member member = new Member();
      member.setName("정성룡");
      member.setAge(23);
      member.setWorking(false);
      model.addAttribute("member", member);
     
      return "controller18_ok1";
  }
  
}


















