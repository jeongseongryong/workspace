/* 연산자 : 산술 연산자(+,-,/,*,%): 정수 연산의 최소 단위는 int이다.
 * 
 */
package step03;

public class Test01_3 {

  public static void main(String[] args) {
   int a = 5;
   int b = 2;
   float f =a / b;
     System.out.println(f);
   
   float f2 =(float)a / (float)b; 
   System.out.println(f2);
   
   
   float f3 =(float)a / b; //float /int =float/ (float) = (float)
   System.out.println(f3);
   
   float f4 =a / (float)b; //float /int =float/ (float) = (float)
   System.out.println(f4);
  }

}