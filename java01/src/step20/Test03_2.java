/* JDBC 프로그래밍: try ~ catch ~ 를 이용하여 자원  해제시키기 II
 */
package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03_2 {

	public static void main(String[] args) {
		
		try {
		
		com.mysql.jdbc.Driver mysqldriver = new com.mysql.jdbc.Driver();			
		DriverManager.registerDriver(mysqldriver); 
		} catch (Exception e) {
			e.printStackTrace();
			return; //로딩하다가 로딩못하면 빠져나간다.
		}
		try (	//이 괄호 안에 선언하는 변수는 오직 java.lang.AutoCloseable 구현체만이	
				Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webappdb", 
					"webapp",
					"1111");
			
				Statement  stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select mno, name, tel, email from memb");
		) {
			while (rs.next()) {
				System.out.printf("%d, %s, %s, %s\n",
						rs.getInt("mno"),
						rs.getString("name"),
						rs.getString("tel"),
						rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} 
	}
	
}
