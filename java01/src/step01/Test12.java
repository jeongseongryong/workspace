/* 리터럴- 이스케이프 문자 
*/

package step01;

public class Test12 {
	
	public static void main(String[] args) {
		System.out.println("ABC\b가각간"); //backspace(0x0008)
		System.out.println("ABC\t가각간"); //tab (0x0009)
		System.out.println("ABC\n가각간"); // linefeed(new line; 0x000a).
		System.out.println("ABC\f가각간"); // formfeed. 0x000c
		System.out.println("-----________------");
		System.out.println("ABC\r가각간"); // carrage return. 0x000d
		System.out.println("ABC\"가각간"); // double quote 0x0022
		System.out.println("ABC'가각간");  // 0x0027
		System.out.println("ABC\'가각간");
		
//		char c1 =''';
		char c2 = '\'';
		System.out.println(c2);
		System.out.println("ABC\\가각간");
		System.out.println("c:\\workspace\\java01\\src\\step01\\Test12.java");
  }
}

/*
 * 이스케이프문자
 * =>일반 문자가 아닌 특별한 명령어를 의미하는 문자.
 * =>문법
 *    \ 문자
 *    
 * 줄바꿈 문자
 * => windows: CRLF(0x*/
 