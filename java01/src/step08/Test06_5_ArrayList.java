/*목록을 다루는 클래스 구현 : 제네릭 적용
 */
package step08;

import java.lang.reflect.Array;

class Test06_5_ArrayList<T> {

	public static final int DEFAULT_SIZE = 10;
  public static final int GROW_SIZE = 1000; 
	

	private T[] list;
	private int length;
				
	public Test06_5_ArrayList() {
		list = (T[]) new Object [DEFAULT_SIZE];
	}
	
	public Test06_5_ArrayList(int capacity) {
		if(capacity < DEFAULT_SIZE || capacity > GROW_SIZE) {
		list = (T[])new Object[10];
	}else {
		list = (T[]) new Object[capacity];
	}
}
	
// 맨 끝 빈 방에 값을 넣는다.
  public void add(T obj) {
			list[length++] =obj;
		
		if (length == list.length) {
					increaseList();
			}		
  } //add
  
  // 값이 들어 있는 중간 방에 새 값을 끼워 넣는다.
  public void add(int index, T obj) {
  	if(length == list.length) {
  		increaseList();
  	}
  	if(index < 0 || index > length) {
  		throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
  	}
  	if (index < length) { // 맨 마지막 값부터 index가 가리키는 방의 값까지 반복하면서 뒤로 한칸씩미룬다 
  		for(int i = length; i > index; i--) {
  			list[i] = list[i - 1];
  		}
  	}
  	list[index] = obj;
  	length++;
  }
  
	private void increaseList() {
		T[] newList = (T[])new Object[list.length + GROW_SIZE]; //새배열을만든다.
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		list = newList;
	} // increaseList
	
	public int size() {
		return length;
	}
	
	public T get(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
	}
		return list[index];
 }
	
	public T remove(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		T removedObj = list[index];
		
		if (index < (length - 1)) {
			for (int i = index; i  < (length - 1); i++) {
				list[i] = list[i+1];
			}
		}
		length--;
		return removedObj;
	}	
	public T set(int index, T obj) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		T oldObj = list[index];
		list[index] = obj;
		return oldObj;
	}	
}  
	
