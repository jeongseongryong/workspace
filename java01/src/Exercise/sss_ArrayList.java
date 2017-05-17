package Exercise;

 class sss_ArrayList {
	 public static final int DEFAULT_SIZE = 10;
	 public static final int GROW_SIZE = 1000;
	 
	 private Object[] list;
	 private int length;
	 
	 public sss_ArrayList() {
		 list = new Object[DEFAULT_SIZE];
	 }
	 public sss_ArrayList(int capacity) {
		if(capacity < DEFAULT_SIZE || capacity > GROW_SIZE) {
			list = new Object[10];
		} else {
			list = new Object[capacity];
			
		}
 }
	public void add(Object obj) {
		list[length++] = obj;
		if (length == list.length) {
			increaseList();
		}		
	}
	 public void add(int index, Object obj) {
		 if(length == list.length) {
			 increaseList();
		 }
		 if(index < 0 || index > length) {
			 throw new RuntimeException("인덱스 번호가 범위를 넘어감");
		 }
		 if (index < length) {
			 for(int i = length; i > index; i--) {
				 list[i] = list[i - 1];
			 }
		 }
		 list[index] = obj;
		 length++;
	 }
	private void increaseList() {
		Object[] newList = new Object[list.length + GROW_SIZE];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		list = newList;
	}
	public int size() {
		return length;
	}
	
	public Object get(int index) {
		if (index < 0 && index >=  length) {
			throw new RuntimeException("배열 인덱스 범위를 벗어남");
		}
		return list[index];
	}
	public Object remove(int index) {
		if(index < 0 && index >= length) {
			throw new RuntimeException("배열 인덱스의 범위를 벗어났습니다");
		}
		Object removedObj = list[index];
		
		if(index < (length -1)) {
			for (int i = index; i <(length -1); i++) {
				list[i] = list[i+1];
			}
		}
		length --;
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