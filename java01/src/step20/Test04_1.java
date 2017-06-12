/* JDBC 프로그래밍: 특정 DBMS에 종속되는 것 막기
 * 명령창에서 실행하는 법
 * java -cp bin -Djdbc.driver=com.mysql.jdbc.Driver step20.Test04_1
 * 이클립스에서 실행하는 법
 * Run > Run configurations....>
 */
package step20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test04_1 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//com.mysql.jdbc.Driver mysqldriver = new com.mysql.jdbc.Driver();			
			//DriverManager.registerDriver(mysqldriver); mysql(전용)에서만사용가능
			
			String driverClassName = System.getProperty("jdbc.driver"); // mysql 전용아님 오라클에서도사용가능
			
			Class.forName(driverClassName);
			/*참고적으로 클래스가 로딩되는 경우
			 *  클래스가 로딩되는 경우,(조건: 클래스가 로딩되어 있지않을시)
			 *  1) 인스턴스를 만들 때
			 * 	2) 스태틱 멤버(변수나 메서드)를 사용할 때
			 * 	3) Class.forName()을 호출 할 때
			 */
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
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 한개씩 낱개로 예외처리해야함.
			try {rs.close();} catch (Exception e) {}			
			try {stmt.close();} catch (Exception e) {}	
			try {con.close();} catch (Exception e) {}	
		}		
	}
	
}
