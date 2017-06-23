package step26;

public class Test09 {
	static class My {}
	
	public static void main(String[] args) throws Exception { 
		Class<?> c1 = My.class;
		Class<?> c2 = step26.Test09.My.class;
		Class<?> c3 = Class.forName("step26.Test09$My");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
