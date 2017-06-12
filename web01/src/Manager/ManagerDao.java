/* 역할:
 * => memb 테이블의 데이터를 다루는 메서드를 모아둔 클래스이다.
 * => 출력하는 역할은 호출자에게 맡긴다.
 * => DAO의 역할은 결과를 리턴하면 된다.
 * => 커넥션은 DBConnectionPool로부터 얻어서 사용하고,
 *    사용한 후에는 반납한다.
 * => DAO는 커넥션을 관리하지 않는다.
 */
package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;





public class ManagerDao {
  DBConnectionpool conPool;
  
  public ManagerDao(DBConnectionpool conPool) {
    this.conPool = conPool;
  }
  
  public List<Manager> selectList(int pageNo, int pageSize) throws Exception {
    Connection con = conPool.getConnection();

    try ( 
      PreparedStatement stmt = con.prepareStatement(
//      		"select mrno, posi, fax, path from mgr order by posi asc limit ?, ?");){
          "select m.mno, m.name, m.email, mr.posi from mgr mr inner join memb m on mr.mrno=m.mno order by m.name asc limit ?, ?");) {
      
      stmt.setInt(1, (pageNo - 1) * pageSize /* 시작 인덱스 */);
      stmt.setInt(2, pageSize /* 꺼낼 레코드 수 */);
      
      ArrayList<Manager> list = new ArrayList<>();
      
      try (ResultSet rs = stmt.executeQuery();) {
      	Manager manager = null;
        while (rs.next()) { 
        	manager = new Manager();
        	manager.setNo(rs.getInt("m.mno"));
        	manager.setName(rs.getString("m.name"));
        	manager.setFax(rs.getString("m.email"));
        	manager.setPath(rs.getString("mr.posi"));
          
          list.add(manager);
        }
      }
      return list;
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public Manager selectOne(int no) throws Exception {
    Connection con = conPool.getConnection();

    try ( 
      PreparedStatement stmt = con.prepareStatement(
          "select mrno, name, tel, eamil, posi, fax, path from mgr where mrno=?");) {
      
      stmt.setInt(1, no);
      
      try (ResultSet rs = stmt.executeQuery();) {
        if (!rs.next()) { 
          return null;
        }
        
        Manager manager = new Manager();
        manager.setNo(rs.getInt("mrno"));
        manager.setName(rs.getString("name"));
        manager.setTel(rs.getString("Tel"));
        manager.setEmail(rs.getString("email"));
      	manager.setPosi(rs.getString("posi"));
      	
        
        return manager;
      }
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int insert(Manager manager) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "insert into mgr(name, tel, email, posi, fax, path) values(?,?,?,?)");) {
      
    	stmt.setString(1, manager.getName());
    	stmt.setString(2, manager.getTel());
    	stmt.setString(3, manager.getEmail());
      stmt.setString(4, manager.getPosi());
      
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "delete from mgr where mrno=?");) {
      
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int update(Manager manager) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "update mgr set name=?, tel=?, email=?, posi=? where mrno=?");) {

    	stmt.setString(1, manager.getName());
    	stmt.setString(2, manager.getTel());
    	stmt.setString(3, manager.getEmail());
      stmt.setString(4, manager.getPosi());
      stmt.setString(5, manager.getFax());
      stmt.setString(6, manager.getPath());
      stmt.setInt(7, manager.getNo());
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  
}
