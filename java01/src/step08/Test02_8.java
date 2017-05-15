/*유틸리티 클래스 :String 8 - StringBuffer는 문자열을 비교할 수없다.
 * 
 */
package step08;

public class Test02_8 {

	public static void main(String[] args){
	StringBuffer s1 = new StringBuffer("Hello");
	StringBuffer s2 = new StringBuffer("Hello");

 
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	// StringBuffer의 들어 있는 문자열을 비교하고 싶다면,
	// 먼저 toString()을 이용하여 StringBuffer 인스턴스에서 String 인스턴스를 추출한다.
	// 그리고 String의 equals()를 사용해서 비교한다.
	System.out.println(s1.toString().equals(s2.toString()));

	}
}
	
	


