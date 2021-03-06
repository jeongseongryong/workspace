/* Spring WebMVC: 파일 업로드 처리하기
 */
package control;

import java.io.File;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/control/controller16/") 
public class Controller16 {
  
  @Autowired ServletContext servletContext;
  
  @RequestMapping ("ok1")
  @ResponseBody
    public String ok1(String name, int age, MultipartFile file1, MultipartFile file2) throws Exception {
      System.out.println(name);
      System.out.println(age);
      System.out.println(file1);
      System.out.println(file2);
      System.out.println("-------------------------------");
      return "controller16_ok1";
  }
  
  @RequestMapping ("ok2")
  @ResponseBody
    public String ok2(String name, int age, MultipartFile file1, MultipartFile file2) throws Exception {
      System.out.println(name);
      System.out.println(age);
      
      if(!file1.isEmpty()) {
        System.out.println("-------------------------------------");
        System.out.printf("파일명: %s\n", file1.getOriginalFilename());
        System.out.printf("파라미터명: %s\n", file1.getName());
        System.out.printf("파일 크기: %d\n", file1.getSize());
        System.out.printf("파일 크기: %s\n", file1.getContentType());
      }
      
      if(!file2.isEmpty()) {
        System.out.println("-------------------------------------");
        System.out.printf("파일명: %s\n", file2.getOriginalFilename());
        System.out.printf("파라미터명: %s\n", file2.getName());
        System.out.printf("파일 크기: %d\n", file2.getSize());
        System.out.printf("파일 크기: %s\n", file2.getContentType());
      }
      
      return "controller16_ok2";
  }
  
  @RequestMapping ("ok3")
    public String ok3(String name, int age, MultipartFile file1, MultipartFile file2, Model model) throws Exception {
    
    model.addAttribute("name", name);
    model.addAttribute("age", age);
    
      if(!file1.isEmpty()) {
        String filename = getNewFilename();
        model.addAttribute("file1", filename);
        
        file1.transferTo(new File(
            servletContext.getRealPath("/upload/" + filename)));
      }
      
      if(!file2.isEmpty()) {
        String filename = getNewFilename();
        model.addAttribute("file2", filename);
        
        file2.transferTo(new File(
            servletContext.getRealPath("/upload/" + filename)));
      }
      
      return "controller16_ok3";
  }
  
  int count = 0;
  synchronized private String getNewFilename() {
    if (count > 100) {
      count = 0;
    }
    return String.format("%d_%d" , System.currentTimeMillis(), ++count);
  }
  
}


















