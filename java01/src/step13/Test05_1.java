/* nested class: anonymous class
 * "inner class" 라고도 한다.
 * 인스턴스 멤버이기 때문에 다른 인스턴스 멤버만이 사용 가능
 * 
 */
package step13;

import java.lang.reflect.Method;

public class Test05_1 {
	public static void main(String[] args) throws Exception{
		
		Object obj = new Object() {
			int value;
			
			// 익명클래스는 클래스 이름이 없기 때문에 생서자를 만들 수 없음.
			// 익명 클래스의 인스턴스 변수 값을 초기화 시킬때 인스턴스 블록 사용
		{
		 System.out.println("인스턴스 블록....");
		 value = 100;
		}
			public void m1() {
				System.out.println("m1()...");
				System.out.println(value);
			}
		};
		
		// obj.m1(); // 컴파일 오류
		Class clazz = obj.getClass();
		Method m = clazz.getMethod("m1");
		m.invoke(obj);
	}
	
}
