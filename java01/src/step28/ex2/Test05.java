package step28.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test05 {

	public static void main(String[] args) throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("step28/ex2/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		MemberDaoImpl memberDao = new MemberDaoImpl();
		memberDao.setSqlSessionFactory(sqlSessionFactory);
		
		
		Member m = new Member();
		m.setNo(59);
		m.setName("강사200xss");
		m.setEmail("kang200@test.comxss");
		m.setTel("1111-1111xss");
		m.setPassword("1111");
		
		System.out.println(memberDao.update(m));
		

	}

}
