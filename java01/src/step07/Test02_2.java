/* 인스턴스 변수 클래스 변수
 * 
 * 
 */
package step07;

public class Test02_2 {

  static class Student {
  	static int guest = 0;
  	static int member = 1;
  	static int admin = 2;
  	
     String name;
     int age;
     boolean working;
     int level;
  }
  public static void main(String[] args) {
  	Student s1 = new Student();
  	Student s2 = new Student();
 
  	s1.name = "홍길동";
  	s1.age = 20;
  	s1.working = true;
  	s1.level= Student.guest;
  	
  	s2.name = "임꺽정";
  	s2.age = 30;
  	s2.working = true;
  	s2.level= Student.admin;
  }
}
