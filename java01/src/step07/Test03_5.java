/* 초기화 블록: 생성자 3 
 * 
 * 
 * 오버로딩
 */
package step07;

public class Test03_5 {
  static class Student {
  	 int age = 20;

     Student() {
    	 System.out.println("Student()...호출");
     }
   
     Student(int a) {
    	 System.out.println("Student(int)...호출");
    	 this.age = a;
     }
     
     // 데이터 타입은 같은데 변수명이 다르다?
     // 호출 할때 어떤 생성자를 호출할지 구분할 수 없기 때문에
     // 이런 문법은 허용하지않음
     /*Student(int b) {
    	 System.out.println("Student(int)...호출");
    	 this.age = a;
     }
     */
     Student(int a, String n) {
    	 System.out.println("Student(int)...호출");
    	 this.age = a;
     }
     
     Student(String n, int a) {
    	 System.out.println("Student(int)...호출");
    	 this.age = a;
     }
  }
  
  public static void main(String[] args) {
  	new Student(); // 호출될 생성자는 넘겨주는 값의 개수와 타입으로 결정된다.
  	new Student(20);
  	//new Student(20L); // long 값을 받는 생성자가 없다. 컴파일 오류!
  	//new Student(true); // boolean 값을 받는 생성자가 없다. 컴파일 오류!
  	new Student("홍길동", 20);
  	new Student(20, "홍길동");
  }
}
