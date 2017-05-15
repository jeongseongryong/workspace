/* 캡슐화(encapsulation) : 중첩 클래스 (nested class)에 붙일 수 있는 modifier 종류
 * 내부 클래스(inner class)라고도 부른다
 */
package step11;

	
public class Test08 { 
	
	private class inner {}
	class inner2 {}
	protected class inner3 {}
	public class inner4 {}
	
	
	public static void main(String[] args) {
		
	 class Local1 {}
	 //private Local2 {} // 컴파일 오류!
	 //protrcted Local3 {} // 컴파일오류!
	 //public Local4 {} // 컴파일오류!
	 
	 int v1;
	 //private int // 컴파일 오류!
	 //protrcted int  // 컴파일오류!
	 //public int // 컴파일오류!
	}
}
