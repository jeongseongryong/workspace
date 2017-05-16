/* final : 변수에 final을 붙이는 경우
 */
package step12.ex3;

public class D {
	
	public static final int LEVEL_GETST = 0;
	public static final int LEVEL_MEMBER = 1;
	public static final int LEVEL_ADMIN = 2;
	
	public void m1(final int a, final String b, final Object obj, final boolean c) {
		// 오직 조회용으로만 사용할수 있음
		
		a= 20;
		b= "Hello";
		obj = new java.util.Date();
		c = true; //컴파일오류
	}
}
