/*컬렉션 클래스 II : java.lang.HashSet II
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_6  {

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
		
		public int hashCode() {		
			return 1;
		}
		
		public boolean equals(Object obj) {
			return true;
		}
		
	}
	
	public static void main(String[] args) {
	HashSet Set = new HashSet();

	Set.add(new Book("aaaa", "비트 출판사", 100));
	Set.add(new Book("bbbb", "비트 출판사", 200));
	Set.add(new Book("cccc", "비트 출판사", 300));
	Set.add(new Book("dddd", "비트 출판사", 400));
	Set.add(new Book("eeee", "비트 출판사", 500));
	Set.add(new Book("ffff", "비트 출판사", 600));
	Set.add(new Book("ffff", "비트 출판사", 600));
	

	
	Iterator iterator = Set.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		System.out.println("----------------------");
		
		System.out.println(new Book("ffff", "비트 출판사", 600).hashCode());
		System.out.println(new Book("ffff", "비트 출판사", 600).hashCode());
		System.out.println(new Book("ffff", "비트 출판사", 600).hashCode());
	}	
}	


