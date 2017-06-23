package step26;

import java.lang.reflect.Method;

public class Test07 {
	
	public static void main(String[] args) throws Exception { 
		String str = new String("Hello");
		Class<?> clazz = Math.class;
		
		Method m = clazz.getMethod("replace", char.class, char.class);
		Object returnValue = m.invoke(str, 'l', 'x');
		System.out.println(returnValue);
		
		clazz = Math.class;
		m = clazz.getMethod("abs", int.class);
		returnValue = m.invoke(null, -100);
		System.out.println(returnValue);
	}
	
}
