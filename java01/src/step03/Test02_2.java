/* 증가/감소 연산자 - 전위 및 후위 연산자 차이점
 * 
 */
package step03;

public class Test02_2 {

  public static void main(String[] args) {
    //1)전위(prefix)연산자
    int i = 10;
    int x = ++i; 
    System.out.printf("i = %d, x = %d\n", i, x);
    
    //2 후위(postfix)연산자
    i = 10;
    
    x = i++; 
    System.out.printf("i = %d, x = %d\n", i, x);
    
  }
}