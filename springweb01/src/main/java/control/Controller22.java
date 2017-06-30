/* Spring WebMVC: 필터 다루기
 */
package control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/control/controller22/")
@SessionAttributes({"member2"})
public class Controller22 {
  
  @Autowired MyService service;

  @RequestMapping ("list")
  public String list(Model model) throws Exception {
    System.out.println("  Controller22.list() ===>");
    service.list();
    System.out.println("  <=== Controller22.list()");
    
    return "controller22_list";
  }
  
  @RequestMapping ("detail")
  public String detail(Model model) throws Exception {
    System.out.println("  Controller22.detail() ===>");
    service.detail();
    System.out.println("  <=== Controller22.detail()");
    
    return "controller22_detail";
  }
  
  
  @RequestMapping ("insert")
  public String insert(Model model) throws Exception {
    System.out.println("  Controller22.insert() ===>");
    service.insert();
    System.out.println("  <=== Controller22.insert()");
    
    return "controller22_insert";
  }
  
  @RequestMapping ("update")
  public String update(Model model) throws Exception {
    System.out.println("  Controller22.update() ===>");
    service.update();
    System.out.println("  <=== Controller22.update()");
    
    return "controller22_update";
  }
  
  @RequestMapping ("delete")
  public String delete(Model model) throws Exception {
    System.out.println("  Controller22.delete() ===>");
    service.delete();
    System.out.println("  <=== Controller22.delete()");
    
    return "controller22_delete";
  }
  
  
}

















