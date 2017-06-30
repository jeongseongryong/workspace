/* Mybatis 퍼시스턴스 프레임워크: 동적 SQL 만드는 법 */
package step28.ex5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("step28/ex5/application-context.xml");
    
    System.out.println("-------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    
    for (String name : names) {
      System.out.printf("%s ===>%s\n", name, ctx.getBean(name));
    }
    
    System.out.println("-------------------------");
    
    TeacherDao teacherDao = ctx.getBean(TeacherDao.class);
    // 인터페이스 구현한놈 꺼내 
    
    List<Teacher> list = teacherDao.selectList(1, 100);

    for (Teacher t : list) {
      System.out.printf("%d, %s, %s, %s, %s\n", t.getNo(), t.getName(), t.getEmail(), t.getTel(), t.getHomepage());
    }
    
  }
}
