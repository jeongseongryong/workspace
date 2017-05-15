/* 클래스 로딩 절차
 * 
 */
package step07;

public class Test01_3 {

  static class Student {
    static String name;
    static int age;
    static boolean working;
    
    static void m1() {}
  }
  public static void main(String[] args) {
  	System.out.println(Student.name);
  	System.out.println(Student.age);
  	System.out.println(Student.working);
  	
  	Student.name = "홍길동";
  	Student.age = 20;
  	Student.working = true;
  	
  	System.out.println(Student.name);
  	System.out.println(Student.age);
  	System.out.println(Student.working);
  	
  	int a;
  	
  	//System.out.println(a); // 초기화 시키지않고 사용하려면 컴파일 오류
  }
}
