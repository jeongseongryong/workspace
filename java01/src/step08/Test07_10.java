/*컬렉션 클래스 II : java.lang.HashMap II
 */
package step08;

import java.sql.Date;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test07_10  {
	static class MyKey {
		String value;
		
		public MyKey(String value) {
			this.value = value;
		}
	
		public String toString() {
			return value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((value == null) ? 0 : value.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyKey other = (MyKey) obj;
			if (value == null) {
				if (other.value != null)
					return false;
			} else if (!value.equals(other.value))
				return false;
			return true;
		}
		
	} // MyKey

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
	
	//방법1)
	Collection valueList = map.values();
	
	Iterator iterator = valueList.iterator();
	
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("--------------------");
	
	//방법2)
	Set keySet = map.keySet();
	
	Object[] keyArray = keySet.toArray();
	for(int i = 0; i <keyArray.length; i++) {
		System.out.println(map.get(keyArray[i]));
	}
	System.out.println("--------------------");
	
	for (Object key : keySet) {
		System.out.println(map.get(key));
	}
	System.out.println("--------------------");
	
	Set entrySet = map.entrySet();
	for (Object object : entrySet) {
		Entry entry = (Entry)object;
		System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
	}
		
	}	
}	


