/* 역할:
 * => memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스이다.
 * => 출력하는 역할은 호출자에게 맡김
 */
package step22.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;

public class MemberDao  {
  DBConnectionpool conPool;
  
  public MemberDao( DBConnectionpool conpool)  {
  	this.conPool = conpool;
  }
  
  public List<Member> selectList() throws Exception{
  	 Connection con = conPool.getConnection();
    try (         
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");) {
    	
    	ArrayList<Member> list = new ArrayList<>();
    	Member member = null;
      while (rs.next()) { 
      	member = new Member();
      	member.setNo(rs.getInt("mno"));
      	member.setName(rs.getString("name"));
      	member.setTel(rs.getString("tel"));
      	member.setEmail(rs.getString("email"));   
      	
      	list.add(member);
      }
      return list;
      
    } finally { // 다 쓴 커넥션을 반납하기 위해
    	conPool.returnConnection(con);
    } 
  }
  


	public void insert(Member member) throws Exception {
		Connection con = conPool.getConnection();
    try (
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name,tel,email,pwd) values(?,?,?,password(?))");) {
    	
        stmt.setString(1, member.getName());
        stmt.setString(2, member.getTel());
        stmt.setString(3, member.getEmail());
        stmt.setString(4, member.getPassword());
        int count = stmt.executeUpdate();

        System.out.println(count);
      }
    finally { 
  	conPool.returnConnection(con);
    }
  }
  
  
  public int delete(int no) throws Exception { 
  	Connection con = conPool.getConnection();
  	//삭제할 데이터의 넘버를 받아서 sql에 인파라미터의 넣고  delete을 실행 삭제한 개수를 리턴한다.
    try (       
        PreparedStatement stmt = con.prepareStatement(
            "delete from memb where mno=?");) {
    	
        stmt.setInt(1, no);        
        return stmt.executeUpdate();              
      
  			}finally { 
      	conPool.returnConnection(con);
  		}
  }
  
  public void update(Member member) throws Exception {
  	Connection con = conPool.getConnection();
  	// 업데이트할 데이터의 네임 텔 이메일 패스워드 를 받아서
    try (
        PreparedStatement stmt = con.prepareStatement(
            "update memb set name=?, tel=?, email=?, pwd=password(?) where mno=?");) {
        stmt.setString(1, member.getName());
        stmt.setString(2, member.getTel());
        stmt.setString(3, member.getEmail());
        stmt.setString(4, member.getPassword());
				stmt.setInt(5, member.getNo());
        int count = stmt.executeUpdate();
        
      } 
	finally { 
  	conPool.returnConnection(con);
	}
  }
  
}
