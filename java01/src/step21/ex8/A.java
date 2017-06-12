/* 인터페이스 1
 * 
 */
package step21.ex8;

public interface A {
	//메서드 선언 규칙
	public abstract void m1();
	
	abstract void m2();
	
	void m3();
	
	//void m4() {} // 컴파일오류
	
	//필드 선언 규칙
	public static final int v1 = 200;
	
	static final int v2 = 200;
	
	final int v3 = 200;
	
	int v4 = 200;
}
