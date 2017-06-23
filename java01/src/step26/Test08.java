package step26;


import java.util.Date;

public class Test08 {
	
	public static void main(String[] args) throws Exception { 
		Class<?> clazz = Date.class;
		Date obj = (Date) clazz.newInstance();
		System.out.println(obj);
	}
}
