/*변수 선언 : 변수의 범위*/
package step02;

//public int i = 100; //컴파일 오류
public class Test18 {
	static int a = 10; // 클래스 안에서 무제한 사용
	
	public static void main(String[] args) {
    System.out.println(a);
    m1(30);
    System.out.println(a);
    
    int b = 20;
  }
   
   public static void m1(int c) {
  	/* 변수 c
  	 * => m1() 메서드 안에서 사용!
  	 * 
  	 * 
  	 *    */
  	 //d = 50; // 자바는 호이스팅 을 지원하지않는다. 컴파일오류
  	 
    int d = 40;
    a = 200;
   }
}
