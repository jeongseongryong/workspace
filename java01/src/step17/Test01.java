/* 예외처리 :예외처리 문법이 없을 경우
 */
package step17;

public class Test01 {
	public static float divide(float a, float b) {
		
		return a / b;
	}

	public static void main(String[] args) {
		
		System.out.println(divide(10, 2));
		System.out.println(divide(0, 2));
		System.out.println(divide(10, 0));
	}

}