/* 캡슐화(encapsulation) : 패키지 멤버 클래스 (일반 클래스)에 붙일 수 있는 modifier 종류
 * 
 */
package step11;

	
public class Test06 {
	
	public static void main(String[] args) {
		step11.ex1.A obj = new step11.ex1.A();
		
		//step11.ex1.B obj = new step11.ex1.B();
		//Test06은 B 클래스와 다른 패키지에 있기 때문에 컴파일 오류!
		
	}
}
