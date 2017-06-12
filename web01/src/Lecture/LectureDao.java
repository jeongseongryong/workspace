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

public class LectureDao {
  DBConnectionpool conPool;
  
  public LectureDao(DBConnectionpool conPool) {
    this.conPool = conPool;
  }
  
  public List<Lecture> selectList(int pageNo, int pageSize) throws Exception {
    Connection con = conPool.getConnection();

    try ( 
      PreparedStatement stmt = con.prepareStatement(
          "select lno, titl, dscp, sdt, edt, qty, pric, thrs from lect order by lno asc limit ?, ?");) {
      
      stmt.setInt(1, (pageNo - 1) * pageSize /* 시작 인덱스 */);
      stmt.setInt(2, pageSize /* 꺼낼 레코드 수 */);
      
      ArrayList<Lecture> list = new ArrayList<>();
      
      try (ResultSet rs = stmt.executeQuery();) {
      	Lecture lecture = null;
        while (rs.next()) { 
        	lecture = new Lecture();
        	lecture.setNo(rs.getInt("lno"));
        	lecture.setTitl(rs.getString("titl"));
        	lecture.setDscp(rs.getString("dscp"));
        	lecture.setSdt(rs.getString("sdt"));
        	lecture.setEdt(rs.getString("edt"));
        	lecture.setQty(rs.getInt("qty"));
        	lecture.setPric(rs.getInt("pric"));
        	lecture.setThrs(rs.getInt("thrs"));
        	
          
          list.add(lecture);
        }
      }
      return list;
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public Lecture selectOne(int no) throws Exception {
    Connection con = conPool.getConnection();

    
    try ( 
      PreparedStatement stmt = con.prepareStatement(
          "select lno, titl, dscp, sdt, edt, qty, pric, thrs, crmno, mrno from lect where lno=?");) {
    	
    	
      stmt.setInt(1, no);
      
      try (ResultSet rs = stmt.executeQuery();) {
        if (!rs.next()) { 
          return null;
        }
        
        Lecture lecture = new Lecture();
        lecture = new Lecture();
      	lecture.setNo(rs.getInt("lno"));
      	lecture.setTitl(rs.getString("titl"));
      	lecture.setDscp(rs.getString("dscp"));
      	lecture.setSdt(rs.getString("sdt"));
      	lecture.setEdt(rs.getString("edt"));
      	lecture.setQty(rs.getInt("qty"));
      	lecture.setPric(rs.getInt("pric"));
      	lecture.setThrs(rs.getInt("thrs"));
      	lecture.setCrmno(rs.getInt("crmno"));
     		lecture.setMrno(rs.getInt("mrno"));
        return lecture;
      }
      
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int insert(Lecture lecture) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "insert into lect(titl, dscp, sdt, edt, qty, pric, thrs, Crmno, Mrno) values(?,?,?,?,?,?,?,?,?)");) {
      
      stmt.setString(1, lecture.getTitl());
      stmt.setString(2, lecture.getDscp());
      stmt.setString(3, lecture.getSdt());
      stmt.setString(4, lecture.getEdt());
      stmt.setInt(5, lecture.getQty());
      stmt.setInt(6, lecture.getPric());
      stmt.setInt(7, lecture.getThrs());
      stmt.setInt(8, lecture.getCrmno());
      stmt.setInt(9, lecture.getMrno());
      
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "delete from lect where lno=?");) {
      
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  public int update(Lecture lecture) throws Exception {
    Connection con = conPool.getConnection();
    try (
      PreparedStatement stmt = con.prepareStatement(
          "update lect set titl=?, dscp=?, sdt=?, edt=?, qty=?, pric=?, thrs=?, crmno=?, mrno=? where lno=?");) {
      
      stmt.setString(1, lecture.getTitl());
      stmt.setString(2, lecture.getDscp());
      stmt.setString(3, lecture.getSdt());
      stmt.setString(4, lecture.getEdt());
      stmt.setInt(5, lecture.getQty());
      stmt.setInt(6, lecture.getPric());
      stmt.setInt(7, lecture.getThrs());
      stmt.setInt(8, lecture.getNo());
      stmt.setInt(9, lecture.getCrmno());
      stmt.setInt(10, lecture.getMrno());
      return stmt.executeUpdate();
    
    } finally { 
      conPool.returnConnection(con);
    }
  }
  
  
}