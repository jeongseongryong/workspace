package step26;

import java.lang.reflect.Method;

public class Test03 {
	
	
	public static void main(String[] args) throws Exception { //스태틱 환경은
		// test01();
		test02();
	}
	private static void test01() throws Exception {
		Class<?> clazz = MyClass.class;
		
		Method[] methodList = clazz.getMethods();
		for (Method m : methodList) {
			System.out.println(m.getName());
		}
	}
	
	private static void test02() throws Exception {
		Class<?> clazz = MyClass.class;
		
		Method[] methodList = clazz.getMethods();
		for (Method m : methodList) {
			System.out.println(m.getName());
		}
	}
	
	
	
}
