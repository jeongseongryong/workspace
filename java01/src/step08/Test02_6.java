/*유틸리티 클래스 :String 6 - replace() 메서드와 Immutable 객체
 * => immutable(변하지 않는) 객체
 */
package step08;

public class Test02_6 {

	public static void main(String[] args){
	String s1 = "Hello!";
	String s2 = "Hello!";
	
	String s3 = s1.replace('l', 'x');
 
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);

	}
}
	
	


