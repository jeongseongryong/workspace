/*유틸리티 클래스 : 랩퍼(wrapper) 클래스 II - equals()메서드
 *
 */
package step08;

public class Test04_2  {
	
	public static void main(String[] args){
	Integer i1 = new Integer(10); 
	Integer i2 = new Integer(10);
	
	System.out.println(i1 == i2);
	System.out.println(i1.equals(i2));
	
	StringBuffer s1 = new StringBuffer("Hello");
	StringBuffer s2 = new StringBuffer("Hello");
	
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	/*
	 * 
	 */
	}
	
}
	
	

