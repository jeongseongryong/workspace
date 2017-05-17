/* 예외처리 :조건문을 사용하여 예외처리 하는 경우
 */
package step17;

public class Test02 {
	public static float divide(float a, float b) {
		if(b == 0) {
			return -121255;
		}
		return a / b;
	}

	public static void main(String[] args) {
		float result = divide(10, 2);
		if(result == -121255f) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
		System.out.println(result);
		}
		
		result = divide(10, 0);
		if(result == -121255f) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
		System.out.println(result);
		}
		
		result = divide(121255, -1);
		if(result == -121255f) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
		System.out.println(result);
		}
	}

}
