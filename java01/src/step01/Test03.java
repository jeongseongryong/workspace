/* 리터럴- 정수 리터럴 (literal)표현
*/

package step01;

public class Test03 {
	public static void main(String[] args) {
		//1) 그냥 숫자를 작성하는 것을 4바이트 크기의 정수 값을 의미한다.
		System.out.println(-10); 
		System.out.println(10); 
		System.out.println(2147483647); //4바이트 양의 정수 최대 값
		System.out.println(-2147483648); //4바이트 음의 정수 최대 값
		
		//2 8바이트 정수 값을 표현 할 떄는 수자 뒤에 'L', 'l'을 붙인다.
		System.out.println(-10L); // 대문자 'L'을 붙여도 되고
		System.out.println(10l);  // 소문자 'l' 을 붙여도 된다.
			// 그런데 숫자1과 소문자 'l' 구분 하기 힘들어 대문자 'L'을 사용한다.
		System.out.println(2147483647L); //4바이트 양의 정수 최대 값을 넘어서도 괜찮 
		System.out.println(-2147483648L); //4바이트 음의 정수 최대 값을 넘어도 괜찮
		
		System.out.println(9223372036854775807L); //8바이트 양의 정수 최대 값
		System.out.println(-9223372036854775808L); //8바이트 음의 정수 최대 값
		
		
		
	}
}