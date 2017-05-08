/* 비트논리연산자 응용 
 * 
 */
package step03;

public class Test03_5 {
  public static void main(String[] args) {
    int a = 0b111;
    int b = 0b100;
    int c = 0b001;
    
    final int READ = 0b100;
    final int WRITE = 0b010;
    final int EXEC = 0b001;
    
    System.out.println((a & WRITE) == WRITE);
    System.out.println((b & WRITE) == WRITE);
    System.out.println((c & WRITE) == WRITE);
    
  }
}