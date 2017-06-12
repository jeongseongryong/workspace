package Exercise.ex1;

public class Test01 {

	public static void main(String[] args) throws Exception {
		String jdbcDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://localhost:3306/webappdb";
    String jdbcUsername = "webapp";
    String jdbcPassword = "1111";
    
    StudentDao studentDao = new StudentDao(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
    studentDao.selectList();
	}

}
