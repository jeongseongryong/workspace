/* 비트논리연산자 - (&, | , ^, ~)
 * 
 */
package step03;

public class Test03_4 {
  public static void main(String[] args) {
    int a = 0b1100_1010;
    int b = 0b0101_0101;
    
    int r = a & b;
    String str = Integer.toBinaryString(r);
    System.out.println(str);
    
    r = a | b; 
    System.out.println(Integer.toBinaryString(r));
    
    r = a ^ b;
    System.out.println(Integer.toBinaryString(r));
    
    r = ~a;
    System.out.println(Integer.toBinaryString(r));
  }
}