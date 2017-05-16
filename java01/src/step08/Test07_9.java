/*컬렉션 클래스 II : java.lang.HashMap II
 */
package step08;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_9  {
	static class MyKey {
		String value;
		
		public MyKey(String value) {
			this.value = value;
		}
	}

	static class Book {
		String title;
		String press;
		int page;
		
		public Book(String title, String press, int page) {
			this.title = title;
			this.press = press;
			this.page = page;
		}
		
		public String toString() {
			return String.format("%s,%s,%d", title, press, page);
		}
		
		
	}
	
	public static void main(String[] args) {
	HashMap map = new HashMap();

	map.put(new MyKey("key1"), new Book("aaaa", "비트 출판사", 100));
	map.put(new MyKey("key2"), new Book("bbbb", "비트 출판사", 200));
	map.put(new MyKey("key3"), new Book("cccc", "비트 출판사", 300));
	map.put(new MyKey("key4"),new Book("dddd", "비트 출판사", 400));

	
	System.out.println(map.get(new MyKey("key1")));
	System.out.println(map.get(new MyKey("key3")));
	
	MyKey s1 = new MyKey("key1");
	MyKey s2 = new MyKey("key2");		
	if(s1 == s2)
		System.out.println("s1 == s2");
	else
		System.out.println("s1 != s2");
	System.out.printf("%d,%d\n", s1.hashCode(),s2.hashCode());
	System.out.println(s1.equals(s2));
	}	
}	


