/* 인스턴스 변수
 * 
 */
package step07;

public class Test02_1 {

  static class Student {
     String name;
     int age;
     boolean working;
  }
  public static void main(String[] args) {
  	Student s1 = new Student();
  	Student s2 = new Student();
  	System.out.println(s1.name);
  	System.out.println(s1.age);
  	System.out.println(s1.working);
  	System.out.println("------------------------");
  	s1.name = "홍길동";
  	s1.age = 20;
  	s1.working = true;
  	
  	System.out.println(s1.name);
  	System.out.println(s1.age);
  	System.out.println(s1.working);
  	System.out.println("------------------------");
  	
  	System.out.println(s2.name);
  	System.out.println(s2.age);
  	System.out.println(s2.working);
  	

  	int a;
  	
  	//System.out.println(a); // 초기화 시키지않고 사용하려면 컴파일 오류
  }
}