/* 스프링 사용법: Spring IoC 컨테이너 준비 I */

package step27.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) {
    
    // 1) Spring 설정 파일 준비
    
    // 2) classpath 에 설정 파일이 있을 때
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step27/ex1/application-context-01.xml");
    
  }
}
