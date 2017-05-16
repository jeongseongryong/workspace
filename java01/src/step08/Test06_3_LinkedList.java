/*목록을 다루는 클래스 구현
 */
package step08;

 class Test06_3_LinkedList {
	class Bucket { //인스턴스 멤버들만사용.. , 값을 보관하고, 다음 값의 위치 정보를 보관한다.
		Object value;
		Bucket next;
	}
	
	Bucket start;
	Bucket end;
	private int length;
				
	public Test06_3_LinkedList() {
		start = new Bucket();
		end = start;
	}
	
	

  public void add(Object obj) {
		end.value = obj;
		
		Bucket temp = new Bucket();
		end.next = temp;
		end = temp;
		length++;		
  } 
  
  
  public void add(int index, Object obj) {
  	if(index < 0 || index > length) {
  		throw new RuntimeException("인덱스 번호가 범위를 넘어갑니다.");
  	}
  	
  	Bucket temp = new Bucket();
  	temp.value = obj;
  	length++;
  	
  	if(index == 0) {
  		temp.next = start;
  		start = temp;
  		return;
  	}
  	
  	Bucket cursor = start;
  	
  	for (int i = 1; i < index; i++) {
  		cursor = cursor.next;
		}
  	
  	temp.next = cursor.next;
  	cursor.next = temp;
  } // add
  
  	
	public int size() {
		return length;
	}
	
	
	public Object get(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
	}
		Bucket cursor = start;
		
		for (int i = 0; i < index; i++) {
			cursor = cursor.next;
		}
		return cursor.value;
		
 } //get
   
	
	public Object remove(int index) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		if(index == 0) {
			Bucket temp = start;
			start = start.next;
			return temp;
		}
		
		Bucket cursor = start;
		for (int i = 1; i < index; i++) {
			cursor = cursor.next;
		}
		
		Bucket removedObj = cursor.next;
		cursor.next = cursor.next.next;
		return removedObj.value;
	}	// remove
  	
	
	public Object set(int index, Object obj) {
		if (index < 0 && index >= length) {
		  throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		Bucket cursor = start;
		
		for (int i = 0; i < index; i++) {
			cursor = cursor.next;
		}
		
		Object oldValue = cursor.value;
		cursor.value = obj;
		
		return oldValue;
	}	// set
}
	

