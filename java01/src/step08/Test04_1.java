/*유틸리티 클래스 : 랩퍼(wrapper) 클래스
 *
 */
package step08;

public class Test04_1  {
	
	public static void main(String[] args){
		int i = 10;
		
		Integer obj = new Integer(10);
		
		int x = obj.intValue();
		
		String str = obj.toString();
		
	byte b = obj.byteValue();
	short s = obj.shortValue();
	long l = obj.longValue();
	float f = obj.floatValue();
	double d = obj.doubleValue();
	
	System.out.println(obj.compareTo(new Integer(5)));
	System.out.println(obj.compareTo(new Integer(10)));
	System.out.println(obj.compareTo(new Integer(20)));
	
	}
	
}
	
	

