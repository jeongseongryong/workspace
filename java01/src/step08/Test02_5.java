/*유틸리티 클래스 :String 5 - 상수 문자열 과 문자열 인스턴스
 *  
 */
package step08;

public class Test02_5 {

	public static void main(String[] args){
	String s1 = "Hello!";
	String s2 = "Hello!";
	String s3 = new String("Hello!");
	String s4 = new String("Hello!"); 
	
		if (s1 == s2) { // 상수 문자열을 가리키는 레퍼런스를 비교할 떄는
			// 그냥 == 연산자를 사용해도 된다.
			System.out.println("s1 == s2");
		}
		if (s1 == s3){
			System.out.println("s1 != s3");
		}
	  if (s3 == s4) {
	  	System.out.println("s3 == s4");
	  }

	}
}
	
	


