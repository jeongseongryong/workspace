/*컬렉션 클래스 II : java.lang.HashSet II
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_4  {
	
	public static void main(String[] args) {
	HashSet Set = new HashSet();

		Set.add(new String("홍길동"));
		Set.add(new String("임꺽정"));
		Set.add(new String("유관순"));
		Set.add(new String("윤봉길"));
		Set.add(new String("안중근"));
		Set.add(new String("김구"));
		Set.add(new String("김구")); 
		
		System.out.println(new String("김구").hashCode());
		System.out.println(new String("김구").hashCode());
		System.out.println(new String("김구").hashCode());
		

		Iterator iterator = Set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}	
}	

