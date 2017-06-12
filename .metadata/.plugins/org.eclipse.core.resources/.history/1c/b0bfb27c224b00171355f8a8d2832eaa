package Lecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBConnectionpool {
	String url;
	String username;
	String password;
	ArrayList<Connection> conList = new ArrayList<>();
	
	public DBConnectionpool(String driver, String url, String username, String password)
		throws Exception {
		Class.forName(driver);
		
		this.url = url;
		this.username = username;
		this.password = password;
	}
	// 임대
	public Connection getConnection() throws Exception {
		if(conList.size() > 0) { // 컬렉션 보관된 게 있으면 그 보관된 객체를 리턴
			return conList.remove(0);
			
		}
		// 컬렉션에 없으면 새로 만들어서 리턴
		return DriverManager.getConnection(this.url, this.username, this.password);
	}
	// 반납
	public void returnConnection(Connection con) {
		conList.add(con);
	}
}
