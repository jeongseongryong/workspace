/* 스프링 사용법: 객체 생성하기 */

package step27.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  public static void main(String[] args) throws Exception {
    
    // 1) Spring 설정 파일 준비
    
    // 2) 설정 파일의 경로를 절대 경로로 지정할 때
    
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex1/application-context-02.xml");
    
    Car obj1 = (Car) ctx.getBean("c1");
    System.out.println(obj1);
    
    Car obj2 = (Car) ctx.getBean("c2");
    Car obj3 = (Car) ctx.getBean("c3");
    Car obj4 = (Car) ctx.getBean("c4");
    Car obj5 = (Car) ctx.getBean("c5");
    
    if(obj2 == obj5) {
      System.out.println("c2나 c5 모두 같은 객체이다.");
    }
    
    System.out.println(ctx.getBean("c6"));
    
    String [] aliases = ctx.getAliases("c7");
    for(String alias : aliases) {
      System.out.println(alias);
    }
    
    System.out.println(ctx.getBean("c10 c11 c12"));
    
    
    
    
  }
}
