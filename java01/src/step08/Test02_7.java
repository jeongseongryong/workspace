/*유틸리티 클래스 :String 7 - replace() 메서드와 Mutable 객체
 * => Mutable(변할수 있는) 객체
 */
package step08;

public class Test02_7 {

	public static void main(String[] args){
	StringBuffer s1 = new StringBuffer ("Hello!");

  s1.replace(2, 4, "xx");
  
	System.out.println(s1);

	}
}
	
	


