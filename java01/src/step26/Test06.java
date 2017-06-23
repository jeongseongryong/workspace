package step26;

import java.lang.reflect.Method;

public class Test06 {
	
	
	public static void main(String[] args) throws Exception { 
		Class<?> clazz = Math.class;
		
		Method[] methodList = clazz.getMethods();
		for (Method m : methodList) {
			System.out.printf("%s\n", m.getName());
			Class<?>[] paramTypes =m.getParameterTypes();
			for (Class<?> paramType : paramTypes) {
				System.out.printf("--> %s\n", paramType.getName());
			}
			System.out.println();
		}
	}
	
}
