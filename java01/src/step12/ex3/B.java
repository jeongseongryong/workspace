/* final : 변수에 final 붙이기
 * 
 */
package step12.ex3;

public class B {
	int a;
	final int b = 20;
	
	public B() {
		a = 10;
		b = 20; // 이미 변수 선언부에 값을 초기화 시키는 명령이 있기때문에
						// 생성자에서  또 값을 저장 할 수 없다.
	}
	
}