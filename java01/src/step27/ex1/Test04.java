/* 스프링 사용법: scope 속성으로 객체 생성 정책을 설정한다. */

package step27.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
  public static void main(String[] args) throws Exception {
    
    // 1) Spring 설정 파일 준비
    
    // 2) 설정 파일의 경로를 절대 경로로 지정할 때
    
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex1/application-context-03.xml");
    
    Object obj1 = ctx.getBean("c1");
    Object obj2 = ctx.getBean("c1");
    
    if (obj1 == obj2) System.out.println("obj1 == obj2");
    
    Object obj3 = ctx.getBean("c2");
    Object obj4 = ctx.getBean("c2");
    
    if (obj3 == obj4) System.out.println("obj3 == obj4");
    
    Object obj5 = ctx.getBean("c3");
    Object obj6 = ctx.getBean("c3");
    
    if (obj5 == obj6) System.out.println("obj5 == obj6");

  }
}