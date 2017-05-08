/* 문장:조건문  */
package step04;

public class test02_3 {
   enum Level {
  	 GUEST, MEMBER, ADMIN;
   }
	
  public static void main(String[] args) {
   byte b = 10;
   short s = 10;
   int i = 10;
   long l = 10;
   float f = 10;
   double d = 10;
   boolean bool = true;
   char c = '가';
   String str = "오호라";
   
   // 4바이트 크기의 정수 값 가능!
   switch (b) {}
   switch (s) {}
   switch (i) {}
 //switch (l) {} // 8바이트 크기의 정수 값 안됨. 컴파일 오류
   switch (c) {}
 //switch (f) {} // 부동소수점 안됨. 컴파일 오류
 //switch (d) {} // 부동소수점 안됨. 컴파일 오류
 //switch (bool) {} // boolean 값 안됨. 컴파일 오류
   
   // 문자영 (java 1.7 부터 가능)
   switch (str) {}
   
   //enum 타입(enumeration ,열거형) 가능 =>결국 4바이트 정수 값이다.
   switch (Level.GUEST) {}
 }
}