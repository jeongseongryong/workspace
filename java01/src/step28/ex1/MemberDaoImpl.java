package step28.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

public class MemberDaoImpl implements MemberDao {
  DBConnectionPool conPool;

  public void setDBConnectionPool(DBConnectionPool conPool) {
    this.conPool = conPool;
  }

  public List<Member> selectList(int pageNo, int pageSize) throws Exception {
    Connection con = conPool.getConnection();
    // connection을 닫지 않기 위해 try문 안에 넣지 않는다.

    try (
        PreparedStatement stmt = con.prepareStatement("select mno, name, tel, email from memb order by mno asc limit ?, ?");
        ) {
      stmt.setInt(1, (pageNo -1) * pageSize);
      stmt.setInt(2, pageSize);

      ArrayList<Member> list = new ArrayList<>();
      try(      ResultSet rs = stmt.executeQuery();) {
        Member member = null;

        while (rs.next()) {
          member = new Member();
          member.setNo(rs.getInt("mno"));
          member.setName(rs.getString("name"));
          member.setTel(rs.getString("tel"));
          member.setEmail(rs.getString("email"));

          list.add(member);
        } // while

      } // try
      return list;
    } finally {
      conPool.returnConnection(con);
    }

  } // selectList()

  public Member selectOne(int no) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement("select mno, name, tel, email from memb where mno=?");
        ) {
      stmt.setInt(1, no);

      try(ResultSet rs = stmt.executeQuery();) {
        if (!rs.next()) {
          return null;
        }

        Member member = new Member();
        member.setNo(rs.getInt("mno"));
        member.setName(rs.getString("name"));
        member.setTel(rs.getString("tel"));
        member.setEmail(rs.getString("email"));

        return member;

      } // try

    } finally {
      conPool.returnConnection(con);
    }

  } // selectOne()

  public int insert(Member member) throws Exception {
    Connection con = conPool.getConnection();
    try(
        PreparedStatement stmt = con.prepareStatement(
            "insert into memb(name, tel, email, pwd) values(?, ?, ?, password(?))",
            Statement.RETURN_GENERATED_KEYS);) {

      stmt.setString(1, member.getName());
      stmt.setString(2, member.getTel());
      stmt.setString(3, member.getEmail());
      stmt.setString(4, member.getPassword());

      int count = stmt.executeUpdate();

      try(
          ResultSet rs = stmt.getGeneratedKeys();
          // 자동생성된 값을 리턴한다.
          )
      {
        rs.next();
        member.setNo(rs.getInt(1));
      }
      
      return count;
      
    } finally {
      conPool.returnConnection(con);
    }

  } // insert()

  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();
    try(
        PreparedStatement stmt = con.prepareStatement("delete from memb where mno= ?");
        ) {
      stmt.setInt(1, no);
      return stmt.executeUpdate();

    } finally {
      conPool.returnConnection(con);
    }

  } // delete()

  public int update(Member member) throws Exception {
    Connection con = conPool.getConnection();
    try(
        PreparedStatement stmt = con.prepareStatement(
            "update memb set name =?, email=?, tel=?, pwd=password(?) where mno=?");
        ) {
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getTel());
      stmt.setString(4, member.getPassword());
      stmt.setInt(5, member.getNo());

      return stmt.executeUpdate();

    } finally {
      conPool.returnConnection(con);
    }

  } // insert()

  public Member selectOneByEmailPassword(String email, String password) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement
        ("select mno, name, tel, email from memb where email=? and pwd=password(?)");
        ) {

      stmt.setString(1, email);
      stmt.setString(2, password);

      try(ResultSet rs = stmt.executeQuery();) {
        if (!rs.next()) {
          return null;
        }

        Member member = new Member();
        member.setNo(rs.getInt("mno"));
        member.setName(rs.getString("name"));
        member.setTel(rs.getString("tel"));
        member.setEmail(rs.getString("email"));

        return member;

      } // try

    } finally {
      conPool.returnConnection(con);
    }

  } // selectOneByEmailPassword()

}
