/* Spring WebMVC: Request Handler(요청을 처리하는 메서드)의 파라미터들 II - @RequestParam
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/control/controller12/") 
public class Controller12 {

  @RequestMapping ("ok1")
  public void ok1(
      String name,
      int age,
      boolean working,
      HttpServletResponse response) throws Exception {
	response.setContentType("text/plain;charset=UTF-8");    
	PrintWriter out = response.getWriter();
    out.println("ok1()");
    out.printf("name:%s\n", name);
    out.printf("age:%d\n", age);
    out.printf("working:%b\n", working);
  
  }
  
  @RequestMapping ("ok2")
  public void ok2(
      @RequestParam(name="name")String n,
      @RequestParam(name="age") int a,
      @RequestParam(name="working") boolean w,
      HttpServletResponse response) throws Exception {
	response.setContentType("text/plain;charset=UTF-8");    
	PrintWriter out = response.getWriter();
    out.println("ok2()");
    out.printf("name:%s\n", n);
    out.printf("age:%d\n", a);
    out.printf("working:%b\n", w);
  
  }
  
  @RequestMapping ("ok3")
  public void ok3(
      @RequestParam(name="name", required=false)String n,
      @RequestParam(name="age", required=false) int a,
      @RequestParam(name="working", required=false) boolean w,
      HttpServletResponse response) throws Exception {
  response.setContentType("text/plain;charset=UTF-8");    
  PrintWriter out = response.getWriter();
    out.println("ok3()");
    out.printf("name:%s\n", n);
    out.printf("age:%d\n", a);
    out.printf("working:%b\n", w);
  
  }
  
  @RequestMapping ("ok4")
  public void ok4(
      @RequestParam(name="name", required=false)String n,
      @RequestParam(name="age", required=false, defaultValue="0") int a,
      @RequestParam(name="working", required=false, defaultValue="false") boolean w,
      HttpServletResponse response) throws Exception {
  response.setContentType("text/plain;charset=UTF-8");    
  PrintWriter out = response.getWriter();
    out.println("ok4()");
    out.printf("name:%s\n", n);
    out.printf("age:%d\n", a);
    out.printf("working:%b\n", w);
  
  }
  
  @RequestMapping ("ok5")
  public void ok5(Member member, HttpServletResponse response) throws Exception {
  response.setContentType("text/plain;charset=UTF-8");    
  PrintWriter out = response.getWriter();
    out.println("ok5()");
    out.printf("name:%s\n", member.getName());
    out.printf("age:%d\n", member.getAge());
    out.printf("working:%b\n", member.isWorking());
  
  }
  
}


















