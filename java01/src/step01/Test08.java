/* 리터럴- 부동 소수점의 의미
*/

package step01;

public class Test08 {
	public static float xxx = 12.375f;
	
	public static void main(String[] args) {
    //1) 4바이트 메모리 = single precision(단정도; 한 개의 정밀도)
		System.out.println(987.654f);
     
     // 부동소수점 표기법
		// =>소수점이 부양하여 움직임을 표현하기위해 "부도소수점" 이라 부른다.
		System.out.println(98.7654E1f);
		System.out.println(9.87654E1);
		System.out.println(0.987654E3f);
		System.out.println(9876.54E-1f);
		System.out.println(98765.4E-2f);
	}
}