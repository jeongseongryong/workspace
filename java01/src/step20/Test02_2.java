/* JDBC 프로그래밍: Statement 객체 insert 실행
 * => SQL 문을 DBMS에 전달하고 ,그 결과를 다루는 객체를 리턴한다.
 * => Statement.executeUpdate()
 * INSERT 등록된 레코드 개수,
 *  UPDATE 변경된 레코드 개수,
 *   DELETE 삭제된 레코드 개수 등 
 *   DML, DDL을 실행한다.
 * 리턴 값은 명령어 영향을 받은 레코드 개수이다.
 */
package step20;

import java.sql.DriverManager;

public class Test02_2 {

	public static void main(String[] args) throws Exception {
		
		com.mysql.jdbc.Driver mysqldriver = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(mysqldriver); // close() 없음
		
		java.sql.Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/webappdb", 
				"webapp",
				"1111");
		
		java.sql.Statement stmt = con.createStatement();
		
		int count  = stmt.executeUpdate("insert into memb(name,tel,email,pwd) " 
				 + " values('홍길동', '123-1313', 'howoo100@test.com', password('1111'))");
	
		System.out.println(count);
		
		stmt.close();
		con.close();
		
		
	}
	
}
