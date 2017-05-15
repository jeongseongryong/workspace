/*유틸리티 클래스 : object - toString()
 *
 */
package step08;

public class Test03_3  {
	static class Student1  {
		String name;
		int age;
	}
	
	static class Student2 {
		String name;
		int age;
		
		public boolean equals(Object obj) {
			if (!(obj instanceof Student2)) return false; 

			Student2 other = (Student2)obj;
			
      if(this.name.equals(other.name)) return false;
      if(this.age != other.age) return false;
      
      return true;
		}		
	}
	
	public static void main(String[] args){
		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.age = 20;
		
		Student1 s2 = new Student1();
		s2.name = "홍길동";
		s2.age = 20;
		
		System.out.println(s1 == s2); // 당연히 주소는 다른다
		System.out.println(s1.equals(s2)); //object 의 equals()는 주소를 비교 결국 == 이거랑같다
	}
}
	
	


