package step27.ex10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("step27/ex10/application-context-01.xml");
    
   
    System.out.println("-------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
    	System.out.println(ctx.getBean(name));
    }
  }
}

