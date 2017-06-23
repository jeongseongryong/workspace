package step26;

import java.lang.reflect.Method;

public class Test04 {
	
	
	public static void main(String[] args) throws Exception { //스태틱 환경은
		Class<?> clazz = MyClass.class;
		
		Method m = clazz.getMethod("m1");
		System.out.println(m);
		
		//	m = clazz.getMethod("m1", String.class);
		//	System.out.println(m);
		
		Method m2 = clazz.getMethod("m2", int.class);
		System.out.println(m2);
		
		Method m3 = clazz.getMethod("m3", String.class, int.class);
		System.out.println(m3);
		// 특정 메소드를 찾을땐 getMethod
	}
	
}
