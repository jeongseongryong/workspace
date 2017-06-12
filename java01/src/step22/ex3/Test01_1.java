/* JDBC 프로그래밍 II: DAO에서 출력 기능 제거,데이터 처리만 하도록 변경
 * => memb 테이블의 값을 저장할 새로운 데이터 타입을 정의한다.
 */
package step22.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class Test01_1 {

  public static void main(String[] args) throws Exception {
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    //DB 커넥션을 관리한 객체를 만든다.
    DBConnectionpool conPool = new DBConnectionpool(
    		jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    
    // DAO에 DB 커넥션을 풀을 전달한다.
    MemberDao memberDao = new MemberDao(conPool);
    
    List<Member> list = memberDao.selectList();
    for (Member m : list) {
    	System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    System.out.println("-------------------------");
    
    /*
    System.out.println(memberDao.delete(100));
    System.out.println("-------------------------");
    
    Member member = new Member();
    member.setName("홍길동104");
    member.setTel("1111-1111");
    member.setEmail("howoo104@test.com");
    member.setPassword("1111");
    
    System.out.println(memberDao.insert(member));
    System.out.println("-------------------------");    
    */
    
    Member member = new Member();
    member.setNo(101);
    member.setName("홍길동 변경");
    member.setTel("1111-2221");
    member.setEmail("howoo105@test.com");
    member.setPassword("1111");
    
    
    memberDao.update(member);
    System.out.println("-------------------");
    
    
    list = memberDao.selectList();
    for (Member m : list) {
    	System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getTel(), m.getEmail());
    }
    System.out.println("-------------------------");
  }
}





