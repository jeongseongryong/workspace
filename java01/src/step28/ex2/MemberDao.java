package step28.ex2;
/* 역할:
 * => memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스이다.
 * => 출력하는 역할은 호출자에게 맡긴다.
 * => DAO의 역할은 결과를 리턴하면 된다.
 * => 커넥션은 DBConnectionPool로부터 얻어서 사용하고,
 *    사용한 후에는 반납한다.
 * => DAO는 커넥션을 관리하지 않는다.
 */


import java.util.List;

public interface MemberDao {

   List<Member> selectList(int pageNo, int pageSize) throws Exception;
   List<Member> selectListByEmail(int pageNo, int pageSize, String email) throws Exception;
   List<Member> selectListByName(int pageNo, int pageSize, String name) throws Exception;
   List<Member> selectListByTel(int pageNo, int pageSize, String tel) throws Exception;
   
   Member selectOne(int no) throws Exception;

   Member selectOneByEmailPassword(String email, String password) throws Exception;
  
   int insert(Member member) throws Exception;
  
   int delete(int no) throws Exception;
  
   int update(Member member) throws Exception;
  
  
}
