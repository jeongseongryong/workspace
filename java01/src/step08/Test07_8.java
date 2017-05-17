/*컬렉션 클래스 II : java.lang.HashMap
 */
package step08;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_8  {

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

	map.put(new String("key1"), new Book("aaaa", "비트 출판사", 100));
	map.put("key2", new Book("bbbb", "비트 출판사", 200));
	map.put("key3", new Book("cccc", "비트 출판사", 300));
	map.put("key4",new Book("dddd", "비트 출판사", 400));
	map.put(1, new Book("eeee", "비트 출판사", 500)); 
	map.put(2, new Book("ffff", "비트 출판사", 600));
	map.put(3, new Book("ffff", "비트 출판사", 600)); 
	
	System.out.println(map.get(new String("key1")));
	System.out.println(map.get(1));
	
	String s1 = new String("Hello");
	String s2 = new String("Hello");
	if(s1 == s2)
		System.out.println("s1 == s2");
	else
		System.out.println("s1 != s2");
	System.out.printf("%d,%d\n", s1.hashCode(),s2.hashCode());
	System.out.println(s1.equals(s2));
	
	}	
}	

