/*변수 선언 : 자바의 원시 데이터 타입*/
package step02;

public class Test01 {
	public static void main(String[] args) {
		// 자바의 최소 단위 메모리 => primitive data type (원시타입 = 기본타입)
      //1) 정수 변수: 정수 값을 저장 할때 사용하는 메모리
		byte b; // 1byte 크기의메모리
		short s; // 2byte 크기의메모리
		int i; // 4byte 크기의메모리
		long l; // 8byte 크기의메모리
		
		//2) 부동 소수점 변수: 부동소수점  값을 저장할 때 사용하는 메모리
		float f; // 4byte 크기의메모리
		double d; // 8byte 크기의메모리
		
		//3)문자 변수 : 문자의 유니코드 값을 저장할 때 사용하는 메모리
		char c; // 2byte 크기의메모리
		
		//4)논리 값 변수: 논리 값을 저장할 때 사용하는 메모리
		boolean bool; // 자바 언어 명세서에서 크기를 알려주지 않는다.
		              // 다만, JVM 명세서에서 4 바이트 정수 값을 담는 메모리를 사용한다고 언급하고있음
		              // 그리고 배열로 만들 때는  byte 메모리를 사용한다고 설명하고있다.
		
		//5) 위의 8 개의 원시 타입을 제외한 나머지는 모두 레퍼런스 변수이다.
    //보통 줄여서 레퍼런스라 부른다 
		//레퍼런스 변수란 메모리의 주소를 저장하는 변수이다.
		Object obj;
		String str;
		Thread thread;
	}

}
/* 변수 선언*/