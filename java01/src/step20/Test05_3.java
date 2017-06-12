/* JDBC 프로그래밍: PreparedStatment 객체 사용 후
 => Statement와 preparedStatment 를 사용해야 하는 이유?
 */
 
package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class Test05_3 {
	
	public static void main(String[] args) throws Exception {
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
		String jdbcUsername ="webapp";
		String jdbcPassword = "1111";
		
		
		String email = "howoo102@test.com' or email like('hou%') or email='ㅋㅋ";
		
		
		try {			
			Class.forName(jdbcDriver);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (
		Connection con = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
				
		Statement stmt = con.createStatement();
		) {
		
		
		int count  = stmt.executeUpdate(
				"delete from memb where email= '" + email + "'");
	
		System.out.println(count);
		
		}catch (Exception e) {
			e.printStackTrace();			
		}		
	}
	
}


