/*목록을 다루는 클래스 구현
 */
package step08;

 class Test06_2_ArrayList {
	// 오버라이딩 재 정의불가 (final)
	public static final int DEFAULT_SIZE = 10;
  public static final int GROW_SIZE = 1000; 
	
  // 클래스 멤버만이 접근할수있게 접근을 막는다.
	private Object[] list;
	private int length;
				
	public Test06_2_ArrayList() {
		list = new Object[DEFAULT_SIZE];
	}
	
	public Test06_2_ArrayList(int capacity) {
		if(capacity < DEFAULT_SIZE || capacity > GROW_SIZE) {
		list = new Object[10];
	}else {
		list = new Object[capacity];
	}
}
	
// 맨 끝 빈 방에 값을 넣는다.
  public void add(Object obj) {
			list[length++] =obj;
		
		if (length == list.length) {
					increaseList();
			}		
  } //add
  
  // 값이 들어 있는 중간 방에 새 값을 끼워 넣는다.
  public void add(int index, Object obj) {
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
		Object[] newList = new Object[list.length + GROW_SIZE]; //새배열을만든다.
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		list = newList;
	} // increaseList
	
	public int size() {
		return length;
	}
	
	public Object get(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
	}
		return list[index];
 }
	
	public Object remove(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		Object removedObj = list[index];
		
		if (index < (length - 1)) {
			for (int i = index; i  < (length - 1); i++) {
				list[i] = list[i+1];
			}
		}
		length--;
		return removedObj;
	}	
	public Object set(int index, Object obj) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		Object oldObj = list[index];
		list[index] = obj;
		return oldObj;
	}	
}  
	

