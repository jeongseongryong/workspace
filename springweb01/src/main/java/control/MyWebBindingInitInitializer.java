package control;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class MyWebBindingInitInitializer implements WebBindingInitializer{

  @Override
  public void initBinder(WebDataBinder binder, WebRequest request) {
    System.out.println("MyWebBindingInitializer.initBinder()...");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false);
    binder.registerCustomEditor(
        java.util.Date.class,
        new CustomDateEditor(dateFormat, false));

  }


}
