/* 연산자 : 산술 연산자(+,-,/,*,%)
 * 
 */
package step03;

public class Test01_1 {

  public static void main(String[] args) {
    System.out.println(10 + 3);
    System.out.println(10 - 3);
    System.out.println(10 * 3);
    
    System.out.println(10 / 3);
    // 결과: 3 이유?
    //int / int = int 이기떄문이다.
    System.out.println(10 % 3);
  }

}