package Exercise.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {
	Connection con;
	
	public StudentDao(String driver, String url, String username, String password)
			throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
	
	}
	
	public void selectList() {
		try (
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(
					"select m.mno, m.name, m.tel, m.email, s.work from"
					+ " stud s inner join memb m on s.sno=m.mno "
					+ " order by m.name asc");) {
			
			while (rs.next()) {
				System.out.printf("%d,%s, %s, %s, %s\n",
						rs.getInt("mno"),
						rs.getString("name"),
						rs.getString("tel"),
						rs.getString("email"),
						rs.getString("work"));
			}
			
		}	catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public void insert(String name, String tel, String email, String work, String shoolname, String password) {
	    try (
	        PreparedStatement stmt = con.prepareStatement(
	            "insert into memb(name,tel,email,work,shoolname, pwd) values(?,?,?,?,?,password(?))");) {
		    	stmt.setString(1, name);
	        stmt.setString(2, tel);
	        stmt.setString(3, email);
	        stmt.setString(4, password);
	        stmt.setString(5, work);
	        stmt.setString(6, shoolname);
	       
	        int count = stmt.executeUpdate();

	        System.out.println(count);
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	  }
}

