/* 메서드 : 반복 실행해야 하는 코드를 묶어 둔 블록*/
package step05;

public class Test02 {
  public static void m1() {
    System.out.println("m1()");
  }
  
  
  public static void m2(int a, String str, boolean b){
    System.out.printf("%d, %s, %b\n", a, str, b);
  }
   
   
   public static String m3() {
     //return 10; // 오류
     return "Hello";
   }
     // return 문을 실행하는 순간 메서드 호출은 끝 따라서 return 문장 다음 명령문 작성 X
    //System.out.println("안된다"); // 오류
   public static int m4(int a){
  	 return a * a;

   }
   
   public static void main(String[] args) {
    m1();
    m2(10, "홍길동", false);
    String value = m3();
    System.out.println(value);
    
    int result = m4(16);
    System.out.println(result);
   }
   
  }
