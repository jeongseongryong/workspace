/*예외처리 : 자원 자동 해제 try ~ catch ~블록(try-with-resources 문장)
 * try 괄호 안에 선언할 수 있는 객체는
 * java.lang.AutoCloseable 규격에 따라 만든 객체만 가능하다.
 */
package step17;

import java.io.FileInputStream;

public class Test14_3 {	
	
	static class A {
		public void close() throws Exception {
			System.out.println("A.close()");
		}
	}
	
	
	static class B implements AutoCloseable {
		public void close() throws Exception {
			System.out.println("B.close()");
		}
	}
	
	public static void main(String[] args) {
		 int age = 15;
		
		try ( 
			//A obj1 = new A();
				
			B obj2 = new B();
		) {
			if (age < 19) 
				throw new Exception("미성년입니다.");
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		} 
		
	}
		
}

