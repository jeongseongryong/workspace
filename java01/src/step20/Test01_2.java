/* JDBC 프로그래밍: DriverManager 클래스
 * =>MySQL JDBC 드라이버를 드라이버 관리하는 객체
 */
package step20;

import java.sql.DriverManager;

public class Test01_2 {

	public static void main(String[] args) throws Exception {
		
		com.mysql.jdbc.Driver mysqldriver = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(mysqldriver); //  java.sql.Driver 규칙에 따라만든 클래스
		
		java.sql.Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/webappdb", 
				"webapp",
				"1111");
		
		System.out.println("DBMS와 연결 되었음!");
		
		con.close();
	}

}
