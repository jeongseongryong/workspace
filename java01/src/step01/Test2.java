/* 리터럴- 리터럴 (literal)표현
*/
package step01;

public class Test2 {
	public static void main(String[] args) {
		//기본 데이터 타입
		//1) 정수 데이터 형
		System.out.println('가'); //문자 값 2바이트 크기.
		System.out.println(100); //정수값 .4바이트 크기.
		System.out.println(100L); //정수 값. 8바이트 크기.
		//2)부동소수점 데이터 형
		System.out.println(3.14f); //부동소수점. 4바이트 크기.
		System.out.println(3.14);//부동소수점. 8바이트 크기.
		//3)논리형 데이터 형
		System.out.println(true);//논리값  4바이트 크기.
		//4)객체 데이터 형
		System.out.println("문자열");
	}

}