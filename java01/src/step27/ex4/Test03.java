/* 스프링 사용법: java.sql.Date.valueOf("2017-06-21") 호출하기
 */
package step27.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("step27/ex4/application-context-03.xml");
    
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
    	System.out.println(ctx.getBean(name));
    }
  }
}






