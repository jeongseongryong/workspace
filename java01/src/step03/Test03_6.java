/* 비트 이동 연산자 (>>, >>>, <<)
 * 
 */
package step03;

public class Test03_6 {
  public static void main(String[] args) {
    int a = 0b0000_1011;
    
    System.out.println(a);
    System.out.println(a >> 1); // => 0000_0101|1  (a / 2^1)
    System.out.println(a >> 2); // => 0000_0010|11  (a / 2^2)
    System.out.println(a >> 3); // => 0000_0001|011  (a / 2^3)
    
    System.out.println(-10 >> 2); // 음수
    System.out.println(-10 >>> 2); // 양수
    
    System.out.println(a << 1); // => 0000_0110  (a / 2^1)
    System.out.println(a << 2); // => 0010_1100  (a / 2^2)
    System.out.println(a << 3); // => 0101_1000  (a / 2^3)
  }
}