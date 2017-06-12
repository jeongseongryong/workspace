/* 역할:
 * => memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스이다.
 * => 출력하는 역할은 호출자에게 맡긴다.
 * => DAO의 역할은 결과를 리턴하면 된다.
 * => 커넥션은 DBConnectionPool로부터 얻어서 사용하고,
 *    사용한 후에는 반납한다.
 * => DAO는 커넥션을 관리하지 않는다.
 */
package Lecture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassroomDao {
  DBConnectionpool conPool;
  
  public ClassroomDao(DBConnectionpool conPool) {
    this.conPool = conPool;
  }
  
  public List<Classroom> selectList(int pageNo, int pageSize) throws Exception {
    Connection con = conPool.getConnection();

    try ( 
      PreparedStatement stmt = con.prepareStatement(
          "select crmno, name from croom order by name asc limit ?, ?");) {
      
      stmt.setInt(1, (pageNo - 1) * pageSize /* 시작 인덱스 */);
      stmt.setInt(2, pageSize /* 꺼낼 레코드 수 */);
      
      ArrayList<Classroom> list = new ArrayList<>();
      
      try (ResultSet rs = stmt.executeQuery();) {
        Classroom croom = null;
        while (rs.next()) { 
        	croom = new Classroom();
        	croom.setNo(rs.getInt("crmno"));
        	croom.setName(rs.getString("name"));
         
          list.add(croom);
        }
      }
      return list;
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public Classroom selectOne(int no) throws Exception {
    Connection con = conPool.getConnection();

    try ( 
      PreparedStatement stmt = con.prepareStatement(
          "select crmno, name from croom where crmno=?");) {
      
      stmt.setInt(1, no);
      
      try (ResultSet rs = stmt.executeQuery();) {
        if (!rs.next()) { 
          return null;
        }
        
        Classroom croom = new Classroom();
        croom.setNo(rs.getInt("crmno"));
        croom.setName(rs.getString("name"));       
        return croom;
      }
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int insert(Classroom croom) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "insert into croom(name) values(?)");) {
      
      stmt.setString(1, croom.getName());
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "delete from croom where crmno=?");) {
      
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int update(Classroom croom) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "update croom set name=? where crmno=?");) {
      
      stmt.setString(1, croom.getName());     
      stmt.setInt(2, croom.getNo());
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  
}
