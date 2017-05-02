/*변수 선언 : 자바의 원시 데이터 타입*/
package step02;

public class Test2 {
	public static void main(String[] args) {
		// 자바의 최소 단위 메모리 => primitive data type (원시타입 = 기본타입)
      //1) 정수 변수: 정수 값을 저장 할때 사용하는 메모리
		byte b; // 1byte 크기의메모리
		short s; // 2byte 크기의메모리
		int i; // 4byte 크기의메모리
		long l; // 8byte 크기의메모리
		
		b = -128;
		b = 127;
		//b = -129; //1 바이트 크기를 넘기 때문에 컴파일 오류
		//b = 128; 
		
		s = -32768;
		s = 32767;
	//s = -32769;
	//s = 32768;
		
		i = -21_4748_3648;
		i = 21_4748_3647;
		//i = -21_4748_3648L;
		//i = 21_4748_3648L;
		//i = 100L;
		
		l = Long.MIN_VALUE;
		l = Long.MAX_VALUE;
		//l = -9223372036854775808L;
		//l = 9223372036854775807L;
	}
}