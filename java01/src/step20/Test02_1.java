/* JDBC 프로그래밍: Statement 객체
 * => SQL 문을 DBMS에 전달하고 ,그 결과를 다루는 객체를 리턴한다.
 *  executeQuery() : SELECT문 실행
 *  executeUpdate(): INSERT, UPDATE, DELETE
 *  executeBatch() : SELECT, INSERT, UPDATE, DELETE
 */
package step20;

import java.sql.DriverManager;

public class Test02_1 {

	public static void main(String[] args) throws Exception {
		
		com.mysql.jdbc.Driver mysqldriver = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(mysqldriver); // close() 없음
		
		java.sql.Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/webappdb", 
				"webapp",
				"1111");
		
		java.sql.Statement stmt = con.createStatement();
		
		java.sql.ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
		
		while (rs.next()) {
			System.out.printf("%d, %s, %s, %s\n",
					rs.getInt("mno"),
					rs.getString("name"),
					rs.getString("tel"),
					rs.getString("email"));
		}
		rs.close();
		
		stmt.close();
		
		con.close();
		
		
	}
	
}
