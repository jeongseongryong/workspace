/*변수 선언 : 변수의 범위 2*/
package step02;

//public int i = 100; //컴파일 오류
public class Test19 {
	static int a = 10; // 클래스 안에서 무제한 사용
	
	public static void main(String[] args) {
    int a = 10;
    {
    //int a = 20; //컴파일 오류
      int b = 20;
      System.out.println(b);
      System.out.println(a);
    }
    //System.out.println(b); //컴파일 오류
  }
}