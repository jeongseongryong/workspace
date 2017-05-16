/* final : 변수에 final 붙이기
 * 
 */
package step12.ex3;

public class C {
	public void m1() {
		int a;
		a = 10;
		a = 20;
		
		final int b;
		b = 20;
		b = 30; // 값을 딱 한 번만 저장 할수있다.
	}
	
}
