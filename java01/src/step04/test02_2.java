/* 문장:조건문 switch- break */
package step04;

public class test02_2 {
  public static void main(String[] args) {
   int a = 10;
   int b = 20;
   char c = '+';
   
   switch (c) {
   case '+':
     System.out.println(a + b);
     break;
   case '-':
     System.out.println(a - b);
     break;
   case '*':
     System.out.println(a * b);
     break;
   case '/':
     System.out.println(a / b);
     break;
   case '%':
     System.out.println(a % b);
   default:
     System.out.println("해당 연산자를 지원하지 않습니다.");
   }
 }
}
