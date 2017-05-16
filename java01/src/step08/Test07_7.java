/*컬렉션 클래스 II : java.lang.HashSet IV
 */
package step08;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_7  {

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
			final int prime = 31;
			int result = 1;
			result = prime * result + page;
			result = prime * result + ((press == null) ? 0 : press.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}
		
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (page != other.page)
				return false;
			if (press == null) {
				if (other.press != null)
					return false;
			} else if (!press.equals(other.press))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
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


