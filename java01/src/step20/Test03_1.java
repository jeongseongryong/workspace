/* JDBC 프로그래밍 : try ~ catch ~ 를 이용하여 자원 해제 시키기 */

package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03_1 {

  public static void main(String[] args) {
    System.out.println("step20 Test03_1 실행중");
    System.out.println();

    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();      
      
      DriverManager.registerDriver(mysqlDriver);
      
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/webappdb", 
          "webapp",
          "1111");
      
      stmt = con.createStatement();
      
      rs = stmt.executeQuery("select mno, name, tel, email from memb");
      
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s\n", 
            rs.getInt("mno"),
            rs.getString("name"), 
            rs.getString("tel"), 
            rs.getString("email"));
      } // while
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }


  }

}
