/* JDBC 프로그래밍 : Statement 객체 - INSERT 실행*/

package step20;

import java.sql.DriverManager;

public class Test02_3 {

  public static void main(String[] args) throws Exception {
    System.out.println("step20 Test02_3 실행중");System.out.println();
    
    com.mysql.jdbc.Driver mysqlDriver = new com.mysql.jdbc.Driver();
    
    DriverManager.registerDriver(mysqlDriver);
    
    java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/webappdb", 
        "webapp",
        "1111");
    
    java.sql.Statement stmt = con.createStatement();
    
    int count = stmt.executeUpdate(
                                   "update memb set name='호호호' where email='hong101@test.com' ");
    
    System.out.println(count);
    
    stmt.close();
    con.close();
    
  }

}
