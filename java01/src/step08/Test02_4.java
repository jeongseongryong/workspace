/*유틸리티 클래스 :String 4 - 상수 문자열 인스턴스
 *  
 */
package step08;

public class Test02_4 {

	public static void main(String[] args){
	String s1 = new String("Hello!"); // new String("Hello")와 같지만,
	                                  // 단! Constant pool 영역에 생성된다 (상수문자열을 따로 관리)
	String s2 = new String("Hello!"); //한번 생성되면 기존의 상수 문자열 인스턴스의 주소를 리턴(같은걸 계속사용)
	 
		if (s1 == s2) { // 상수 문자열을 가리키는 레퍼런스를 비교할 떄는
			// 그냥 == 연산자를 사용해도 된다.
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
	 
  
	}
}
	
	


