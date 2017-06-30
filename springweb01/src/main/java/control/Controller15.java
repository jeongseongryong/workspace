/* Spring WebMVC: Request Handler 의 리턴 값 다루기
 */
package control;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/control/controller15/") 
public class Controller15 {
  
  @RequestMapping ("ok1")
    public void ok1(HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");    
    PrintWriter out = response.getWriter();
    out.println("ok1(): 안녕하세요!");


  }

  
  @RequestMapping (path="ok2", produces="text/plain;charset=UTF-8")
  @ResponseBody
  public String ok2() throws Exception {
    return "ok2(): 안녕하세요!";
  }
  
  @RequestMapping (path="ok3")
  @ResponseBody
  public String ok3(HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    return "ok3(): 안녕하세요!";
  }
  
  @RequestMapping ("ok4")
  public String ok4() throws Exception {
    return "controller15_ok4";
  }
  
  @RequestMapping ("ok5")
  public void ok5() throws Exception {
    System.out.println("ok5()");
  }
  
  @RequestMapping ("ok6")
  public ModelAndView ok6() throws Exception {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("controller15_ok6");
    return mv;
  }
  
  @RequestMapping ("ok7")
  public ModelAndView ok7() throws Exception {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("controller15_ok7");
    mv.addObject("title","인간정성룡!");
    
    Member member = new Member();
    member.setName("정성룡");
    member.setAge(23);
    member.setWorking(false);
    mv.addObject("member", member);
    return mv;
  }
  
  @RequestMapping ("ok8")
  public String ok8(Model model) throws Exception {
    model.addAttribute("title","인간정성룡!");
    
    Member member = new Member();
    member.setName("정성룡");
    member.setAge(23);
    member.setWorking(false);
    model.addAttribute("member", member);
    return "controller15_ok8";
  }
  
  @RequestMapping ("ok9")
  public String ok9(Map<String,Object> map) throws Exception {
    map.put("title","인간정성룡!");
    
    Member member = new Member();
    member.setName("정성룡");
    member.setAge(23);
    member.setWorking(false);
    map.put("member", member);
    return "controller15_ok9";
  }
  
  @RequestMapping ("ok10")
  public ResponseEntity<String> ok10() throws Exception {
    HttpHeaders headers =new HttpHeaders();
    headers.add("Content-Type", "text/plain;charset=UTF-8");
    headers.add("aaaa", "ohra");
    
    return new ResponseEntity<String> (
        "안녕하세요!",
        headers,
        HttpStatus.OK);
    
  }
  
}

















