/*유틸리티 클래스 :String 3
 *  
 */
package step08;

public class Test02_3 {

	public static void main(String[] args){
	String s1 = new String("Hello!");
	String s2 = new String("Hello!");
	 
		if (s1.equals(s2)) { //문자열 인스턴스 주소1. equals(문자열 인스턴스 주소2)
			//equals() 메서드는 s1에 저장된 주소로 찾아가서 그 인스턴스의 문자 배열과
			//s2에 저장된 주소라 찾아가서 그 인스턴스의 문자 배열을 한 개씩 비교하여
			//끝까지 같다면 true를 리턴, 다르면 false를 리턴
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
	 
  
	}
}
	
	


