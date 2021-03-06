package control;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class MyControlAdvice {
  
  @InitBinder
  protected void initBinder(WebDataBinder binder) {
    System.out.println("MyControlAdvice.initBinder()...");
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      dateFormat.setLenient(false);
      binder.registerCustomEditor(
          java.util.Date.class,
          new CustomDateEditor(dateFormat, false));
  }  
}
