/* 연산자 : 산술 연산자(+,-,/,*,%): 정수 연산의 최소 단위는 int이다.
 * 
 */
package step03;

public class Test01_2{

  public static void main(String[] args) {
   byte b1 = 10;
   byte b2 = 20;
   byte b3 = 10 + 20; 
   
   //byte b33 = 10 + 118; //컴파일오류
   
//   byte b4 = b1 + b2; //컴파일오류
//   byte b5 = b1 + 20; //컴파일오류
//   byte b6 = 10 + b2; //컴파일오류
   /*변수와 변수, 변수와 상수의 연산 결과는 변수이다.
    * 왜? 변수의 값에 따라 결과가 달라지기 때문에 당연히 그 결과는 변수일 수 밖에 없다.
    * 
    *
    */
   
   int i1 = 10;
   int l1 = 20;
   //int i2 = i1; // 연산 결과는 long이다.
   long l2 = i1 + 1;
   float f1 = 10.0f;
   
   float f2 = f1 + l1;
   float f3 = f1 + l2;
  		 
   
   
  }

}