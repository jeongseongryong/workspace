package Exercise;

 class ss_LinkedList {
	 class Bucket {
		 Object value;
		 Bucket next;
	 }
	 
	 Bucket start;
	 Bucket end;
	 private int length;
	 
	 public ss_LinkedList() {
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
			 throw new RuntimeException("인덱스 번호가 범위를 넘어감");
		 }
		  Bucket temp = new Bucket();
		  temp.value = obj;
		  length++;
		  
		 if (index == 0) {
		 temp.next = start;
		 start = temp;
		 return;
	 }
		 Bucket cursor = start;
		 
		 for(int i = 1; i < index; i++) {
			 cursor = cursor.next;
		 }
		 temp.next = cursor.next;
		 cursor.next = temp;
	 }
	
	public int size() {
		return length;
	}
	
	public Object get(int index) {
		if (index < 0 && index >=  length) {
			throw new RuntimeException("배열 인덱스 범위를 벗어남");
		}
			Bucket cursor = start;
			
			for (int i = 0; i < index; i++) {
				cursor = cursor.next;
			}
			return cursor.value;
	}
	
	public Object remove(int index) {
		if(index < 0 && index >= length) {
			throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		
		if(index == 0) {
			Bucket temp = start;
			start = start.next;
			return temp;
		}
		
		Bucket cursor = start;
		for(int i = 1; i < index; i++) {
			cursor = cursor.next;
		}
		
		Bucket removedObj = cursor.next;
		cursor.next = cursor.next.next;
		return removedObj.value;
	}
	
	public Object set(int index, Object obj) {
		if (index < 0 && index >= length) {
			throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");			
		}
		Bucket cursor = start;
		
		for(int i = 0; i < index; i++) {
			cursor = cursor.next;
		}
		
		Object oldValue = cursor.value;
		cursor.value = obj;
		
		return oldValue;
	}
 }