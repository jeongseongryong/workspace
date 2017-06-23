package step26;

import java.lang.reflect.Method;

public class Test05 {
	
	
	public static void main(String[] args) throws Exception { 
		Class<?> clazz = Math.class;
		
		Method m = clazz.getMethod("sin", double.class);
		System.out.println(m);
		
		Class<?> returnType = m.getReturnType();
		System.out.println(returnType.getName()); // 그메소드의 타입을 알아내기
	}
	
}
