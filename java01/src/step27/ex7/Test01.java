/* 스프링 사용법: java.sql.Date.valueOf("2017-06-21") 호출하기
 */
package step27.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("step27/ex7/application-context-01.xml");
    
   
    System.out.println("-------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
    	System.out.println(ctx.getBean(name));
    }
  }
}

