package step28.ex4;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test02 {

	public static void main(String[] args) throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("step28/ex4/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		TeacherDaoImpl teacherDao = new TeacherDaoImpl();
		teacherDao.setSqlSessionFactory(sqlSessionFactory);
		
		Teacher teacher = teacherDao.selectOne(63);
		
		System.out.println(teacher);
	
	}

}
