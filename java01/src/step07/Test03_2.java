/* 초기화 블록: 스태틱 블록 
 * => 인스턴스가 생성된 후 자동으로 실행하는 블록
 * => 한 클래스 안에 여러개의 인스턴스 블록을 넣을 수 있다.
 * => 인스턴스 생성한 후, 생성자가 호출되기 전에
 *    인스턴스 블록이 선언된 순서대로 실행한다.
 * => 문법
 *    {...}
 * => 용도
 *    인스턴스 변수를 초기화 시키는 코드를 둔다.
 *    어떤 생성자가 호출되든 그전에 공통으로 초기화 시키고 싶은
 *    작업이 있다면 인스턴스 블록에서 처리하면된다.
 */
package step07;

public class Test03_2 {
  static class Student {
     static String name= "홍길동";
     int age =20;
     static { 
    	 System.out.println("static {...}");
     }
     
     { // 인스턴스 블록
    	 System.out.println(age);
    	 System.out.println("{인스턴스 블록 실행1}"); 
    	 this.age = 30;
     }
     
     {
    	 System.out.println("{인스턴스 블록 실행2}");
     }
  }
  
  public static void main(String[] args) {
  	new Student();
  	System.out.println("----------------------");
  	new Student();
  }
}