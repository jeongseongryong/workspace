/*컬렉션 클래스 II : java.lang.HashSet
 * => 저장하는 객체에 대해 hashCode()를 호출하여
 * 		그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_3  {
	
	public static void main(String[] args) {
	HashSet dateSet = new HashSet();

		dateSet.add(Date.valueOf("2017-3-1"));
		dateSet.add(Date.valueOf("2017-5-3"));
		dateSet.add(Date.valueOf("2017-5-5"));
		dateSet.add(Date.valueOf("2017-5-9"));
		dateSet.add(Date.valueOf("2017-6-6"));
		Date d1 = Date.valueOf("2017-6-6");
		dateSet.add(d1);
		dateSet.add(d1); // 중복 ㄴㄴ
		
		
	Object[] valueList = dateSet.toArray();
		for (int i=0; i < valueList.length; i++) {
			System.out.println(valueList[i]);
		}
		
		System.out.println("--------------------");

		Iterator iterator = dateSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}	
}	


