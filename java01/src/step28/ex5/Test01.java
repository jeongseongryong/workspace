package step28.ex5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = 
        new ClassPathXmlApplicationContext("step28/ex5/application-context.xml");	
		
    System.out.println("-------------------------------------------");
    
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
    	System.out.printf("%s ====> %s\n", name,ctx.getBean(name));
    }
    System.out.println("-------------------------------------------");
    
    /*
		InputStream inputStream = Resources.getResourceAsStream("step28/ex5/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		TeacherDaoImpl teacherDao = new TeacherDaoImpl();
		teacherDao.setSqlSessionFactory(sqlSessionFactory);
     */
    
		TeacherDao teacherDao = ctx.getBean(TeacherDao.class);
		List<Teacher> list = teacherDao.selectList(1, 100);
		for(Teacher t : list) {
			System.out.printf("%d, %s, %s, %s, %s\n",
					t.getNo(), t.getName(), t.getEmail(), t.getTel(), t.getHomepage());
		}
		
	}

}
