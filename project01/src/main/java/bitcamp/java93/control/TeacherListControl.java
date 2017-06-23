package bitcamp.java93.control;
/* ServletContext 보관소에 저장된 MemberDao 이용하기 
 */

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bitcamp.java93.domain.Teacher;
import bitcamp.java93.service.TeacherService;

@Component("/teacher/list")
public class TeacherListControl  implements Controller {
	@Autowired
	TeacherService teacherService;
	
	@Override
  public String service(HttpServletRequest req, HttpServletResponse res) throws Exception {
    int pageNo = 1;
    int pageSize = 5;
    
    try { 
      pageNo = Integer.parseInt(req.getParameter("pageNo"));
    } catch (Exception e) {}
    
    try { 
      pageSize = Integer.parseInt(req.getParameter("pageSize"));
    } catch (Exception e) {}
    
     		
      List<Teacher> list = teacherService.list(pageNo, pageSize);
      req.setAttribute("list", list);
      return  "/teacher/list.jsp"; 

  }
}
